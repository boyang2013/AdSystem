package selectAd;
import java.util.*;

public class timeSlot {
	public timeSlot() {
		super();
		adIDlist = new ArrayList<String>();

	}

	private ArrayList<String> adIDlist;

	public ArrayList<String> getAdIDlist() {
		return adIDlist;
	}

	public void setAdIDlist(ArrayList<String> adIDlist) {
		this.adIDlist = adIDlist;
	}
	public void addAD(String s)
	{
		this.adIDlist.add(s);
	}
	public boolean isFull()
	{
		if(adIDlist.size()<3)
		{
			return false;
		}
		return true;
	}
	public void outputAD()
	{
		for(int i = 0; i<this.adIDlist.size(); i++)
		{
			System.out.print(this.adIDlist.get(i));
			System.out.print("     ");
		}
	}
}
