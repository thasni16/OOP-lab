import java.io.*;
class  FileReadWrite
{
	public static void main(String[] args)
	{
		try
		{
			FileWriter writer=new FileWriter("t1.txt",true);
			writer.write("Hello Welcome");
			writer.close();
			FileReader reader=new FileReader("t1.txt");
			BufferedReader br=new BufferedReader(reader);
			String line;
			System.out.println("Data read from the file");
			while((line=br.readLine())!=null)
			{
			System.out.println(line);
			}
			reader.close();
		}
		catch(IOException e)
		{
			System.out.println("error occured");
		}
	}
}
