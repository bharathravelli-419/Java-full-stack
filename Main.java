import java.util.Scanner;
public class Main{
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       //String Initialization types


       //assigning a String Literal 
       String s1 = "Bharath Ravelli";

       //Using String class
       String s2 = new String("Tejaswi Ravelli");

      //using character array
      char[] arr= {'V','i','j','a','y','a'};
      String s3 = new String(arr);

      //Using a byte array 
      String s4 = new String(new byte[]{65,66,67,68});
      System.out.println(s1+"\n"+s2+"\n"+s3+"\n"+s4);
      System.out.println();
      System.out.println("Some important methods on Strings :");

      System.out.println(
        "int length():"+ s1.length()+"\n"+
        "String toLowerCase():"+ s1.toLowerCase()+"\n"+
        "String toUpperCase():"+s1.toUpperCase()+"\n"+
        "String trim():"+"  spaces ".trim()+"\n"+
        "String substring(int begin):"+ s1.substring(2)+"\n"+
        "String substring(int begin,int end):"+s1.substring(2,5)+"\n"+
        "String replace(char old):"+s1.replace('a','r')+"\n"+
        "char charAt(int ind):"+s1.charAt(0)+"\n"+
        "boolean startsWith(String s,int ind):"+s1.startsWith("R", 8)+"\n"+
        "boolean endsWith(String s,int ind):"+s1.endsWith("lli")+"\n"+
        "int indexOf(String s):"+s1.indexOf("Ravelli")+"\n"+
        //"int lastIndexOf(String s)"
        "boolean equals(String s):"+ s1.equals("Bharath Ravelli")+"\n"+
        "boolean equalsIgnoreCase(String s):"+s1.equals("Bharathravelli")+"\n"+
        "int compareTo(String s):"+s1.compareTo(s2)+"\n"+
        "boolean contains(String str)"+s1.contains("Ravelli")       
      );
    }
}
/*
output:

Bharath Ravelli
Tejaswi Ravelli
Vijaya
ABCD

Some important methods on Strings :
int length():15
String toLowerCase():bharath ravelli
String toUpperCase():BHARATH RAVELLI
String trim():spaces
String substring(int begin):arath Ravelli
String substring(int begin,int end):ara
String replace(char old):Bhrrrth Rrvelli
char charAt(int ind):B
boolean startsWith(String s,int ind):true
boolean endsWith(String s,int ind):true
int indexOf(String s):8
boolean equals(String s):true
boolean equalsIgnoreCase(String s):false
int compareTo(String s):-18
boolean contains(String str)true

 */