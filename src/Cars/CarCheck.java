package Cars;

import java.awt.*;

public class CarCheck {
    public static void main(String[] args){
        System.out.println("Checking out different cars");

        Car myCar = new Car(25, "KA21PM2019", Color.GREEN, false);
        SedanCarType mySedan = new SedanCarType(20, "KA20FU37", Color.BLACK,
                false, 500.5);

        myCar.steering();
        mySedan.steering();
    }
}
