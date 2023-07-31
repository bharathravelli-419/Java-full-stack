import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int n = sc.nextInt(); // for n= 5 
       
       for(int i=0;i<(n/2 +1);i++){
        for(int j =i;j<n/2;j++){
            System.out.print(" ");
        }
        System.out.print("*");
        for(int j =0;j<(2*(i-1) +1);j++){
            
            System.out.print(" ");
        }
        if(i !=0)
        System.out.print("*");

        System.out.println();

       }

       //for Lower Triangle

       for(int i=0;i<n/2;i++){
        for(int j =0;j<(i+1);j++){
             System.out.print(" ");
        }
        System.out.print("*");
        
        for(int j =0;j< (2*(n/2-i-1) -1);j++){
            System.out.print(" ");
        }
        if(i != n/2 -1)
        System.out.print("*");

        System.out.println();
       
         
       }
       //output :
       /*
  *
 * *
*   *
 * *
  *

Above one is a hollow diamond

        */


       sc.close();
    }
}
