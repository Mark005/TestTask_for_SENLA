import java.util.Scanner;

public class TaskFouг {

    public void start() {
        System.out.println("Print the two numbers for which you want found HOK & HOD");
        Scanner inputNum = new Scanner(System.in);
        int inputNumOne = 0;
        int inputNumTwo = 0;
        try {
            inputNumOne = inputNum.nextInt();
            inputNumTwo = inputNum.nextInt();
        } catch (Exception e) {
            System.out.println("Input ERROR. Please print INTEGER NUMBER");
        }
            try {
                System.out.println("NOD = " + nod(inputNumOne, inputNumTwo));
                System.out.println("NOK = " + nok(inputNumOne, inputNumTwo, inputNumOne, inputNumTwo));
            }
            catch (Exception e){
                System.out.println(e.getMessage());
            }
    }

    private int nod(int inputOne, int inputTwo){
        if(inputOne != inputTwo){
                return nod(Math.max(inputOne, inputTwo) - Math.min(inputOne,inputTwo), Math.min(inputOne,inputTwo));
        }
        else return inputOne;
    }

    private int nok(int inputOne, int inputTwo, int inpO, int inpT){
        if(inputOne != inputTwo){
            return nok((Math.max(inputOne, inputTwo) - Math.min(inputOne,inputTwo)), Math.min(inputOne,inputTwo), inpO, inpT);
        }
        else return inpO*inpT/inputOne;
    }
}
