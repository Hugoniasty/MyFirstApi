package com.company;

import java.sql.*;

public class ExerciseDao {

    private static final String CREATE_EXERCISE_QUERY =
            "INSERT INTO exercise(title, description) VALUES (?, ?)";

    public Exercise create (Exercise exercise) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(CREATE_EXERCISE_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, exercise.getTitle());
            statement.setString(2, exercise.getDescription());
            statement.executeUpdate();
            ResultSet resultSet = statement.getGeneratedKeys();
            if (resultSet.next()) {
                exercise.setId(resultSet.getInt(1));
            }
            return exercise;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;

        }
    }
}
