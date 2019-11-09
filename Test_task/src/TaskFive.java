import java.util.Scanner;

public class TaskFive {

    public void start() {
        System.out.println("Print the word which you want to check for palindrome");
        Scanner inputStr = new Scanner(System.in);
        String inputString = new String("");
        String rString = new String("");
        try {
            inputString = inputStr.next();
        } catch (Exception e) {
            System.out.println("Input ERROR. Please print the STRING");
        }
        rString = reverseString(inputString);
        System.out.println("Word is palindrome? " + inputString.equals(rString));
    }

    private String reverseString(String str){
        String revStr = "";
        char[] arr = str.toCharArray();
        for(int i=0; i<(str.length()); i++){
            revStr += arr[str.length()-1-i];
        }
        return revStr;
    }
}
