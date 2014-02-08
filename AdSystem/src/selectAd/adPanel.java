package selectAd;
import java.util.*;

public class adPanel {
	public adPanel() {
		super();
		this.panel = new ArrayList<adLocation>();
		this.size = 3;
		this.intialLocation();
	}
	private ArrayList<adLocation> panel ;
	private int size;

	public ArrayList<adLocation> getPanel() {
		return panel;
	}

	public void setPanel(ArrayList<adLocation> panel) {
		this.panel = panel;
	}
	public adLocation getLocation(int id)
	{
		if(id<panel.size())
		{
			return this.panel.get(id);
		}
		return null;
	}
	public void intialLocation()
	{
		for(int i = 0; i<this.size; i++)
		{
			panel.add(new adLocation(i));
		}
	}
	public void output()
	{
		for(int i = 0; i<panel.size(); i++)
		{
			this.panel.get(i).printout();
		}
	}
	
}
