abstract class Aquatic{
    int gillsCount;
    public Aquatic(int gillsCount){
        this.gillsCount = gillsCount ;
    }

    public abstract void swim();
    public abstract void breathe();
}


class Whale extends Aquatic{
    public Whale(){
        super(0);
    }

    public void swim(){
        System.out.println("Whales swim using flippers");
    }

    public void breathe(){
        System.out.println("Whales breathe through lungs and blowhole");
    }
}


class Crustacean extends Aquatic{
    public Crustacean(){
        super(1);
    }

    public void swim(){
        System.out.println("Crustaceans swim using their legs");
    }

    public void breathe(){
        System.out.println("Crustaceans breathe through gills");
    }
}

public class AbstractClassCheck {

    public static void main(String[] args){
        System.out.println("Checking abstract class and methods" );

        Aquatic aWhale = new Whale();
        Aquatic aCrustacean = new Crustacean();

        aWhale.swim();
        aWhale.breathe();
        aCrustacean.swim();
        aCrustacean.breathe();

    }


}
