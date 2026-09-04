package Labs.Week_1.scr;
import java.util.Scanner;

public class Patterns {
    public static void main(String args[]){
        Scanner newScanner=new Scanner(System.in);

        System.out.print("SALES BAR CHART\n(Each * = $100)\n\n");

        for(int c=1;c<=5;c+=1){
            double numbStars;

            System.out.print("Enter today's sales for store "+c+": ");
            numbStars=newScanner.nextDouble()/100;
            System.out.print("\n");

            for(int s=1;s<=numbStars;s+=1){
                System.out.print("*");
            }

            System.out.print("\n");
        }

    }
}