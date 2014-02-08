package selectAd;
import java.util.*;

public class adPool {
	public adPool() {
		super();
		this.adMap = new HashMap<String,Advertisment>();
	}
	private HashMap<String,Advertisment> adMap;
	
	public ArrayList<Advertisment> getAllAD()
	{
		ArrayList<Advertisment> arr = new ArrayList<Advertisment>();
		Iterator iter = this.adMap.values().iterator();
		while(iter.hasNext())
		{	
			Advertisment ad = (Advertisment) iter.next();
			arr.add(ad);
		}
		return arr;
	}
	
	public void addAd(Advertisment ad)
	{
		if(this.adMap.containsKey(ad.getAdID()))
		{
			System.out.println("Ad is already in the pool.");
		}
		else
		{
			this.adMap.put(ad.getAdID(), ad);
		}
	}
	public Advertisment getAd(String adID)
	{
		if(this.adMap.containsKey(adID))
		{
			return this.adMap.get(adID);
		}
		else 
		{
			System.out.println("Ad"+adID+"is not there");
			return null;
		}
	}
	public void removeAd(String adID)
	{
		if(this.adMap.containsKey(adID))
		{
			this.adMap.remove(adID);
		}
		else 
		{
			System.out.println("Ad"+adID+"is not there");
		}	
	}
	 
}
