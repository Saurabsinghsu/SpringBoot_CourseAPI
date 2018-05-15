package com.springCource.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService 
{
	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("security", "Spring Security", "It provide secure access of data"),
			new Topic("mvc", "Spring MVC", "It is a Model View Controller"),
			new Topic("jpa", "Spring JPA", "Java Spring Objects")
			));
	
	public List<Topic> getAllTopics()
	{
		return topics;
	}
	
	public Topic getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		
		/**Or we can do this using fr loop too
		 * for(Topic obj : topics) {
			if(obj.getId().equals(id)) return obj;
		}*/
	}

	public void addTopic(Topic topic) 
	{
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) 
	{
		for (int i = 0; i < topics.size(); i++) 
		{
			Topic t = topics.get(i);
			if (t.getId().equals(id)) 
			{
				topics.set(i, topic);
				return;
			}
			
		}
	}

	public void deleteTopic(String id) 
	{
		topics.removeIf(t -> t.getId().equals(id));
	}
}
