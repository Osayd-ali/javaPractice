//Demonstration of output stream
package streams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class outputstream {
    public static void main(String[] args){
        try{
        FileOutputStream opt = new FileOutputStream("/Users/mirhamedali/Desktop/java/streams/Output.txt"); //Creating a new file so that we send or write in it. Also creating object of output Stream.
        String str = "Learn Java Programming";
        opt.write(str.getBytes());
        opt.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e){
            System.out.println(e);
        }
    }
}
