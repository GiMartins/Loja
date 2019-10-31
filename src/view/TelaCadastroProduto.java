package view;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class TelaCadastroProduto{

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
        Label lblCodigoBarras = new Label("Código de Barras");
        Label lblMensagem = new Label("");

        TextField txtNomeProduto = new TextField();
        TextField txtTipoProduto = new TextField();
        TextField txtMarcaDoProduto = new TextField();
        TextField txtFornecedor = new TextField();
        TextField txtQuantidade = new TextField();
        TextField txtPrecoDeCompra = new TextField();
        TextField txtNumNota = new TextField();
        TextField txtValidadeDoProduto = new TextField();
        TextField txtCodigoDeBarras = new TextField();


        Button btnCadastrar = new Button("Cadastrar");
        Button btnApagar = new Button("Apagar");

        raiz.getChildren().addAll(lblProduto, txtNomeProduto, lblTipoProduto, txtTipoProduto, lblMarca, txtMarcaDoProduto, lblFornecedor, txtFornecedor, lblQuantidade, txtQuantidade, lblPrecoCompra,
                txtPrecoDeCompra, lblNumNota, txtNumNota, lblValidade, txtValidadeDoProduto, lblCodigoBarras, txtCodigoDeBarras, lblMensagem, btnCadastrar, btnApagar);



        return raiz;
    }
}