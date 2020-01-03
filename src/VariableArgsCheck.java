import java.sql.Time;
import java.util.Timer;
import java.util.concurrent.TimeUnit;

public class VariableArgsCheck extends Thread{

    public static void showArgs(int... actualArgs){
        // Classic for loop
        System.out.println("Classic loop");
        for(int i=0; i < actualArgs.length; i++){
            System.out.println(actualArgs[i]);
        }

        System.out.println("Enhanced loop");
        // Enhanced for loop
        for(int i: actualArgs){
            System.out.println(i);
        }
    }


    public static  void  main(String[] args){

        showArgs(1,2,3,4);
        try {
            TimeUnit.SECONDS.sleep(10);
        } catch (InterruptedException ex){
            System.out.println("Sleeping now");

        }
        System.out.println("Finished sleeping");

    }
}
