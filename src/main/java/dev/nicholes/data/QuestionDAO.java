package dev.nicholes.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import dev.nicholes.models.Question;
import dev.nicholes.utils.ConnectionUtil;

public class QuestionDAO {
	private ConnectionUtil connUtil = ConnectionUtil.getConnectionUtil();
	
	public void addQuestions(List<Question> questions) {
		try (Connection conn = connUtil.getConnection()) {
			conn.setAutoCommit(false);
			
			StringBuilder sql = new StringBuilder("insert into question (question_text,topic) values ");

			for(int i=0;i<questions.size();i++) {
				sql.append("(?,?)");
				if (i<questions.size()-1) sql.append(",");
			}
			PreparedStatement pStmt = conn.prepareStatement(sql.toString());
			int param = 0;
			for(int i=1;i<=questions.size();i++) {
				Question question = questions.get(i-1);
				pStmt.setString(++param, question.questionText);
				pStmt.setString(++param, question.topic);
			}
			
			int rowsAffected = pStmt.executeUpdate();
			if (rowsAffected > 0) {
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void addQuestion(Question q) {
		try (Connection conn = connUtil.getConnection()) {
			conn.setAutoCommit(false);
			
			String[] keys = {"id"};
			String sql = "insert into question (question_text) values (?)";
			PreparedStatement pStmt = conn.prepareStatement(sql,keys);
			pStmt.setString(1, q.questionText);
			pStmt.executeUpdate();
			ResultSet genKeys = pStmt.getGeneratedKeys();
			if (genKeys.next()) {
				conn.commit();
			} else {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
