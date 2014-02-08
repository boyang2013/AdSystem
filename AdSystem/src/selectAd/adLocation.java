package selectAd;
import java.util.*;

public class adLocation {
	public adLocation(int locID) {
		super();
		this.locID = locID;
		this.timeRange = new ArrayList<timeSlot>();
		this.initialArray();
	}
	private ArrayList<timeSlot> timeRange;
	private int locID;
	public ArrayList<timeSlot> getTimeRange() {
		return timeRange;
	}
	public void setTimeRange(ArrayList<timeSlot> timeRange) {
		this.timeRange = timeRange;
	}
	public int getLocID() {
		return locID;
	}
	public void setLocID(int locID) {
		this.locID = locID;
	}
	public timeSlot getSlot(int time)
	{
		if(time<this.timeRange.size())
		{
			return this.timeRange.get(time);
		}
		return null;
	}
	public void initialArray()
	{
		for(int i = 0; i<24; i++)
		{
			this.timeRange.add(new timeSlot());
		}
	}
	public void printout()
	{
		System.out.println("This loction"+this.locID);
		for(int i = 0; i<timeRange.size(); i++)
		{
			System.out.println("During " +i+" from "+(i+1)+"period");
			timeRange.get(i).outputAD();
			System.out.println("");
		}
	}
	public void addAd(Advertisment ad)
	{
		boolean ifSert = true;
		for(int i = ad.getStart_time(); i<ad.getEnd_time(); i++)
		{
			timeSlot slot = this.getSlot(i-1);
			if(slot.isFull())
			{
				ifSert = false;
				break;
			}
		}
		if(ifSert)
		{
			for(int i = ad.getStart_time(); i<ad.getEnd_time(); i++)
			{
				timeSlot slot = this.getSlot(i);
				slot.addAD(ad.getAdID());
			}
		}
	}
}
