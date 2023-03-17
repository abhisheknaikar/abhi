import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class demo2 {

	public static void main(String[] args) {
		try
		{
			String temp;
			String path1 ="D://filehandling//input2.txt";
			String path2 = "D://filehandling//output2.txt";
			FileReader fr = new FileReader(path1);
			FileWriter fw = new FileWriter(path2);
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
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
		
	}
}
