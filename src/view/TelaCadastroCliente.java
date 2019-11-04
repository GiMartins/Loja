package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Endereco;

public class TelaCadastroCliente {

    public VBox getTelaCadastro(Stage stage){
        VBox raiz = new VBox();

        Label lblNome = new Label("Nome");
        TextField txtNome = new TextField("");
        Label lblSobrenome = new Label("Sobrenome");
        TextField txtSobrenome = new TextField("");
        Label lblIdade = new Label("Idade");
        TextField txtIdade = new TextField("");
        Label lblCpf = new Label("CPF");
        TextField txtCpf = new TextField("");
        Label lblCnpj = new Label("CNPJ");
        TextField txtCnpj = new TextField("");
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

        raiz.getChildren().addAll(menuBar, lblNome, txtNome, lblSobrenome, txtSobrenome, lblIdade, txtIdade, lblCpf, txtCpf, lblCnpj, txtCnpj, lblCodigo, txtCodigo,
                lblEndereco, lblLogradouro, txtLogradouro, lblComplemento, txtComplemento, lblNumero, txtNumero, lblBairro, txtBairro, lblCep, txtCep,
                btnCadastrar, btnLimpar);

        btnCadastrar.setOnAction(Event ->{
            Endereco endereco = new Endereco(txtLogradouro.getText(), txtComplemento.getText(), txtNumero.getText(), txtBairro.getText(), txtCep.getText());
            Cliente cliente = new Cliente(txtNome.getText(), txtSobrenome.getText(), txtIdade.getText(), txtCpf.getText(), txtCnpj.getText(), txtCodigo.getText(), endereco);

            System.out.println(cliente);



        });

        btnLimpar.setOnAction(Event -> {
            txtNome.setText("");
            txtSobrenome.setText("");
            txtIdade.setText("");
            txtCpf.setText("");
            txtCnpj.setText("");
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
