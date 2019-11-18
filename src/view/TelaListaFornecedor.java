package view;

import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import repository.ConnectionDB;


import javax.xml.crypto.URIReferenceException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TelaListaFornecedor {
    public VBox getTelaListaFornecedor(Stage stage) {
        VBox vBox = new VBox();

        ArrayList<String> retorno =
                new ArrayList<String>();

        ConnectionDB connectionDB = new ConnectionDB();
        Connection conn = connectionDB.getConnection();

        String query = "SELECT * FROM FORNECEDOR";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {


                String nomeFornecedor = rs.getString("NOME_FORNECEDOR");
                retorno.add(nomeFornecedor);
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