package Measurements;
import java.text.MessageFormat;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

class UnitConversion{

    static HashMap<Units, Double> getConversionMap(){
        HashMap<Units, Double> conversionMap = new HashMap<Units, Double>();
        conversionMap.put(Units.CC, 0.001);
        conversionMap.put(Units.LITRE, 1.0);
        conversionMap.put(Units.ML, 0.001);
        conversionMap.put(Units.TSPOON, 0.0059);
        conversionMap.put(Units.GALLON, 3.785);
        conversionMap.put(Units.PINT, 0.473);
        return conversionMap;
    }



    static Double convert(Units ipType, Units opType, Double quantity){
        HashMap<Units, Double> conversionMap = getConversionMap();
        Double ipMultiple= conversionMap.get(ipType);

        Double inputLitre  = ipMultiple * quantity;
        Double opMultiple = conversionMap.get(opType);
        Double opVal = inputLitre / opMultiple;

        return opVal;
    }

}

class Measurement{

    static Units getInputType() throws IllegalArgumentException{
        Scanner unitScan = new Scanner(System.in);
        String inputType = unitScan.next();
        Units inputUnit = null;

        for (Units unitType: Units.values()){
            if ( unitType.getValue().equals(inputType) ){
                if(unitType != Units.INVALID) {
                    inputUnit = unitType;
                    break;
                }
            }
        }
        if(inputUnit == null) {
            throw new IllegalArgumentException("Invalid type" + inputType);
        }

        return inputUnit;

    }

    

}


public class MeasurementConversion {


    public static void main(String[] args) {
        System.out.println("Enter the unit to change from - One of " + java.util.Arrays.asList(Units.values()));
        Units inputType = Measurement.getInputType();

        Scanner inputScan = new Scanner(System.in);
        System.out.println("Enter the quantity");
        double input =  inputScan.nextInt();

        System.out.println("Enter the unit to change to - One of " + java.util.Arrays.asList(Units.values()));
        Units outputType = Measurement.getInputType();
        Double opVal = UnitConversion.convert(inputType, outputType, input);


        MessageFormat fmt = new MessageFormat("{0} {1}'s equals {2} {3}'s");
        System.out.println(String.format("%.2f %s's equals %.2f %s's", input, inputType.getValue(), opVal, outputType.getValue()) );


    }
}






