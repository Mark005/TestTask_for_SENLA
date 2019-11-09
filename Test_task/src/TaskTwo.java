import java.util.Scanner;

public class TaskTwo {
    public void start(){
        System.out.println("Print the number to which you want to calculate all Fibonacci numbers:");
        Scanner inputNum = new Scanner(System.in);
        int finishNumber = 0;
        try {
            finishNumber = inputNum.nextInt();
        } catch (Exception e) {
            System.out.println("Input ERROR. Please print INTEGER NUMBER");
        }
        if (finishNumber > 1){
            try {
                fibonacciNumbers(finishNumber, 0, 1);
            }
            catch ( Exception  e){
                System.out.println(e.getMessage());
            }
        }
        else System.out.println("Fibonacci numbers not gound");
    }

    private void fibonacciNumbers(int inputNum, int prev, int curr) {
        if(curr < inputNum){
            fibonacciNumbers(inputNum, curr, curr+prev);
            System.out.println(curr);
        }
    }
}
