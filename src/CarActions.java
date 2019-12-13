import java.awt.*;

public class CarActions {

    public static void main(String [] args){
        System.out.println("Creating car details");
        Car myCar = new Car(35, "KA05KK7147",
                 Color.BLACK, false);

        Car nickysCar =  new Car(18, "KA01MJ3013",
                Color.BLACK, true);

        System.out.println("My car  number " + myCar.licencePlate);
        System.out.println("Nickys car  number " + nickysCar.licencePlate);

        System.out.println("Paint Color before " + myCar.paintWork.toString());
        myCar.changePaint(Color.RED);
        System.out.println("Paint Color after " + myCar.paintWork.toString());

        int carSpeed = 45;
        carSpeed = myCar.changeSpeed(carSpeed);
        System.out.println("New speed: "  + carSpeed);
    }
}
