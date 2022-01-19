package dev.nicholes.models;

public class Question {
	public int id;
	public String questionText;
	public String topic;
	
	public Question(String questionText, String topic) {
		this.questionText=questionText;
		this.topic = topic;
	}
}
