package question.pro.api.comment;

import java.util.List;

public class CommentResponse {
	
	public CommentResponse() {
		
	}
	public CommentResponse(int totalComments, List<Comment> commnets) {
		super();
		this.totalComments = totalComments;
		this.commnets = commnets;
	}
	private int totalComments;
	private List<Comment> commnets;
	public int getTotalComments() {
		return totalComments;
	}
	public void setTotalComments(int totalComments) {
		this.totalComments = totalComments;
	}
	public List<Comment> getCommnets() {
		return commnets;
	}
	public void setCommnets(List<Comment> commnets) {
		this.commnets = commnets;
	}

}
