import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        System.out.println("Select the task number (from 1 to 6):");
        int taskNumber = 0;
        try {
            Scanner inputNum = new Scanner(System.in);
            taskNumber = inputNum.nextInt();
        }
        catch ( Exception e){
            System.out.println("Input ERROR. Please print INTEGER NUMBER of task");
        }

        switch (taskNumber) {
            case (1):
                TaskOne taskOne = new TaskOne();
                taskOne.start();
                break;
            case (2):
                TaskTwo taskTwo = new TaskTwo();
                taskTwo.start();
                break;
            case (3):
                TaskThree taskThree = new TaskThree();
                taskThree.start();
                break;
            case (4):
                TaskFouг taskFouг = new TaskFouг();
                taskFouг.start();
                break;
            case (5):
                TaskFive taskFive = new TaskFive();
                taskFive.start();
                break;
            case(6):
                TaskSix taskSix = new TaskSix();
                taskSix.start();
                break;
            default:
                System.out.println("Print a number from 1 to 6");
        }
    }
}
