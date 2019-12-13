public class LamdaCheck {
    public static void main(String [] args){
        Psycho goodboy = () -> { return "one saint b*#*h!!";};
        System.out.println("He is " + goodboy.judge());

        Psycho badboy = () ->  "one bad mother f#$#@$";
        System.out.println("He is " + badboy.judge());


    }


}
