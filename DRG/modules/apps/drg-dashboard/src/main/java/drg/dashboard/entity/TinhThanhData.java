package drg.dashboard.entity;

public class TinhThanhData {
	private long id;
	private String key;
	public TinhThanhData() {
		super();
	}
	
	public TinhThanhData(long id, String key) {
		super();
		this.id = id;
		this.key = key;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
}
