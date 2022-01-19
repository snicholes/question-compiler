package dev.nicholes.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import dev.nicholes.models.Question;

public class FileFormatter {
	public List<Question> getQuestionsFromFile(File file) throws IOException {
		List<Question> questions = new LinkedList<>();
		
		try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
			String line = "";
			String currentTopic = "";
			while ((line=reader.readLine()) != null) {
				if (line.startsWith("#")) {
					currentTopic = line.replace("## ", "");
					continue;
				} else if (line.trim().isEmpty()) {
					continue;
				}
				Question q = new Question(line, currentTopic);
				questions.add(q);
			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return questions;
	}
}
