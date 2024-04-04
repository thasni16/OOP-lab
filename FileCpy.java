import java.io.*;
class  FileCpy
{
	public static void main(String[] args)
	{
		try
		{
			
			FileReader reader=new FileReader("test.txt");
			BufferedReader br=new BufferedReader(reader);
			String line;
			System.out.println("Data is copied to the file");
			FileWriter writer=new FileWriter("t2.txt",true);
			while((line=br.readLine())!=null)
			{
			writer.write(line+"\n");
			}
			reader.close();
			writer.close();
		}
		catch(IOException e)
		{
			System.out.println("error occured");
		}
	}
}
