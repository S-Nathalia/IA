
public class Main {

	public static void main(String[] args) {
		Grafo grafo = new Grafo();
		grafo.addVertice("Magano");
		grafo.addVertice("Boa Vista");
		grafo.addVertice("Heliopolis");
		grafo.addVertice("Raposa");
		
		grafo.addAresta("Magano", "Boa Vista", 2.2, 5);
		grafo.addAresta("Boa Vista", "Raposa", 5.1, 10.1);
		grafo.addAresta("Raposa", "Heliopolis", 5.1, 10.1);

		grafo.search();
	}
}
