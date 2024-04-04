import java.util.Scanner;
class StringManip
{
   public static void main(String args[])
   {
       System.out.println("Enter the string:");
       Scanner sc=new Scanner(System.in);
       String str1=sc.nextLine();
       System.out.println("Length of string="+str1.length());
       System.out.println("character at first position="+str1.charAt(1));
       System.out.println("String contains 'col' sequence:"+str1.contains("col"));
       System.out.println("String ends with 'e':"+str1.endsWith("e"));
       System.out.println("Replace 'col' with 'kol':"+str1.replaceAll("cal","kol"));
       System.out.println("Lowercase:"+str1.toLowerCase());
       System.out.println("Uppercase:"+str1.toUpperCase());
       sc.close();
   }
}
       
