package com.company;

import java.sql.*;

public class UserGroupDao {

    private static final String CREATE_USER_GROUP_QUERY =
            "INSERT INTO user_group(name) VALUES (?)";

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