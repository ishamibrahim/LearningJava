import com.sun.net.httpserver.Authenticator;

class SuperClass{
    int doodle;
     SuperClass(){
        doodle = 10;
        System.out.println("What can I say? - Doodle is " + doodle);
    }

    void display(){
        System.out.println("Display method of super called");
    }


}

class SubClass extends SuperClass{

     SubClass(){
        super();
        doodle = super.doodle + 10;


        System.out.println("What can I say again? - Doodle is " + doodle);
    }

    void display() {
        System.out.println("Display method of Subclass called");
    }

    void execute(){
        System.out.println("Difference below");

        SubClass sub = new SubClass();

        sub.display();
        super.display();
    }
}

public class SuperClassCheck {
        public static void main (String [] args){

            SubClass subDeep = new SubClass();
            //subDeep.execute();

        }
}
