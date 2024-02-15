package com.example.aswinslab1;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    private TableView<Company> company;
    @FXML
    private TableColumn<Company, Integer> id;
    @FXML
    private TableColumn<Company, String> name;
    @FXML
    private TableColumn<Company, String> owner;
    @FXML
    private TableColumn<Company, Integer> age;
    @FXML
    private TableColumn<Company, Integer> employeenumber;
    ObservableList<Company> list = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        id.setCellValueFactory(new
                PropertyValueFactory<Company, Integer>("id"));
        name.setCellValueFactory(new
                PropertyValueFactory<Company, String>("name"));
        owner.setCellValueFactory(new
                PropertyValueFactory<Company, String>("owner"));
        age.setCellValueFactory(new
                PropertyValueFactory<Company, Integer>("age"));
        employeenumber.setCellValueFactory(new
                PropertyValueFactory<Company, Integer>("employeenumber"));
        company.setItems(list);
    }

    @FXML
    protected void onHelloButtonClick() {
        populateTable();
    }

    public void populateTable() {
// Establish a database connection
        String jdbcUrl = "jdbc:mysql://localhost:3306/industry";
        String dbUser = "root";
        String dbPassword = "";
        try (Connection connection = DriverManager.getConnection(jdbcUrl, dbUser,
                dbPassword)) {
// Execute a SQL query to retrieve data from the database
            String query = "SELECT * FROM company";
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
// Populate the table with data from the database
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String owner = resultSet.getString("owner");
                int age = resultSet.getInt("age");
                int employeenumber = resultSet.getInt("employeenumber");
                company.getItems().add(new Company(id, name, owner,
                        age,employeenumber));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}



