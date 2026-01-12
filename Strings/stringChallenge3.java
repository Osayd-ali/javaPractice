// Remove special characters from  a string.
// Remove extra spaces from string.
// Find number of words in a string.
package Strings;
import java.lang.*;
public class stringChallenge3 {
    public static void main(String[] args)
    {
        String str = "a!b@C#d%";
        String str2 = "abc de fg hi";
        String str_chars = str.replaceAll("\\W*", ""); // assigning the replaced string consisting of only characters in a new variable.
        // we can also use RE: [^a-zA-Z0-9] that means if its not a character or uppercase char or number then the remaining items must be replaced.
        System.out.println(str_chars);
        System.out.println(str2.replaceAll("\\s+", ""));
        String words[] = str2.split("\\s"); //splits the string in different words by seeing spaces around words,storing it in an array.
        System.out.println(words.length); 
    }
}
