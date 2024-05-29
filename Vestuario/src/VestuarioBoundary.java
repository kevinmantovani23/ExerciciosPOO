import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class VestuarioBoundary extends Application {
	private VestuarioControl control = new VestuarioControl();
	private TextField txtTipo = new TextField();
	private TextField txtCor = new TextField();
	private TextField txtTamanho = new TextField();

	@Override
	public void start(Stage stage){
		GridPane grid = new GridPane();
		Scene sc = new Scene(grid);
		Label labTipo = new Label("Tipo:");
		Label labCor = new Label("Cor:");
		Label labTamanho = new Label("Tamanho:");
		Button salvar = new Button("Salvar");
		Button pesquisar = new Button("Pesquisar");
		grid.add(labTipo, 1, 1);
		grid.add(txtTipo, 2, 1);
		grid.add(labCor, 1, 2);
		grid.add(txtCor, 2, 2);
		grid.add(labTamanho, 1, 3);
		grid.add(txtTamanho, 2, 3);
		grid.add(salvar, 1, 4);
		grid.add(pesquisar, 2, 4);
		stage.setScene(sc);
		stage.show();
		
		salvar.addEventFilter(ActionEvent.ANY,
		e -> {
			control.cadastrar(paraEntidade());
		});

		pesquisar.addEventFilter(ActionEvent.ANY,
		e -> {
			paraTela(control.pesquisar(txtTipo.getText()));
		});
	}

	public Vestuario paraEntidade(){
		Vestuario v = new Vestuario();
		v.setTipo(txtTipo.getText());
		v.setCor(txtCor.getText());
		v.setTamanho(txtTamanho.getText());
		return(v);
	}

	public void paraTela(Vestuario v){
		txtTipo.setText(v.getTipo());
		txtCor.setText(v.getCor());
		txtTamanho.setText(v.getTamanho());
	}
	
	public static void main (String [] args){
		Application.launch(VestuarioBoundary.class, args);
	}
}
		
