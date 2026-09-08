import java.util.Scanner;

public class SalesBarChart{
    public static void main(String args[]){
        Scanner newScanner=new Scanner(System.in);
        System.out.print("Enter the number of stores: ");
        int stores=newScanner.nextInt();

        System.out.print("\n");

        String statement="";
        for(int c=1;c<=stores;c++){
            System.out.print("Enter the sales today for store "+c+": ");
            int stars=newScanner.nextInt()/100;

            statement=statement+"\nStore "+c+": ";

            for(int v=1;v<=stars;v++){
                statement=statement+"*";
            }
        }

        System.out.print("\nSALES BAR CHART\n(Each * = 100)"+statement);
    }
}