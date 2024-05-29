package boundary;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import control.CursoControl;

public class CursoBoundary extends Application {

	private StringConverter<Number> conversor = new NumberStringConverter();
	private CursoControl control = new CursoControl();
	private Label labelId = new Label("Id");
	private TextField txtId = new TextField();
	private Label labelNome = new Label("Nome");
	private TextField txtNome = new TextField();
	private Label labelCod = new Label("Codigo do Curso");
	private TextField txtCod = new TextField();
	private Label labelCoord = new Label("Nome do coordenador");
	private TextField txtCoord = new TextField();
	private Label labelQntd = new Label("Quantidade de Alunos");
	private TextField txtQntd = new TextField();
	private Button adicionar = new Button("Adicionar");
	private Button pesquisar = new Button("Pesquisar");

	@Override
	public void start(Stage stage) {
		GridPane grid = new GridPane();
		Scene sc = new Scene(grid, 320, 150);
		stage.setTitle("Gestão de Cursos");
		grid.add(labelId, 0, 0);
		grid.add(txtId, 1, 0);
		grid.add(labelNome, 0, 1);
		grid.add(txtNome, 1, 1);
		grid.add(labelCod, 0, 2);
		grid.add(txtCod, 1, 2);
		grid.add(labelCoord, 0, 3);
		grid.add(txtCoord, 1, 3);
		grid.add(labelQntd, 0, 4);
		grid.add(txtQntd, 1, 4);
		grid.add(adicionar, 0, 5);
		grid.add(pesquisar, 1, 5);
		grid.setHgap(4);
		bind();
		botoes();

		stage.setScene(sc);
		stage.show();
	}

	private void bind() {
		Bindings.bindBidirectional(txtId.textProperty(), control.gId(), conversor);
		Bindings.bindBidirectional(txtNome.textProperty(), control.gNome());
		Bindings.bindBidirectional(txtCod.textProperty(), control.gCod(), conversor);
		Bindings.bindBidirectional(txtCoord.textProperty(), control.gNomeCoord());
		Bindings.bindBidirectional(txtQntd.textProperty(), control.gQntAluno(), conversor);
	}

	private void botoes() {
		adicionar.addEventFilter(ActionEvent.ANY, e -> {
			control.adicionar();
		});
		
		pesquisar.addEventFilter(ActionEvent.ANY, e -> {
			control.pesquisar();
		});
	}

	public static void main(String[] args) {
		Application.launch(CursoBoundary.class, args);
	}

}
