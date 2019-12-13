import java.awt.*;

public class Car {
    int mileage;
    String licencePlate;
    Color paintWork;
    boolean automatic;


    public Car(int inputMileage, String inputLicencePlate, Color inputPaint, boolean inputTransmission){
        this.mileage = inputMileage;
        this.licencePlate = inputLicencePlate;
        this.paintWork = inputPaint;
        this.automatic = inputTransmission;
    }

    public  void changePaint(Color newColor){
        this.paintWork = newColor;
    }

    public int changeSpeed(int currentSpeed) {
        currentSpeed =  currentSpeed * 2;

        return currentSpeed;
    }

    public void steering(){
        System.out.println("Car steering");
    }
}
