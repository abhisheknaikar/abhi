import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class demo3 {
	
	public static void main(String[]args) {
	
	FileReader fr=null;
	FileWriter fw=null;
	BufferedReader br=null;
	BufferedWriter bw=null;
	

	try
	{
		String temp;
		String path1 ="D://filehandling//input2.txt";
		String path2 = "D://filehandling//output2.txt";
		fr = new FileReader(path1);
	    fw = new FileWriter(path2);
	     br = new BufferedReader(fr);
	     bw = new BufferedWriter(fw);
		while (( temp =br.readLine())!=null)
		{
			fw.write(temp);
		}
		fw.flush();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			fr.close();
			fw.close();
			br.close();
			bw.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

}
