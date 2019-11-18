package view;

import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;

public class MenuBarView {

    public MenuBar getMenuBar(Stage stg){

        MenuBar menuBar = new MenuBar();
        Menu cadastrar = new Menu("Cadastrar");
        MenuItem cadastrarCliente = new MenuItem("Cliente");
        MenuItem cadastrarProduto = new MenuItem("Produtos");
        MenuItem cadastrarFornecedor = new MenuItem("Fornecedor");
        Menu listar = new Menu ("Listar");
        MenuItem listarCliente = new MenuItem("Cliente");


        cadastrar.getItems().addAll(cadastrarCliente, cadastrarProduto, cadastrarFornecedor);
        listar.getItems().addAll(listarCliente);

        menuBar.getMenus().addAll(cadastrar, listar);

        cadastrarProduto.setOnAction(event -> {
        stg.setTitle("Cadastrar Produtos");
        TelaCadastroProduto TelaCadastroProdutos = new TelaCadastroProduto();
        stg.setScene(new Scene(TelaCadastroProdutos.getTelaProdutos(stg), 500, 650));
        stg.show();
    });
        cadastrarFornecedor.setOnAction(actionEvent -> {
         stg.setTitle("Cadastrar Fornecedor");
         TelaCadastroFornecedor TelaCadastroFornecedorView = new TelaCadastroFornecedor();
         stg.setScene(new Scene(TelaCadastroFornecedorView.getTelaCadastroFornecedor(stg), 500, 650));
         stg.show();
        });

        cadastrarCliente.setOnAction(event -> {
            stg.setTitle("Cadastrar Cliente");
            TelaCadastroCliente telaCadastroCliente = new TelaCadastroCliente();
            stg.setScene(new Scene(telaCadastroCliente.getTelaCadastro(stg), 500, 650));
            stg.show();
        });

        listarCliente.setOnAction(event -> {
            stg.setTitle("Listar Cliente");
            TelaListarCliente telaListarCliente = new TelaListarCliente();
            stg.setScene(new Scene(telaListarCliente.getTelaListarCliente(stg), 500, 650));
            stg.show();
        });




        return menuBar;
    }

}