package boundary;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.util.StringConverter;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;
import control.EstoqueController;

public class EstoqueBoundary extends Application {
	
	public void start(Stage stage) {
		
		StringConverter<Number> converter = new NumberStringConverter();
		
		EstoqueController control = new EstoqueController();
		BorderPane principal = new BorderPane();
		Scene sc = new Scene (principal, 400, 200);
		GridPane grid = new GridPane();
		principal.setTop(grid);
		Label labelnome = new Label("Nome:");
		TextField txtnome = new TextField();
		Label labelmarca = new Label("Marca:");
		TextField txtmarca = new TextField();
		Label labelcor = new Label("Cor:");
		TextField txtcor = new TextField();
		Label labelano = new Label("Ano:");
		TextField txtano = new TextField();
		Label labeltamanho = new Label("Tamanho:");
		TextField txttamanho = new TextField();
		Label labelsexo = new Label("Sexo:");
		TextField txtsexo = new TextField();
		Button salvar = new Button("Salvar");
		Button pesquisar = new Button("Pesquisar");
		
		Bindings.bindBidirectional(control.nomeP(), txtnome.textProperty());
		Bindings.bindBidirectional(control.marcaP(), txtmarca.textProperty());
		Bindings.bindBidirectional(control.corP(), txtcor.textProperty());
		Bindings.bindBidirectional(txtano.textProperty(), control.anoP(), converter);
		Bindings.bindBidirectional(txttamanho.textProperty(), control.tamanhoP(), converter);
		Bindings.bindBidirectional(control.sexoP(), txtsexo.textProperty());
		
		salvar.addEventFilter(ActionEvent.ANY, 
				e -> {
					control.gravar();
				});
		pesquisar.addEventFilter(ActionEvent.ANY, 
				e -> {
					if(control.pesquisar()) {
						Stage stg = new Stage();
						stg.show();
					};
				});
		
		grid.add(labelnome, 0, 0);
		grid.add(labelmarca, 0, 1);
		grid.add(labelano, 0, 2);
		grid.add(labelcor, 0, 3);
		grid.add(labeltamanho, 0, 4);
		grid.add(labelsexo, 0, 5);
		grid.add(txtnome, 1, 0);
		grid.add(txtmarca, 1, 1);
		grid.add(txtano, 1, 2);
		grid.add(txtcor, 1, 3);
		grid.add(txttamanho, 1, 4);
		grid.add(txtsexo, 1, 5);
		grid.add(salvar, 0, 7);
		grid.add(pesquisar, 1, 7);
		
		stage.setScene(sc);
		stage.show();
	}
	
	
	public static void main(String [] args) {
		Application.launch(EstoqueBoundary.class, args);
	}
}
