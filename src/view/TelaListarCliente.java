package view;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import repository.ConnectionDB;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class TelaListarCliente {
    public VBox getTelaListarCliente(Stage stage){
        VBox vBox = new VBox();

        TextField txtBuscar = new TextField("");
        Button btnBuscar = new Button("Buscar");

        ArrayList<String> retorno =
                new ArrayList<String>();

        ConnectionDB connectionDB = new ConnectionDB();
        Connection conn = connectionDB.getConnection();

        String query = "SELECT * FROM CLIENTE";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                String nome = rs.getString("NOME");
                String sobrenome = rs.getString("SOBRENOME");
                String dataNascimento = rs.getString("DATA_NASCIMENTO");
                String CpfCnpj = rs.getString("CPF_CNPJ");
                String codigo = rs.getString("CODIGO");
                retorno.add(nome);

            }
            ListView listView = new ListView(FXCollections.observableArrayList(retorno));

            MenuBarView menuBarView = new MenuBarView();
            MenuBar menuBar = menuBarView.getMenuBar(stage);

            vBox.getChildren().addAll(menuBar, listView);

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return vBox;

    }
}
