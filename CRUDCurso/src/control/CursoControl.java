package control;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import entity.Curso;

public class CursoControl {
	
	private IntegerProperty id = new SimpleIntegerProperty(0);
	private StringProperty nome = new SimpleStringProperty("");
	private IntegerProperty cod = new SimpleIntegerProperty(0);
	private StringProperty nomeCoord = new SimpleStringProperty("");
	private IntegerProperty qntAluno = new SimpleIntegerProperty(0);
	
	ObservableList<Curso> lista = FXCollections.observableArrayList();
	
	public void adicionar() {
		Curso c = new Curso();
		c.setId(id.get());
		c.setNome(nome.get());
		c.setCod(cod.get());
		c.setNomeCoord(nomeCoord.get());
		c.setQntAluno(qntAluno.get());
		lista.add(c);
		limpar();
	}
	
	private void limpar() {
		id.set(0);
		nome.set("");
		cod.set(0);
		nomeCoord.set("");
		qntAluno.set(0);
	}
	
	public void pesquisar() {
		for (Curso c : lista) {
			if(c.getId() == id.get()) {
				nome.set(c.getNome());
				cod.set(c.getCod());
				nomeCoord.set(c.getNomeCoord());
				qntAluno.set(c.getQntAluno());
			}
		}
	}
	
	public IntegerProperty gId() {
		return id;
	}
	public StringProperty gNome() {
		return nome;
	}
	public IntegerProperty gCod() {
		return cod;
	}
	public StringProperty gNomeCoord() {
		return nomeCoord;
	}
	public IntegerProperty gQntAluno() {
		return qntAluno;
	}
}
