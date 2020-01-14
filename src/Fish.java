class Fishes{
    int gillsCount;
    public Fishes(int gillsCount){
        this.gillsCount = gillsCount ;
    }

    public  void swim(){
        System.out.println("Fishes swim using fins");
    }
    public  void breathe(){
        System.out.println("Fishes breathe through gills");
    }
}


class Whales extends Fishes{
    public Whales(){
        super(0);
    }

    public void swim(){
        System.out.println("Whales swim using flippers");
    }

    public void breathe(){
        System.out.println("Whales breathe through lungs and blowhole");
    }
}


class Crustaceans extends Fishes{
    public Crustaceans(){
        super(1);
    }

    public void swim(){
        System.out.println("Crustaceans swim using their legs");
    }

    public void breathe(){
        System.out.println("Crustaceans breathe through gills");
    }
}


