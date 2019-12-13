import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCheck {
    public static void main (String [] args){
        int [] numbers;

        numbers = new int[5];
        numbers[0] = 23;
        numbers[4] = 230;

        System.out.println("The numbers before are  " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println("The numbers after are  " + Arrays.toString(numbers));

        String[] pyaar = {"Maine", "pyaar", "tumse", "kiya"};
        System.out.println("The third word is  " + pyaar[2]);
        System.out.println("The number of words " + pyaar.length);

        pyaar[2] = "Kyun";
        System.out.println("The third word is  " + pyaar[2]);


        System.out.println(" song is  " + Arrays.toString(pyaar));

    }
}
