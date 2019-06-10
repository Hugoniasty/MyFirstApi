package daos;

import com.company.DbUtil;
import com.company.Solution;
import com.company.User;

import java.sql.*;
import java.time.LocalDateTime;
import java.util.Arrays;

public class SolutionDao {

    private final static String CREATE_SOLUTION_QUERY =
            "INSERT INTO solution(created, updated, description) " +
                    "VALUES (NOW(), NOW(), ?)";

    private static final String READ_SOLUTION_QUERY =
            "SELECT * FROM solution WHERE id = ?";

    private static final String UPDATE_SOLUTION_QUERY =
            "UPDATE solution SET updated = NOW(), description = ? where id = ?";

    private static final String DELETE_SOLUTION_QUERY =
            "DELETE FROM solution WHERE id = ?";

    private static final String FIND_ALL_SOLUTIONS_QUERY =
            "SELECT * FROM solution";


    public Solution create (Solution solution) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(CREATE_SOLUTION_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, solution.getDescription());
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

    public Solution read (int solutionId) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(READ_SOLUTION_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, solutionId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                Solution solution = new Solution();
                solution.setId(resultSet.getInt("id"));
                solution.setCreated(resultSet.getTimestamp("created").toLocalDateTime());
                solution.setUpdated(resultSet.getTimestamp("updated").toLocalDateTime());
                solution.setDescription(resultSet.getString("description"));
                return solution;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void update (Solution solution) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(UPDATE_SOLUTION_QUERY);
            statement.setString(1, solution.getDescription());
            statement.setInt(2, solution.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete (int solutionId) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(DELETE_SOLUTION_QUERY);
            statement.setInt(1, solutionId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private Solution[] addToArray (Solution u, Solution[] solutions) {
        Solution[] tmpSolution = Arrays.copyOf(solutions, solutions.length + 1);
        tmpSolution[solutions.length] = u;
        return tmpSolution;
    }

    public Solution[] findAll () {

        try (Connection conn = DbUtil.getConnection()) {
            Solution[] solutions = new Solution[0];
            PreparedStatement statement = conn.prepareStatement(FIND_ALL_SOLUTIONS_QUERY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Solution solution = new Solution();
                solution.setId(resultSet.getInt(1));
                solution.setDescription(resultSet.getString("description"));
                solution.setUpdated(resultSet.getTimestamp("updated").toLocalDateTime());
                solution.setCreated(resultSet.getObject("created", LocalDateTime.class));
                solutions = addToArray(solution, solutions);
            }
            return solutions;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
