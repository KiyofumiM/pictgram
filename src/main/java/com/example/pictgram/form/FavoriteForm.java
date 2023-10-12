package com.example.pictgram.form;

import lombok.Data;

// @Data
public class FavoriteForm {

    private Long userId;

    private Long topicId;

    private TopicForm topic;

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getTopicId() {
		return topicId;
	}

	public void setTopicId(Long topicId) {
		this.topicId = topicId;
	}

	public TopicForm getTopic() {
		return topic;
	}

	public void setTopic(TopicForm topic) {
		this.topic = topic;
	}
}