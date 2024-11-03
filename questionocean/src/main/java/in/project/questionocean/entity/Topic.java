package in.project.questionocean.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "topics")
public class Topic {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int topic_id ;
	@Column
	private String topic ;
	@Column
	private boolean active ;
	@Column
	private String status ;
	
	public Topic() {
		
	}
	
	
	public Topic(String topic, boolean active, String status) {
		super();
		this.topic = topic;
		this.active = active;
		this.status = status;
	}

	
	public int getTopic_id() {
		return topic_id;
	}
	public void setTopic_id(int topic_id) {
		this.topic_id = topic_id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Topic [topic_id=" + topic_id + ", topic=" + topic + ", active=" + active + ", status=" + status + "]";
	}

	
	
	
	
}
