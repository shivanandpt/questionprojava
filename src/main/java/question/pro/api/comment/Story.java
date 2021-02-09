package question.pro.api.comment;

import java.util.Date;

public class Story {
	
	public Story() {
		
	}
	public Story(String by, int descendants, int id, int score, Date time, Integer[] kids, String title, String type,
			String url) {
		super();
		this.by = by;
		this.descendants = descendants;
		this.id = id;
		this.score = score;
		this.time = time;
		this.kids = kids;
		this.title = title;
		this.type = type;
		this.url = url;
	}
	private String by;
	private int descendants;
	private int id;
	private int score;
	private Date time;
	private Integer[] kids;
	private String title;
	private String type;
	private String url;
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public int getDescendants() {
		return descendants;
	}
	public void setDescendants(int descendants) {
		this.descendants = descendants;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	public Integer[] getKids() {
		return kids;
	}
	public void setKids(Integer[] kids) {
		this.kids = kids;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
