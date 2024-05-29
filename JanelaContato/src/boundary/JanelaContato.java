package boundary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class JanelaContato extends Application {
	
	public void start(Stage stage) {
		GridPane janelaPane = new GridPane();
		Scene sc = new Scene(janelaPane, 400, 160);
		Label txtfone = new Label("Telefone: ");
		Label txtid = new Label("ID: ");
		Label txtnome = new Label("Nome: ");
		Button botaoS = new Button("Salvar");
		Button botaoP = new Button("Pesquisar");
		TextField fieldfone = new TextField();
		fieldfone.setPrefWidth(250);
		TextField fieldid = new TextField();
		fieldid.setPrefWidth(250);
		TextField fieldnome = new TextField();
		fieldnome.setPrefWidth(250);
		
		janelaPane.setHgap(10);
		janelaPane.setVgap(10);
		janelaPane.add(txtid, 1, 1);
		janelaPane.add(txtnome, 1, 2);
		janelaPane.add(txtfone, 1, 3);
		janelaPane.add(botaoS, 1, 5);
		janelaPane.add(botaoP, 2, 5);
		janelaPane.add(fieldid, 2, 1);
		janelaPane.add(fieldnome, 2, 2);
		janelaPane.add(fieldfone, 2, 3);
		stage.setScene(sc);
		stage.show();
	}
	
	public static void main (String args[]) {
		Application.launch(JanelaContato.class, args);
	}
}
