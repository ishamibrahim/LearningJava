import java.util.Date;

class Integer{
     private   int x;

    Integer(int i){
        x = i;
    }
    public int display(){return x;}
}

public class HelloWorld {

    public static void main(String [] args){

        System.out.println("Hello Isham");
        Integer a = new Integer(20);
        Integer b = new Integer(30);
//        b.x = 35;

        System.out.println("A : " + a.display() + "\nB : " + b.display());
        Date today = new Date();
        System.out.printf("Today is : %1$tB %1$td, %1$tA, %1$tY" , today);

        //Command line arguments
        for (String arg : args) {
            System.out.println("Command line argument : " + arg);
        }
    }
}
