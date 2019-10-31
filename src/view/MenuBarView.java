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


        cadastrar.getItems().addAll(cadastrarCliente, cadastrarProduto, cadastrarFornecedor);

        menuBar.getMenus().addAll(cadastrar);

        cadastrarProduto.setOnAction(event -> {
        stg.setTitle("Cadastrar Produtos");
        TelaCadastroProduto TelaCadastroProdutos = new TelaCadastroProduto();
        stg.setScene(new Scene(TelaCadastroProdutos.getTelaProdutos(stg), 500, 275));
        stg.show();
    });


        return menuBar;
    }

}