package Springboot.Springbootkoushik1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @RequestMapping("/topic")
    public List<Topic> getAlltopic() {
        return topicService.getTopics();
    }

    @RequestMapping("/topic/{id}")
    public Topic getonetopic(@PathVariable("id") String id) {
        return topicService.getonetopi(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/topic")
    public void addtopic(@RequestBody Topic topic) {
        topicService.addatopic(topic);

    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
            public void updatetopic(@RequestBody Topic topic, @PathVariable("id")  String id)

    {
        topicService.updatetopic(topic, id);

    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deletetopic(@PathVariable("id") String id) {
        topicService.deletetopic(id);
    }
}