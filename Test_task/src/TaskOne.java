import java.util.ArrayList;
import java.util.Scanner;

class TaskOne{

    public void start() {
        TaskOne test = new TaskOne();
        System.out.println("Print the number to which you want to calculate all simple numbers:");
        Scanner inputNum = new Scanner(System.in);
        ArrayList<Integer> simpleNums = null;
        try {
            simpleNums = TaskOne.getArrSimpleNums(inputNum.nextInt());
        } catch (Exception e) {
            System.out.println("Input ERROR. Please print INTEGER NUMBER");
        }
        if (simpleNums!=null && simpleNums.size() != 0) {
            for (int i = 0; i < simpleNums.size(); i++) {
                int number = simpleNums.get(i);
                System.out.println(number);
            }
            System.out.println("[+]" + simpleNums.size() + " Simple numbers was found");
        } else System.out.println("Simple numbers not found");
    }

    private static ArrayList<Integer> getArrSimpleNums(int input){
        boolean isSimple = true;
        ArrayList<Integer> simpleNum = new ArrayList<Integer>(0);
        for(int checkNum = 2; checkNum<input; checkNum++){
            isSimple = true;
            for(int dev = 2; dev<checkNum; dev++) {
                if (checkNum % dev == 0) {
                    isSimple = false;
                    break;
                }
            }
            if(isSimple)
                simpleNum.add(checkNum);
        }
        return simpleNum;
    }
}
