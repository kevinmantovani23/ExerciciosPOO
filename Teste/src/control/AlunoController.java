package control;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import entity.Aluno;

public class AlunoController {
    public StringProperty nome = new SimpleStringProperty("");
    public IntegerProperty ra = new SimpleIntegerProperty();
    public StringProperty nascimento = new SimpleStringProperty("");
    public DoubleProperty media = new SimpleDoubleProperty();

    private ObservableList<Aluno> lista = FXCollections.observableArrayList();

    public void salvar(){
        Aluno a = new Aluno();
        a.setNome(nome.get());
        a.setRa(ra.get());
        a.setNascimento(nascimento.get());
        a.setMedia(media.get());
        lista.add(a);
        nome.set(" ");
        ra.set(0);
        nascimento.set(" ");
        media.set(0);

    }

    public void pesquisar(){
        for(Aluno a :lista){
            if (a.getRa() == ra.get()){
                nome.set(a.getNome());
                ra.set(a.getRa());
                nascimento.set(a.getNascimento());
                media.set(a.getMedia());
            }
            }
        }
    
    public void deletar(Aluno aDel) {
    	lista.remove(aDel);
    }

    public ObservableList<Aluno> getLista(){
        return lista;
    }
    }

