import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexCheck {

    public static void main(String[] args){
        System.out.println("Testing regex \n");

        String pattern = "[0-9]{1,2}-[0-9]{1,2}-[0-9]{4}";
        String sentence = "The second world war ended in 14-06-1945 and 14-06-1845";

        Pattern patternRgx = Pattern.compile(pattern);
        Matcher matching = patternRgx.matcher(sentence);

        while (matching.find()){
            System.out.println("Found the date");
            System.out.println(matching.group());
        }
    }
}
