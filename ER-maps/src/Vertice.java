import java.util.ArrayList;

public class Vertice {
	private String nome;
	private ArrayList<Aresta> arestasEntrada;
	private ArrayList<Aresta> arestasSaida;
	
	public Vertice(String dado) {
		this.setNome(dado);
		this.setArestasEntrada(new ArrayList<Aresta>());
		this.setArestasSaida(new ArrayList<Aresta>());

	}
	
	public void addArestaEntrada(Aresta aresta) {
		this.arestasEntrada.add(aresta);
	}
	
	public void addArestaSaida(Aresta aresta) {
		this.arestasSaida.add(aresta);
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public ArrayList<Aresta> getArestasEntrada() {
		return arestasEntrada;
	}

	public void setArestasEntrada(ArrayList<Aresta> arestasEntrada) {
		this.arestasEntrada = arestasEntrada;
	}

	public ArrayList<Aresta> getArestasSaida() {
		return arestasSaida;
	}

	public void setArestasSaida(ArrayList<Aresta> arestasSaida) {
		this.arestasSaida = arestasSaida;
	}

}
