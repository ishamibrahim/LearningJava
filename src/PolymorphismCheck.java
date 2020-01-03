interface Communicate{
    void voice();
}


class Animal  {
    void voice(){
        System.out.println("Animal makes sound");
    }

}

class Owl  extends Animal implements Communicate{
    public void voice(){
        System.out.println("Owl hoots");
    }
}


public class PolymorphismCheck {

    public static void main(String[] args){
        Owl beauty = new Owl();
        Animal pig = new Owl();


        beauty.voice();
        pig.voice();
    }

}
