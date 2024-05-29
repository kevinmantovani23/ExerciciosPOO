import java.util.ArrayList;
import java.util.List;

public class VestuarioControl{
	
	List<Vestuario> lista = new ArrayList<>();

	public void cadastrar(Vestuario v){
		lista.add(v);
	}
	
	public Vestuario pesquisar(String type){
		for (Vestuario v : lista){
			if (v.getTipo().equals(type)){
				return (v);
			}
		}
		return (null);
	}
	
}
