import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

        /*
            int nextInt()
            float nextFloat()
            double nextDouble()
            String nex()  ---> this is just for a word input
            String nextLine()
            byte nextByte()
            short nextShort()
            long nextLong()
            bool nextBoolean()
            bool hasNextInt()
            bool hasNextFloat()
            etc...
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers for addition ");
        int i = sc.nextInt();//12
        int j = sc.nextInt();//13

        System.out.println(i+j+" is the sum of two variables");//25 is the sum of two variables
       
       /*
       Primitive Data Types
       1.Integral
         byte
         short
         int 
         long
       2.Floating Point
         Float
         Double
       3.Character
         char
       4.Boolean
         boolean 
        
        */


        System.out.println(Integer.MAX_VALUE+" "+Integer.MIN_VALUE+" "+Integer.BYTES);//2147483647 -2147483648 4
        System.out.println(Float.MAX_VALUE+" "+Float.MIN_VALUE+" "+Float.BYTES);//3.4028235E38 1.4E-45 4
        
        int i1= 10;//decimal
        int i2 = 0b1010;//Binary 
        int i3 = 012;//Octal
        int i4 = 0xA;//Hexa Decimal
        System.out.println(i1+" "+i2+" "+i3+" "+i4);// 10 10 10 10

        long l = 99_99_999;//valid for better readability
        System.out.println(l);

        System.out.println(Integer.toBinaryString(i4));//1010
    


       sc.close();// It is a better programming practice to CLOSE the Scanner Object.
    }
}
