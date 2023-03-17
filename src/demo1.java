import java.io.FileReader;
import java.io.FileWriter;

public class demo1 {

	public static void main(String[] args) {
		try
		{
			int temp;
			String path1 ="D://filehandling//input.txt";
			String path2 = "D://filehandling//output.txt";
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			while ((temp=fr.read())!=-1)
			{
				fw.write(temp);
			}
			fw.flush();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	}

}
