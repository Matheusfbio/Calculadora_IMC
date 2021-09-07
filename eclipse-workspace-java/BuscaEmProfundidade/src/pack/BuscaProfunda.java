package pack;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Stack;


@SuppressWarnings("unused")
public class BuscaProfunda {
	
	private static BuscaProfunda instance;
	
	public BuscaProfunda() {
		
	}
	public static BuscaProfunda getInstance() { 
		if(instance == null) {
			return new BuscaProfunda();
		}
			return instance;
	}
	
	public list<string> buscar(Grafo grafo, String origem, String destino){
		Stack<String> pontosNavegados = new Stack<String>();
		LinkedHashSet<String> verticesVisitados = new LinkedHashSet<String>();
		
		Caminho caminho = new Caminho();
		
		pontosNavegaçao.push(origem);
		
		while(!pontosNavegaçao.empty()) {
			String v = pontosNavegados.pop();
			if(v.equals(destino)) {
				break;
			}
			for(Vertice vertice: grafo.getAdjacencias(v)) {
				String rotulo = vertice.getRotulo();
				if(!verticesVisitados.contains(rotulo)) {
					verticesVisitados.add(rotulo);
					caminho.ligar(rotulo, v);
					pontosNavegados.push(rotulo);
				}
			}
		}
		return caminho.gerar(origem, destino);
	}
}
