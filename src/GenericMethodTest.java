


public class GenericMethodTest {
    public static <E> void printArray(E[] inputArray){
        for(E element: inputArray){
            System.out.println("Element is " + element);
        }

    }


    public static void main(String[] args){
        System.out.println("Testing generic methods");

        Integer[] numbers = new Integer[10];
        numbers[0] = new Integer(12);
        Double[] points = {1.1, 2.2, 3.3, 4.4};
        Character[] characters = {'O', 'T', 'I', 'F', 'V'};


        System.out.println("Printing integers");
        printArray(numbers);

        System.out.println("Printing doubles");
        printArray(points);

        System.out.println("Printing characters");
        printArray(characters);

    }
}
