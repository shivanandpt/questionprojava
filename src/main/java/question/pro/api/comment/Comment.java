package question.pro.api.comment;

import java.time.Year;

public class Comment {
	
	public Comment() {
	}
	public Comment(String by, String text, int profileYears) {
		super();
		this.by = by;
		this.text = text;
		this.profileYears =  Year.now().getValue() - profileYears;
	}
	private String by;
	private String text;
	private int profileYears;
	
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getProfileYears() {
		return profileYears;
	}
	public void setProfileYears(int profileYears) {
		this.profileYears = Year.now().getValue() - profileYears;
	}
}
	
