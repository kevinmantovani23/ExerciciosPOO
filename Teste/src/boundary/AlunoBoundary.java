package boundary;


import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.util.StringConverter;
import javafx.util.converter.NumberStringConverter;
import control.AlunoController;
import entity.Aluno;

public class AlunoBoundary extends Application {
    public AlunoController control = new AlunoController();
    private TableView<Aluno> table = new TableView<Aluno>();
    private StringConverter<Number> converterInt = new NumberStringConverter();
    
    @Override
    public void start(Stage stage){
        BorderPane princ = new BorderPane();
        Scene scn = new Scene(princ, 500, 300);

        GridPane grid = new GridPane();

        Label nometxt = new Label("Nome");
        TextField nomefield = new TextField();
        Label ratxt = new Label("RA");
        TextField rafield = new TextField();
        Label nasctxt = new Label("Nascimento");
        TextField nascfield = new TextField();
        Label mediatxt = new Label("Média");
        TextField mediafield = new TextField();
        Button adc = new Button("Adicionar");
        Button pesq = new Button("Pesquisar");
        Button del = new Button("Deletar");
        princ.setTop(grid);
        princ.setCenter(table);
        grid.add(nometxt, 1, 1);
        grid.add(ratxt, 1, 2);
        grid.add(nasctxt, 1, 3);
        grid.add(mediatxt, 1, 4);
        grid.add(nomefield, 2, 1);
        grid.add(rafield, 2, 2);
        grid.add(nascfield, 2, 3);
        grid.add(mediafield, 2, 4);
        grid.add(adc, 1, 6);
        grid.add(pesq, 2, 6);
        grid.add(del, 1, 7);
        stage.setScene(scn);
        stage.show();

        Bindings.bindBidirectional(control.nome, nomefield.textProperty());
        Bindings.bindBidirectional(rafield.textProperty(), control.ra, converterInt);
        Bindings.bindBidirectional(control.nascimento, nascfield.textProperty());
        Bindings.bindBidirectional(mediafield.textProperty(), control.media, converterInt);

        TableColumn<Aluno, String> columnNome = new TableColumn<>("Nome");
        columnNome.setCellValueFactory(
            new PropertyValueFactory<>("nome"));
        TableColumn<Aluno, Integer> columnRa = new TableColumn<>("RA");
        columnRa.setCellValueFactory(
            new PropertyValueFactory<>("ra"));
        TableColumn<Aluno, String> columnNasc = new TableColumn<>("Data de Nascimento");
        columnNasc.setCellValueFactory(
            new PropertyValueFactory<>("nascimento"));
        TableColumn<Aluno, Double> columnMedia = new TableColumn<>("Média");
        columnMedia.setCellValueFactory(
            new PropertyValueFactory<>("media"));
        
        table.getColumns().addAll(columnNome, columnRa, columnNasc, columnMedia);
        table.setItems( control.getLista());
        
        del.addEventFilter(ActionEvent.ACTION,
         e -> {
        	 Aluno aDel = table.getSelectionModel().getSelectedItem();
        	 control.deletar(aDel);
         });
        adc.addEventFilter(ActionEvent.ANY , 
         e -> {
            control.salvar();
        });

        pesq.addEventFilter(ActionEvent.ANY, 
         e -> {
            control.pesquisar();
         });

    }
    public static void main (String args[]){
        Application.launch(AlunoBoundary.class, args);
    }

}
