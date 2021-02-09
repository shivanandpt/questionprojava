package question.pro.api.comment;

import java.util.Date;

public class User {
	
	public User() {
	
	}
	public User(String id, int created) {
		super();
		this.id = id;
		Date profileDate = new Date(created *1000L);
		this.created = profileDate.getYear() + 1900;
	}
	private String id ;
	private int created;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getCreated() {
		return created;
	}
	public void setCreated(long created) {
		Date profileDate = new Date(created *1000L);
		this.created = profileDate.getYear() + 1900;
	}

}
