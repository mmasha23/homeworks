import java.util.Scanner;

public class TruangleArea {
    public static void main(String[] args) {
        System.out.println("enter coordinates of point A in x,y format:");
        Scanner scannerA = new Scanner (System.in);
        int aX = scannerA.nextInt();
        int aY = scannerA.nextInt();

        System.out.println("enter coordinates of point B in x,y format:");
        Scanner scannerB = new Scanner (System.in);
        int bX = scannerB.nextInt();
        int bY = scannerB.nextInt();

        System.out.println("enter coordinates of point C in x,y format:");
        Scanner scannerC = new Scanner (System.in);
        int cX = scannerC.nextInt();
        int cY = scannerC.nextInt();

        int area = (((aX*(cY-bY))+(bX*(aY-cY))+(cX*(bY-aY)))/2);

        if (area >=0) {
            System.out.println("the area is" + ": " + area);
        }else{
            System.out.println("the area is" + ": " + ((-1)*(area)));
        }



    }
}
