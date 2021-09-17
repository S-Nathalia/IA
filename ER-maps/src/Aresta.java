
public class Aresta {
	private Vertice vertice_a;
	private Vertice vertice_b;
	private double distLinhaReta;
	private double distReal;
	
	public Aresta(Vertice vertice_a, Vertice vertice_b, double distLinhaReta, double distReal) {
		this.vertice_a = vertice_a;
		this.vertice_b = vertice_b;
		this.distLinhaReta = distLinhaReta;
		this.distReal = distReal;
	}
	public Vertice getVertice_a() {
		return vertice_a;
	}
	public void setVertice_a(Vertice vertice_a) {
		this.vertice_a = vertice_a;
	}
	public Vertice getVertice_b() {
		return vertice_b;
	}
	public void setVertice_b(Vertice vertice_b) {
		this.vertice_b = vertice_b;
	}
	public double getDistLinhaReta() {
		return distLinhaReta;
	}
	public void setDistLinhaReta(double distLinhaReta) {
		this.distLinhaReta = distLinhaReta;
	}
	public double getDistReal() {
		return distReal;
	}
	public void setDistReal(double distReal) {
		this.distReal = distReal;
	}

}
