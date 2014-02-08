package selectAd;

import java.io.IOException;

public class main {
	public static void main(String args[]) 
	{
		inputHandler inputH = new inputHandler();
		adPool pool = new adPool();
		adPanel panel = new adPanel();
		try {
			inputH.readFilebyLine(pool, "/Users/Anastasia/Desktop/addList.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		adController controller = new adController(pool,panel);
		controller.arrageAd();
		System.out.println("completed");
		panel.output();
	}
	
}
