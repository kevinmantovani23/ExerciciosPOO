package control;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import entity.Tenis;
import javafx.beans.property.DoubleProperty;

public class EstoqueController {

	private StringProperty nome = new SimpleStringProperty("");
	private StringProperty marca = new SimpleStringProperty("");
	private StringProperty cor = new SimpleStringProperty("");
	private IntegerProperty ano = new SimpleIntegerProperty(0);
	private DoubleProperty tamanho = new SimpleDoubleProperty(0);
	private StringProperty sexo = new SimpleStringProperty("");

	private ObservableList<Tenis> lista = FXCollections.observableArrayList();

	public void gravar() {
		Tenis tenis = new Tenis();
		tenis.setNome(nome.get());
		tenis.setMarca(marca.get());
		tenis.setCor(cor.get());
		tenis.setAno(ano.get());
		tenis.setTamanho(tamanho.get());
		tenis.setSexo(sexo.get());
		lista.add(tenis);
		limpar();
	}

	public boolean pesquisar() {
		for (Tenis a : lista) {
			if (a.getNome().equals(nome.get())) {
				nome.set(a.getNome());
				marca.set(a.getMarca());
				cor.set(a.getCor());
				ano.set(a.getAno());
				tamanho.set(a.getTamanho());
				sexo.set(a.getSexo());
				return false;
			}
		}
		return true;
	}
	
	public void limpar() {
		nome.set("");
		marca.set("");
		cor.set("");
		ano.set(0);
		tamanho.set(0);
		sexo.set("");
	}
	
	public StringProperty nomeP () {
		return nome;
	}
	public StringProperty marcaP () {
		return marca;
	}
	public StringProperty corP () {
		return cor;
	}
	public IntegerProperty anoP () {
		return ano;
	}
	public DoubleProperty tamanhoP () {
		return tamanho;
	}
	public StringProperty sexoP () {
		return sexo;
	}
	
}
