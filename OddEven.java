import java.io.*;
import java.util.*;
class OddEven
{
   public static void main(String args[])
   {
      Scanner sc=new Scanner(System.in);
      try
      {
          String file1,odd,even;
          System.out.println("Enter file name:");
          file1=sc.next();
          FileReader reader=new FileReader(file1);
          BufferedReader br=new BufferedReader(reader);
          String line;
          System.out.println("Enter 2 file name:");
          odd=sc.next();
          even=sc.next();
          FileWriter writer1=new FileWriter(odd,true);
          FileWriter writer2=new FileWriter(even,true);
          while((line=br.readLine())!=null)
          {
              int nline=Integer.parseInt(line);
              if(nline%2!=0)
              {
                  writer1.write(line+"\n");
              }
              else
              {
                  writer2.write(line+"\n");
              }
          }
          System.out.println("data copied to new file");
          reader.close();
          writer1.close();
          writer2.close();
      }
      catch(IOException e)
      {
          System.out.println("error occured");
      }
   }
}
