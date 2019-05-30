package com.company;

import java.sql.*;

public class SolutionDao {

    private final static String CREATE_SOLUTION_QUERY =
            "INSERT INTO solution(created, updated, description " +
                    "VALUES (NOW(), NOW(), ?)";

    public Solution create (Solution solution) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(CREATE_SOLUTION_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setDate(1, solution.getCreated());
            statement.setDate(2, solution.getUpdated());
            statement.setString(3, solution.getDescription());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                solution.setId(result.getInt(1));
            }
            return solution;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
