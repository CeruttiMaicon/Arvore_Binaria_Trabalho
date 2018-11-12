package arvore.binaria;

public class No<T extends Comparable<T>> {
	public No<T> pai;
	public No<T> esquerda;
	public No<T> direita;

	public T valor;
	
	public No<T> getPai() {
		return pai;
	}

	public void setPai(No<T> pai) {
		this.pai = pai;
	}

	public No<T> getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(No<T> esquerda) {
		this.esquerda = esquerda;
	}

	public No<T> getDireita() {
		return direita;
	}

	public void setDireita(No<T> direita) {
		this.direita = direita;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;
	}

	public No(T valor) {
		this.valor = valor;
	}
}
