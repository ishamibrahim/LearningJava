import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.rmi.RemoteException;

class NewException extends IOException{
    private String errMessage;

    public String getError(){
        return this.errMessage;
    }

    public NewException(String errMessage){
         this.errMessage = errMessage;
    }
}

public class FileCheck {

    public static void main (String[] args)throws IOException {

        FileInputStream inFile = null;
        FileOutputStream outFile = null;

        try {
            inFile = new FileInputStream("etcetra/intexting.txt");
            outFile = new FileOutputStream("etcetra/outtexting.txt");

            int cpoint;

            while((cpoint=inFile.read()) != -1){
                outFile.write(cpoint);
            }
        } catch (IOException e){
            System.out.println("Exception = " +  e);

        } finally{
            if (inFile != null){
                inFile.close();
            }
            if (outFile != null) {
                outFile.close();
            }
        }


    }

}
