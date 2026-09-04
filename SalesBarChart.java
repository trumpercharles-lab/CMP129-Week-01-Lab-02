package Labs.Week_1.scr;

public class SalesBarChart {
    public static void main(String args[]){
        for (int c=1;c<=10;c+=1) {
            for (int v=1;v<=c;v+=1){
                System.out.print("*");
            }

            System.out.print("\n");
        }

        for (int c=1;c<=10;c+=1) {
            for (int v=10;v>=c;v-=1){
                System.out.print("*");
            }

            System.out.print("\n");
        }
    }
}
