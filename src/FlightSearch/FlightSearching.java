package FlightSearch;

import Measurements.Units;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Flight {
    String flightNo;
    Places arr;
    Places dep;
    private Date depDate;
    private String depTime;
    double duration;
    Integer fare;
    boolean available;
    String seatClass;

    public  Flight( String num, String arrival, String departure){
        this.flightNo = num;
        this.arr = Places.valueOf(arrival);
        this.dep = Places.valueOf(departure);
    }
    public void addDateTime(String depdate, String deptime){
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
         try {
             //Parsing the String
             this.depDate = dateFormat.parse(depdate);
         } catch (ParseException e) {
             e.printStackTrace();
         }
         this.depTime = deptime;
    }

    public void addAvailability(String availChar) {
        this.available = availChar.equals("Y");
    }

    @Override
    public String toString() {
        return String.format("#  %s, Valid till : %s, departure at : %s, Duration : %.2f, Fare: %d, Avaliable : %s, Class %s",
                this.flightNo, this.depDate, this.depTime, this.duration, this.fare, this.available, this.seatClass);
    }

}
class FlightDurationCompare implements Comparator<Flight> {
    public int compare(Flight f1, Flight f2)
    {
        return Double.compare(f1.duration, f2.duration);
    }

}

class FlightFareCompare implements Comparator<Flight>{
    public int compare(Flight f1, Flight f2)
    {
        return Integer.compare(f1.fare, f2.fare);
    }
}
public class FlightSearching {

    static ArrayList<Flight> scanInputFile(String filepath){
        BufferedReader csvReader = null;
        String line ="";
        String csvSplitBy = ",";
        boolean skipHeader = true;
        ArrayList<Flight> flightList = new ArrayList<Flight>();

        try {
            csvReader = new BufferedReader(new FileReader(filepath));
            while ((line = csvReader.readLine()) != null) {
                String[] flightPlan = line.split(csvSplitBy);
                if (skipHeader){
                    skipHeader = false;
                } else {
                    Flight aFlight = new Flight(flightPlan[0], flightPlan[1], flightPlan[2]);
                    aFlight.addDateTime(flightPlan[3], flightPlan[4]);
                    aFlight.duration = Double.parseDouble(flightPlan[5]);
                    aFlight.fare = Integer.parseInt(flightPlan[6]);
                    aFlight.addAvailability(flightPlan[7]);
                    aFlight.seatClass = flightPlan[8];
                    flightList.add(aFlight);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flightList;
    }

    static HashMap<String, ArrayList<Flight>> createflightMap(ArrayList<Flight> flights){
        HashMap<String, ArrayList<Flight>> flightMap = new HashMap<String, ArrayList<Flight>>();
        for (Flight curFlight: flights){
            String key = curFlight.arr.getCode() + "-" + curFlight.dep.getCode();
            ArrayList<Flight> existingArray = flightMap.get(key);
            if (existingArray == null){
                ArrayList<Flight> flightArray = new ArrayList<Flight>();
                flightArray.add(curFlight);
                flightMap.put(key, flightArray);
            } else {
                existingArray.add(curFlight);
            }
        }
        return flightMap;
    }

    public static void main(String[] args){
        Places arrr = Places.valueOf("MUM");
        System.out.println("The value is " +  arrr.getCode());

        String csvFilepath = "etcetra/flight_details.csv";
        ArrayList<Flight> flights = scanInputFile(csvFilepath);
        HashMap<String, ArrayList<Flight>> flightMap = createflightMap(flights);

        System.out.println("Enter the place code of  arrival and departure with space in between \n ");
        Scanner placeScanner = new Scanner(System.in);
        String arrCode = placeScanner.next();
        String depCode = placeScanner.next();

        Places arrPlace ;
        Places depPlace;
        try {
            arrPlace = Places.valueOf(arrCode);
            depPlace = Places.valueOf(depCode);
        } catch (IllegalArgumentException e){
            e.printStackTrace();
            System.exit(1);
        }
        ArrayList<Flight> flightList = flightMap.get(arrCode + "-" + depCode);
        if (flightList != null) {
            System.out.println(String.format("Here are flights from %s to %s sorted by Duration", arrCode, depCode));
            FlightDurationCompare durationCompare = new FlightDurationCompare();
            flightList.sort(durationCompare);
            for (Flight curflight: flightList){
                System.out.println(curflight);
            }
            System.out.println(String.format("Here are flights from %s to %s sorted by Fare", arrCode, depCode));
            FlightFareCompare fareCompare = new FlightFareCompare();
            flightList.sort(fareCompare);
            for (Flight curflight: flightList){
                System.out.println(curflight);
            }
        } else {
            System.out.println("Flight list is null" );
        }

    }
}
