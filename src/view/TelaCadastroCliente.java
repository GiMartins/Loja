package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Endereco;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class TelaCadastroCliente {

    public VBox getTelaCadastro(Stage stage){
        VBox raiz = new VBox();

        Label lblNome = new Label("Nome");
        TextField txtNome = new TextField("");
        Label lblSobrenome = new Label("Sobrenome");
        TextField txtSobrenome = new TextField("");
        Label lblDataNascimento = new Label("Data de Nascimento");
        TextField txtDataNascimento = new TextField("");
        Label lblCpfCnpj = new Label("CPF/CNPJ");
        TextField txtCpfCnpj = new TextField("");

        Label lblCodigo = new Label("Código");
        TextField txtCodigo = new TextField("");
        Label lblEndereco = new Label("Endereço");
        Label lblLogradouro = new Label("Logradouro");
        TextField txtLogradouro = new TextField("");
        Label lblComplemento = new Label("Complemento");
        TextField txtComplemento = new TextField("");
        Label lblNumero = new Label("Número");
        TextField txtNumero = new TextField("");
        Label lblBairro = new Label("Bairro");
        TextField txtBairro = new TextField("");
        Label lblCep = new Label("CEP");
        TextField txtCep = new TextField("");

        Button btnCadastrar = new Button ("Cadastrar");
        Button btnLimpar = new Button ("Limpar");

        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblNome, txtNome, lblSobrenome, txtSobrenome, lblDataNascimento, txtDataNascimento, lblCpfCnpj, txtCpfCnpj, lblCodigo, txtCodigo,
                lblEndereco, lblLogradouro, txtLogradouro, lblComplemento, txtComplemento, lblNumero, txtNumero, lblBairro, txtBairro, lblCep, txtCep,
                btnCadastrar, btnLimpar);

        btnCadastrar.setOnAction(Event ->{
            Endereco endereco = new Endereco(txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(), txtBairro.getText(), txtCep.getText());
            Cliente cliente = new Cliente(txtNome.getText(), txtSobrenome.getText(), txtDataNascimento.getText(), txtCpfCnpj.getText(), txtCodigo.getText(), endereco);

            ConnectionDB connectionDB = new ConnectionDB();
            Connection conn = connectionDB.getConnection();

            String query = "INSERT INTO CLIENTE(NOME, SOBRENOME, DATA_NASCIMENTO, CPF_CNPJ, CODIGO)" + "VALUES ('" + cliente.getNome() + "','" + cliente.getSobreNome() + "','" + cliente.getDataNascimento() +"','" +
                    cliente.getCpfCnpj() + "','" + cliente.getCodigo() + "')";

            try {
                Statement statement = conn.createStatement();
                statement.executeUpdate(query);
            } catch (SQLException e){
                e.printStackTrace();
            }

        });

        btnLimpar.setOnAction(Event -> {
            txtNome.setText("");
            txtSobrenome.setText("");
            txtDataNascimento.setText("");
            txtCpfCnpj.setText("");
            txtCodigo.setText("");
            txtLogradouro.setText("");
            txtComplemento.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            txtCep.setText("");

        });

        return raiz;
    }

}
