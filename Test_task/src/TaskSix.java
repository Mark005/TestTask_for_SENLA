import java.util.Scanner;

public class TaskSix {
    public void start() {
        System.out.println("Print the line which you want to clean from numbers");
        Scanner inputStr = new Scanner(System.in);
        String inputString = new String("");
        String nString = new String("");
        try {
            inputString = inputStr.nextLine();
        } catch (Exception e) {
            System.out.println("Input ERROR. Please print the STRING");
        }
        nString = cleanString(inputString);
        System.out.println(nString);
    }

    private String cleanString(String str){
        String cleanStr = "";
        char[] arr = str.toCharArray();
        for(int i = 0; i<(str.length()); i++){
            if(arr[i]>='0' && arr[i]<='9'){}
            else cleanStr += arr[i];
        }
        return cleanStr;
    }
}
