import java.util.ArrayList;

public class Grafo {
	private ArrayList<Vertice> vertices;
	private ArrayList<Aresta> arestas;

	
	public Grafo() {
		this.setVertices(new ArrayList<Vertice>());
		this.setArestas(new ArrayList<Aresta>());
	}
	
	public void addVertice(String dado) {
		Vertice novo_vertice = new Vertice(dado);
		this.vertices.add(novo_vertice);
	}
	
	public void addAresta(String vInicio, String vFim, double distLinhaReta, double distReal) {
		Vertice inicio = this.getVertice(vInicio);
		Vertice fim = this.getVertice(vFim);
		Aresta novaAresta = new Aresta(inicio, fim, distLinhaReta, distReal);
		inicio.addArestaSaida(novaAresta);
		fim.addArestaEntrada(novaAresta);
		this.arestas.add(novaAresta);
	}
	
	public Vertice getVertice(String v) {
		Vertice vertice = new Vertice(v);
		for(int i = 0; i < this.vertices.size(); i++) {
			if(this.vertices.get(i).getNome().equals(vertice)) {
				vertice = this.vertices.get(i);
				break;
			}
		}
		return vertice;
	}
	
    public void search(){
        ArrayList<Vertice> marked = new ArrayList<Vertice>();
        ArrayList<Vertice> fila = new ArrayList<Vertice>();
        Vertice atual = this.vertices.get(0);
        marked.add(atual);
        System.out.println(atual.getNome());
        fila.add(atual);
        while(fila.size() > 0){
            Vertice visitado = fila.get(0);
            for(int i=0; i < visitado.getArestasSaida().size(); i++){
                Vertice proximo = visitado.getArestasSaida().get(i).getVertice_b();
                if (!marked.contains(proximo)){
                    marked.add(proximo);
                    System.out.println(proximo.getNome());
                    fila.add(proximo);
                }
            }
            fila.remove(0);
        }
    }
	
	public ArrayList<Vertice> getVertices() {
		return vertices;
	}
	

	public void setVertices(ArrayList<Vertice> vertices) {
		this.vertices = vertices;
	}

	public ArrayList<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(ArrayList<Aresta> arestas) {
		this.arestas = arestas;
	}

}
