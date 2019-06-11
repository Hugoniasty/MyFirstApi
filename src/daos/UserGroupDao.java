package daos;

import com.company.DbUtil;
import com.company.User;
import com.company.UserGroup;

import java.sql.*;
import java.util.Arrays;

public class UserGroupDao {

    private static final String CREATE_USER_GROUP_QUERY =
            "INSERT INTO user_group(name) VALUES (?)";

    private static final String READ_USER_GROUP_QUERY =
            "SELECT * FROM user_group WHERE id = ?";

    private static final String UPDATE_USER_GROUP_QUERY =
            "UPDATE user_group SET name = ? where id = ?";

    private static final String DELETE_USER_GROUP_QUERY =
            "DELETE FROM user_group WHERE id = ?";

    private static final String FIND_ALL_USER_GROUPS_QUERY =
            "SELECT * FROM user_group";


    public UserGroup create (UserGroup userGroup) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement = conn.prepareStatement(CREATE_USER_GROUP_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, userGroup.getName());
            statement.executeUpdate();
            ResultSet result = statement.getGeneratedKeys();
            if (result.next()) {
                userGroup.setId(result.getInt(1));
            }
            return userGroup;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }


    public UserGroup read (int userGroupId) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(READ_USER_GROUP_QUERY, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, userGroupId);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                UserGroup userGroup = new UserGroup();
                userGroup.setId(resultSet.getInt("id")); //Pobieramy ID z bazy DO obiektu
                userGroup.setName(resultSet.getString("name")); //J.w lecz name
                return userGroup;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }


    public void update (UserGroup userGroup) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(UPDATE_USER_GROUP_QUERY);
            statement.setString(1, userGroup.getName());
            statement.setInt(2, userGroup.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public void delete (int userGroupId) {

        try (Connection conn = DbUtil.getConnection()) {
            PreparedStatement statement =
                    conn.prepareStatement(DELETE_USER_GROUP_QUERY);
            statement.setInt(1, userGroupId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    private UserGroup[] addToArray (UserGroup u, UserGroup[] userGroups) {
        UserGroup[] tmpUserGroups = Arrays.copyOf(userGroups, userGroups.length + 1);
        tmpUserGroups[userGroups.length] = u;
        return tmpUserGroups;
    }

    public UserGroup[] findAll () {

        try (Connection conn = DbUtil.getConnection()) {
            UserGroup[] userGroups = new UserGroup[0];
            PreparedStatement statement = conn.prepareStatement(FIND_ALL_USER_GROUPS_QUERY);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                UserGroup userGroup = new UserGroup();
                userGroup.setId(resultSet.getInt(1)); //Wsadzanie danych do obiektu
                userGroup.setName(resultSet.getString("name")); //Wsadzanie danych do obiektu
                userGroups = addToArray(userGroup, userGroups); //Dodawanie obiektu i tablicy do metody kopiowania tablic
            }
            return userGroups;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}


/* Tworzenie DAO
1.Podajemy query do wykonania CRUD (create, read, update, delete + find all)
2.Tworzymy metodę klasy wyżej niż dao (dla UserGroupDao będzie to UserGroup.
  Jako argumenty przyjmujemy obiekt klasy wyżej.
3.Robimy try'a łączącego nasz nowy obiekt z baza danych.
    3.1 Connection "nazwa połączenia" . DbUtil.getConnection (coby nie pisać w każdym DAOsie
        wszystkich danych łączących to wywołujemy metode z klasy "łączącej".
    3.2 
 */