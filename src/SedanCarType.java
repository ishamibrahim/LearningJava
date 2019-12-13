import java.awt.*;

public class SedanCarType  extends Car{
    double trunkSpace;

    public SedanCarType(int inputMileage, String inputLicencePlate, Color inputPaint,
                        boolean inputTransmission, double trunkSpace){
        super(inputMileage, inputLicencePlate, inputPaint, false);
        this.trunkSpace = trunkSpace;
    }

    public void steering(){
        System.out.println("Power steering");
    }

}
