package view;

import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class TelaListarProduto {
    public VBox getTelaListarCliente(Stage stage){
        VBox vBox = new VBox();

        ArrayList<String> retorno =
                new ArrayList<String>();

        ConnectionDB connectionDB = new ConnectionDB();
        Connection conn = connectionDB.getConnection();

        String query = "SELECT * FROM PRODUTOS";
        try {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()){
                String nome_produto = rs.getString("NOME_PRODUTO");
                String tipo_produto = rs.getString("TIPO_PRODUTO");
                String marca = rs.getString("MARCA");
                String fornecedor = rs.getString("FORNECEDOR");
                String quantidade = rs.getString("QUANTIDADE");
                String preco_compra = rs.getString("PRECO_COMPRA");
                String note = rs.getString("NOTA");
                String validade = rs.getString("VALIDADE");
                String codigo_produto = rs.getString("CODIGO_PRODUTO");

                retorno.add(nome_produto);

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