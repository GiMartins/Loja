package view;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Fornecedor;


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
        Label lblEstado = new Label("Estado");
        Label lblBairro = new Label("Bairro");
        Label lblCepFornecedor = new Label("CEP");

         TextField txtNomeFornecedor = new TextField();
         TextField txtNomeFantasia = new TextField();
         TextField txtCnpjCpf = new TextField();
         TextField txtTelefoneFornecedor = new TextField();
         TextField txtCodigoFornecedor = new TextField();
         TextField txtEnderecoFornecedor = new TextField();
         TextField txtLogradouroFornecedor = new TextField();
         TextField txtComplementoFornecedor = new TextField();
         TextField txtNumero = new TextField();
         TextField txtEstado = new TextField();
         TextField txtBairro = new TextField();
         TextField txtCepFornecedor = new TextField();

          Button btnCadastrarFonecedor = new Button("Cadastrar Fornecedor");
          Button btnLimpar = new Button("Limpar");

    MenuBarView menuBarView = new MenuBarView();
    MenuBar menuBar = menuBarView.getMenuBar(stage);







         raiz.getChildren().addAll(menuBar, lblNomeFornecedor, txtNomeFornecedor, lblNomeFantasia, txtNomeFantasia, lblCnpjCpf, txtCnpjCpf, lblTelefoneFornecedor, txtTelefoneFornecedor, lblCodigoFornecedor,
                 txtCodigoFornecedor, lblEnderecoFornecedor, txtEnderecoFornecedor, lblLogradouroFornecedor, txtLogradouroFornecedor, lblComplementoFornecedor,
                 txtComplementoFornecedor, lblNumero, txtNumero,lblEstado, txtEstado, lblBairro, txtBairro, lblCepFornecedor, txtCepFornecedor,btnCadastrarFonecedor,btnLimpar);


    btnCadastrarFonecedor.setOnAction(event -> {
        Fornecedor fornecedor = new Fornecedor(txtNomeFornecedor.getText(), txtNomeFantasia.getText(),txtCnpjCpf.getText(), txtTelefoneFornecedor.getText(), txtCodigoFornecedor.getText(),
               txtEnderecoFornecedor.getText(), txtLogradouroFornecedor.getText(), txtComplementoFornecedor.getText(), txtNumero.getText(), txtEstado.getText(), txtBairro.getText(),txtCepFornecedor.getText());
         System.out.println(fornecedor);

    });
    btnLimpar.setOnAction(event -> {
        txtNomeFornecedor.setText(" ");
        txtNomeFantasia.setText(" ");
        txtCnpjCpf.setText(" ");
        txtTelefoneFornecedor.setText(" ");
        txtCodigoFornecedor.setText(" ");
        txtEnderecoFornecedor.setText(" ");
        txtLogradouroFornecedor.setText(" ");
        txtComplementoFornecedor.setText(" ");
        txtNumero.setText(" ");
        txtEstado.setText(" ");
        txtBairro.setText(" ");
        txtCepFornecedor.setText(" ");

    });
    return raiz;
    }


}

