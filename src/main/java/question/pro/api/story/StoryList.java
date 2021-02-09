package question.pro.api.story;

public class StoryList {
	
	public StoryList() {
		
	}
	public StoryList(int[] stories) {
		super();
		this.stories = stories;
	}

	int [] stories;

	public int[] getStories() {
		return stories;
	}

	public void setStories(int[] stories) {
		this.stories = stories;
	}
}
