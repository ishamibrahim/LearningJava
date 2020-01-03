class Outer{
    String show = "Outer ";


    public class Inner{
        String show = "Inner";

        void showString(){
            System.out.printf("Showing %s class\n", this.show);
        }
    }

    void showString(){
        System.out.printf("Showing %s class\n", this.show);
    }
}




public class InnerClass {

    public static void main (String[] args){
        System.out.println("Inner classes demo ");

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();

        outer.showString();
        inner.showString();

    }
}
