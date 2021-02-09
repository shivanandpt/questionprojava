package question.pro.api.comment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CommentController {
	RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/comments")
	public List <Comment>  getComments(@RequestParam String stotyId) {
		Story story = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+ stotyId +".json", Story.class);
		Integer totalComments = story.getKids().length;
		System.out.print(story.getKids());
		List<Integer> topCommnets = Arrays.asList(story.getKids());
		if (story.getKids().length > 10 ) {
			topCommnets = topCommnets.subList(0,10);
		}
		
		List<Comment> comments = new ArrayList<>();
		  for(int i:topCommnets) {
		    	//System.out.print(i);
		    	Comment comnt = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+ i +".json", Comment.class);
		    	
		    	User user = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/user/"+ comnt.getBy() +".json", User.class);
		    	comnt.setProfileYears(user.getCreated());
		    	comments.add(comnt);
		    }
		return comments;
	}
}
