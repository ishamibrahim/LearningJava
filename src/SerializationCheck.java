import com.sun.jdi.ClassNotLoadedException;

import java.io.*;

class Worker implements Serializable{
    String name;
    String EmplyeID;
    int age;

    void display(){
        System.out.println("Employee " + this.name + " of age" + this.age);
    }
}



public class SerializationCheck {

    public static void main(String [] args){
        System.out.println("Testing serialization");

        Worker w1 = new Worker();
        Worker w2 = new Worker();
        w1.name = "Iyash";
        w1.age = 27;
        w1.EmplyeID = "ASD121";
        w2.name = "Niha";
        w2.age = 26;
        w2.EmplyeID = "ASD122";

        // Serialization
        try{
            FileOutputStream fo = new FileOutputStream("etcetra/workerData.ser");
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(w1);
            os.writeObject(w2);

            os.close();
            fo.close();
            System.out.println("Objects are saved in etcetra/workerData.ser");


        } catch (IOException i){
            i.printStackTrace();
        }

        Worker wrk1;
        Worker wrk2;
        // Deserialization

            try {
                FileInputStream fi = new FileInputStream("etcetra/workerData.ser");
                ObjectInputStream is = new ObjectInputStream(fi);

                while (true) {
                    try {
                        wrk1 = (Worker) is.readObject();
                        System.out.println("Object ");
                        wrk1.display();
                    } catch (EOFException err) {
                        System.out.println("Ending loop");
                        err.printStackTrace();
                        break;
                    }
                }

//                wrk2 = (Worker) is.readObject();
//                System.out.println("Object - 2");
//                wrk2.display();


                is.close();
                fi.close();
                System.out.println("Objects retrieved from etcetra/workerData.ser");


            } catch (IOException e) {
                e.printStackTrace();

            } catch (ClassNotFoundException c) {
                System.out.println("Class type object not found");
                c.printStackTrace();


            }



    }
}
