package selectAd;

public class Advertisment {
	private String adID;
	private int start_time;
	private int end_time;
	private int loc_num;
	
	public Advertisment() {
		super();
	}
	public Advertisment(String adID, int start_time, int end_time, int loc_num) {
		super();
		this.adID = adID;
		this.start_time = start_time;
		this.end_time = end_time;
		this.loc_num = loc_num;
	}
	public String getAdID() {
		return adID;
	}
	public void setAdID(String adID) {
		this.adID = adID;
	}
	public int getStart_time() {
		return start_time;
	}
	public void setStart_time(int start_time) {
		this.start_time = start_time;
	}
	public int getEnd_time() {
		return end_time;
	}
	public void setEnd_time(int end_time) {
		this.end_time = end_time;
	}
	public int getLoc_num() {
		return loc_num;
	}
	public void setLoc_num(int loc_num) {
		this.loc_num = loc_num;
	}
	
}
