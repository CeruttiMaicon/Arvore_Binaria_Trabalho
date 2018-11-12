package arvore.binaria;

public class Main {

	public static void main(String[] args)  {
		Arvore<Integer> a = new Arvore<>();
		
		a.adiciona(15);
		a.adiciona(24);
		a.adiciona(49);
		a.adiciona(10);
		a.adiciona(8);
		a.adiciona(67);
		a.adiciona(59);
		a.adiciona(9);
		a.adiciona(13);
		
	
		
		BTreePrinter.printNode(a.raiz);

	}

}
