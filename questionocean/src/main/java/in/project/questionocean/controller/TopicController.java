package in.project.questionocean.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import in.project.questionocean.entity.Topic;
import in.project.questionocean.repository.TopicRepository;


@RestController
public class TopicController {
	@Autowired
	TopicRepository repository ;
	@GetMapping("/topics")
	public List<Topic> getAllTopics(){
		return repository.findAll();

	}

	
}
