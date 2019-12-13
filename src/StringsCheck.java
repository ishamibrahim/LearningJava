import java.util.Scanner;

public class StringsCheck {

    public void main(String [] args){
        String herName = "Ayisha Thafsiya";
        System.out.println("My name is " +  herName);
        System.out.println("What is your name ?");

        Scanner nameScanner = new Scanner(System.in);
        String yourName = nameScanner.next();
        System.out.println("Your name is " +  yourName.toUpperCase());
        System.out.println("Your name contains 'AL' : " + yourName.toUpperCase().contains("AL"));

        System.out.println("What is your age");
        int yourAge = nameScanner.nextInt();
        System.out.println("Your age is " + yourAge);


    }
}
