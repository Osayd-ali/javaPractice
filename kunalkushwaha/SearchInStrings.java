package kunalkushwaha;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Osayd";
        char target = 'a';
        System.out.println(search(str, target));
    }
    public static boolean search(String str, char target){
        // return true if target is found in str else return false
        // Handling edge case when length of string is 0
        if(str.length() == 0){
            return false;
        }
        // traversing through each character of the string
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){ // if character at current index is equal to target
                return true; // return true
            }
        }
        return false; // target not found, return false
    }
}
