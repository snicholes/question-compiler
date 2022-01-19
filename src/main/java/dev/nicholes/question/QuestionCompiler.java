package dev.nicholes.question;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import dev.nicholes.data.QuestionDAO;
import dev.nicholes.models.Question;

public class QuestionCompiler {
	public static void main(String[] args) {
		List<File> files = getFiles("src/main/resources");
		List<Question> questions = null;
		
		FileFormatter format = new FileFormatter();
		for (File file : files) {
			try {
				if (questions==null)
					questions = format.getQuestionsFromFile(file);
				else
					questions.addAll(format.getQuestionsFromFile(file));
			} catch (IOException e) {
				e.printStackTrace();
				continue;
			}
		}
		
		QuestionDAO questionDao = new QuestionDAO();
		questionDao.addQuestions(questions);
	}
	
	public static List<File> getFiles(String directory) {
		File dir = new File(directory);
		return Arrays.asList(dir.listFiles());
	}
}
