package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Endereco;
import model.Fornecedor;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TelaCadastroFornecedor {

public VBox getTelaCadastroFornecedor (Stage stage) {
        VBox raiz = new VBox();

        Label lblNomeFornecedor = new Label("Nome do Fornecedor");
        Label lblNomeFantasia = new Label("Nome Fantasia");
        Label lblCnpjCpf = new Label("CNPJ/CPF");
        Label lblTelefoneFornecedor = new Label("Telefone");
        Label lblCodigoFornecedor = new Label("Código Fornecedor");
        Label lblEnderecoFornecedor = new Label("Endereço");
        Label lblLogradouroFornecedor = new Label("Logradouro");
        Label lblComplementoFornecedor = new Label("Complemento");
        Label lblNumero = new Label("Número");
        Label lblBairro = new Label("Bairro");
        Label lblCepFornecedor = new Label("CEP");

         TextField txtNomeFornecedor = new TextField();
         TextField txtNomeFantasia = new TextField();
         TextField txtCnpjCpf = new TextField();
         TextField txtTelefoneFornecedor = new TextField();
         TextField txtCodigoFornecedor = new TextField();
         TextField txtLogradouroFornecedor = new TextField();
         TextField txtComplementoFornecedor = new TextField();
         TextField txtNumero = new TextField();
         TextField txtBairro = new TextField();
         TextField txtCepFornecedor = new TextField();

          Button btnCadastrarFonecedor = new Button("Cadastrar Fornecedor");
          Button btnLimpar = new Button("Limpar");

    MenuBarView menuBarView = new MenuBarView();
    MenuBar menuBar = menuBarView.getMenuBar(stage);







         raiz.getChildren().addAll(menuBar, lblNomeFornecedor, txtNomeFornecedor, lblNomeFantasia, txtNomeFantasia, lblCnpjCpf, txtCnpjCpf, lblTelefoneFornecedor, txtTelefoneFornecedor, lblCodigoFornecedor,
                 txtCodigoFornecedor, lblEnderecoFornecedor, lblLogradouroFornecedor, txtLogradouroFornecedor, lblComplementoFornecedor,
                 txtComplementoFornecedor, lblNumero, txtNumero,  lblBairro, txtBairro, lblCepFornecedor, txtCepFornecedor,btnCadastrarFonecedor,btnLimpar);


    btnCadastrarFonecedor.setOnAction(event -> {
        Endereco endereco = new Endereco(txtLogradouroFornecedor.getText(), txtComplementoFornecedor.getText(), txtNumero.getText(), txtBairro.getText(),txtCepFornecedor.getText());
        Fornecedor fornecedor = new Fornecedor(txtNomeFornecedor.getText(), txtNomeFantasia.getText(),txtCnpjCpf.getText(), txtTelefoneFornecedor.getText(), txtCodigoFornecedor.getText(), endereco);

        ConnectionDB connectionDB = new ConnectionDB();
        Connection conn = connectionDB.getConnection();

        String query = "INSERT INTO FORNECEDOR(NOME_FORNECEDOR, NOME_FANTASIA, CNPJ, TELEFONE_FORNECEDOR, CODIGO_FORNECEDOR)" + " VALUES ('" + fornecedor.getNomeFornecedor() + "','" + fornecedor.getNomeFantasia() +
                "','" + fornecedor.getCnpj() + "','" + fornecedor.getTelefoneFornecedor() + "','" + fornecedor.getCodigoFornecedor() + "')";

        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(query);

        } catch (SQLException e) {
            e.printStackTrace();
        }




    });
    btnLimpar.setOnAction(event -> {
        txtNomeFornecedor.setText(" ");
        txtNomeFantasia.setText(" ");
        txtCnpjCpf.setText(" ");
        txtTelefoneFornecedor.setText(" ");
        txtCodigoFornecedor.setText(" ");
        txtLogradouroFornecedor.setText(" ");
        txtComplementoFornecedor.setText(" ");
        txtNumero.setText(" ");
        txtBairro.setText(" ");
        txtCepFornecedor.setText(" ");

    });
    return raiz;
    }


}

