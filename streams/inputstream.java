//Demonstration of input stream
package streams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class inputstream {
    public static void main(String[] args){
        try{
            FileInputStream f1 = new FileInputStream("/Users/mirhamedali/Desktop/java/streams/Output.txt");
            byte b[] = new byte[f1.available()];
            f1.read(b);
            String str1 = new String(b);
            System.out.println(str1);
        }
        catch(FileNotFoundException e){
            System.out.println(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}