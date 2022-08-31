package Springboot.Springbootkoushik1;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {
public List <Topic> topics=new ArrayList<>(Arrays.asList(
        new Topic("Spring","Spring framework","Spring Description"),
        new Topic("Rest","Rest framework","Rest Description"),
        new Topic("java","java framework","java Description")
));

  public List<Topic> getTopics(){

    return topics;

      

  }
  public Topic getonetopi(String id){
   return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();

  }
  public void addatopic(Topic topic){

    topics.add(topic);
  }
  public void updatetopic(Topic topic,String id){
    for(int i=0;i<= topics.size();i++){
      Topic topic1=topics.get(i);
      if(topic.getId().equals(id)){
        topics.set(i,topic1);
        return;
      }

    }

  }

  public void deletetopic(String id) {
    topics.removeIf(t->t.getId().equals(id));
  }
}
