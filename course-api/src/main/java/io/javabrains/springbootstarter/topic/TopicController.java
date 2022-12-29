package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * We add annotations to make this a spring controller
 * We will still be using RestAPI
 * 
 * This class will work with the Topics class and returns a list of topics 
 * based on the mapping we have defined
 */

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		
		// return objects are converted to JSON and sent back with HTTP response
		
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript","Javascript", "Javascript Description")
				);
	}
}
