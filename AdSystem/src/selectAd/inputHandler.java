package selectAd;
import java.io.*;
import java.util.*;
public class inputHandler {
	public void readFilebyLine(adPool pool, String fileName) throws IOException
	{
		File file = new File(fileName);
		try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			String tempString = null;
			while((tempString=br.readLine())!=null)
			{
				pool.addAd(createAd(tempString));
			}
			br.close();
			fr.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Advertisment createAd(String eachLine)
	{
		String[] termArray = eachLine.split(",");
		return new Advertisment(termArray[0],Integer.valueOf(termArray[1]),Integer.valueOf(termArray[2]),Integer.valueOf(termArray[3]));
	}
}
