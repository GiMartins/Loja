package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Cliente;
import model.Endereco;
import model.produtos;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;


public class TelaCadastroProduto{

    public TelaCadastroProduto() {
    }

    public VBox getTelaProdutos(Stage stage){

        VBox raiz = new VBox();

        Label lblProduto = new Label("Nome do Produto:");
        Label lblTipoProduto = new Label("Tipo de Produto");
        Label lblMarca = new Label("Marca do Produto");
        Label lblFornecedor = new Label("Fornecedor");
        Label lblQuantidade = new Label("Quandidade");
        Label lblPrecoCompra = new Label("Preço de Compra");
        Label lblNumNota = new Label("Nº Nota");
        Label lblValidade = new Label("Válidade do Produto");
        Label lblCodigoProduto = new Label("Código de Barras");
        Label lblMensagem = new Label("");

        TextField txtNomeProduto = new TextField();
        TextField txtTipoProduto = new TextField();
        TextField txtMarcaDoProduto = new TextField();
        TextField txtFornecedor = new TextField();
        TextField txtQuantidade = new TextField();
        TextField txtPrecoDeCompra = new TextField();
        TextField txtNumNota = new TextField();
        TextField txtValidadeDoProduto = new TextField();
        TextField txtCodigoProduto = new TextField();


        Button btnCadastrar = new Button("Cadastrar Produtos");
        Button btnApagar = new Button("Apagar");


        MenuBarView menuBarView = new MenuBarView();
        MenuBar menuBar = menuBarView.getMenuBar(stage);

        raiz.getChildren().addAll(menuBar, lblProduto, txtNomeProduto, lblTipoProduto, txtTipoProduto, lblMarca, txtMarcaDoProduto, lblFornecedor, txtFornecedor, lblQuantidade, txtQuantidade, lblPrecoCompra,
                txtPrecoDeCompra, lblNumNota, txtNumNota, lblValidade, txtValidadeDoProduto, lblCodigoProduto, txtCodigoProduto, lblMensagem, btnCadastrar, btnApagar);

            btnCadastrar.setOnAction(Event ->{
                produtos produtos = new produtos(txtNomeProduto.getText(), txtTipoProduto.getText(), txtMarcaDoProduto.getText(), txtFornecedor.getText(), txtQuantidade.getText(), txtPrecoDeCompra.getText(),
                        txtNumNota.getText(), txtValidadeDoProduto.getText(), txtCodigoProduto.getText());

                ConnectionDB connectionDB = new ConnectionDB();
                Connection conn = connectionDB.getConnection();

                String query = "INSERT INTO PRODUTOS (NOME_PRODUTO, TIPO_PRODUTO, MARCA, FORNECEDOR, QUANTIDADE, PRECO_COMPRA, NOTA, VALIDADE, CODIGO_PRODUTO)" + "VALUES ('" + produtos.getNome()
                        + "','" + produtos.getTipoProduto() + "','" + produtos.getMarca() +"','" + produtos.getFornecedor() + "','" + produtos.getQuantidade() + "','" + produtos.getPrecoCompra() + "','" + produtos.getNota() + "','" + produtos.getValidade()
                        +"'," + produtos.getCodigoProduto() + ")";


                try {
                    Statement statement = conn.createStatement();
                    statement.executeUpdate(query);
                } catch (SQLException e){
                    e.printStackTrace();
                }

        });

        btnApagar.setOnAction(event -> {
            txtNomeProduto.setText("");
            txtTipoProduto.setText("");
            txtMarcaDoProduto.setText("");
            txtFornecedor.setText("");
            txtQuantidade.setText("");
            txtPrecoDeCompra.setText("");
            txtNumNota.setText("");
            txtValidadeDoProduto.setText("");
            txtCodigoProduto.setText("");
        });




        return raiz;
    }
}