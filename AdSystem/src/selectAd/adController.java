package selectAd;

import java.util.Iterator;
import java.util.*;

public class adController {
	public adController(adPool pool, adPanel panel) {
		super();
		this.ap = pool;
		this.adpanel = panel;
	}
	private adPool ap;
	private adPanel adpanel;
	public void arrageAd()
	{
		ArrayList<Advertisment> arrAD = ap.getAllAD();
		if(arrAD.size()!=0)
		{
			for(int j = 0; j < arrAD.size(); j++)
			{
				Advertisment ad = arrAD.get(j);
				int loc = ad.getLoc_num();
				adLocation adl = adpanel.getLocation(loc-1);
				adl.addAd(ad);
				
			}
			
		}
	}
}
