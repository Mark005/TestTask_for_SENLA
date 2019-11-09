import java.util.Scanner;

public class TaskThree {
    public void start(){
        System.out.println("Print the the coordinates of the segments");
        Scanner inputNum = new Scanner(System.in);

        int ax1 = 0,ax2 = 0,ay1 = 0,ay2 = 0;
        int bx1 = 0,bx2 = 0,by1 = 0,by2 = 0;
        try {
            System.out.println("Print coordinate of the first point of the first segment X and Y");
            ax1 = inputNum.nextInt();
            ay1 = inputNum.nextInt();
            System.out.println("Print coordinate of the second point of the first segment X and Y");
            ax2 = inputNum.nextInt();
            ay2 = inputNum.nextInt();
            System.out.println("Print coordinate of the first point of the second segment X and Y");
            bx1 = inputNum.nextInt();
            by1 = inputNum.nextInt();
            System.out.println("Print coordinate of the second point of the second segment X and Y");
            bx2 = inputNum.nextInt();
            by2 = inputNum.nextInt();
        }
        catch (Exception e) {
            System.out.println("Input ERROR. Please print INTEGER NUMBER");
        }
        System.out.println("Segments are intersect? " + lineIntersect(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2));

    }

    private boolean lineIntersect(int ax1, int ay1, int ax2, int ay2, int bx1, int by1, int bx2, int by2){
        int v1=(bx2-bx1)*(ay1-by1)-(by2-by1)*(ax1-bx1);
        int v2=(bx2-bx1)*(ay2-by1)-(by2-by1)*(ax2-bx1);
        int v3=(ax2-ax1)*(by1-ay1)-(ay2-ay1)*(bx1-ax1);
        int v4=(ax2-ax1)*(by2-ay1)-(ay2-ay1)*(bx2-ax1);

        int a1 = ay2 - ay1;
        int b1 = ax1 - ax2;
        int c1 = ax1*(ay1 - ay2) + ay1*(ax2 - ax1);
        int a2 = by2 - by1;
        int b2 = bx1 - bx2;
        int c2 = bx1*(by1 - by2) + by1*(bx2 - bx1);

        int d = a1*b2 - a2*b1;
        int dx = -c1*b2 - (-c2)*b1;
        int dy = a1*(-c2) - a2*(-c1);
        if(d!=0 && (0>v1*v2 && 0>v3*v4)|| (v1==0 || v2==0 || v3==0 || v4 ==0)){
            return true;
        }
        else return false;
    }
}
