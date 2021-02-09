package question.pro.api.story;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class StoryController {
	
	RestTemplate restTemplate = new RestTemplate();

	@RequestMapping("/hello")
	public String sayHi() {
		return "yo";
	}
	
	@RequestMapping("/best-stories")
	public List <Stories>  bestStories() {
		
		Integer[] stories = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/beststories.json",Integer[].class);
	    List <Integer> bestStories = Arrays.asList(stories);
	    bestStories = bestStories.subList(0,10);
	    List<Stories> bestStoriesTemp = new ArrayList<>();
	    for(int i:bestStories) {
	    	//System.out.print(i);
	    	Stories story = restTemplate.getForObject("https://hacker-news.firebaseio.com/v0/item/"+ i +".json", Stories.class);
	    	bestStoriesTemp.add(story);
	    	
	    }
	    return bestStoriesTemp;
	}
	
	@RequestMapping("/past-stories")
	public String pastStorie() {
		return "Hi";
	}
}
