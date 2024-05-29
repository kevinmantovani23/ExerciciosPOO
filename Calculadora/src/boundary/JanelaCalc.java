package boundary;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.TilePane;
import javafx.stage.Stage;

public class JanelaCalc extends Application{
	
	@Override
	public void start (Stage stage) {
		TilePane tile = new TilePane();
		GridPane grid = new GridPane();
		
		Button ce = new Button("CE");
		TextField txt = new TextField();
		Scene scn = new Scene(grid);
		String[] botoes = {"1","2","3","+","4","5","6","-","7","8","9",
				"*",".","0","=","/"};
		Button bt[] = new Button[16];
		
		tile.setPrefColumns(4);
		tile.setHgap(9);
		tile.setVgap(9);
		for(int i=0; i<16; i++) {
			bt[i] = new Button(botoes[i]);
			bt[i].setMinSize(80, 80);
			tile.getChildren().add(bt[i]);
		}
		
		grid.setVgap(5);
		grid.setHgap(5);
		grid.add(txt, 0, 2);
		grid.add(ce, 1, 2);
		grid.add(tile, 0, 5);
		stage.setScene(scn);
		stage.show();
	}

	public static void main(String[] args) {
		Application.launch(JanelaCalc.class,args);
	}

}
