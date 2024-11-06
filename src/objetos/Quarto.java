package objetos;

public class Quarto {
	
	private int numero;
	private String tipo;
	private double preco;
	private Boolean disponivel;
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public Boolean getDisponivel() {
		return disponivel;
	}
	public void setDisponivel(Boolean disponivel) {
		this.disponivel = disponivel;
	}
	public Quarto(int numero, String tipo, double preco, Boolean disponivel) {
		super();
		this.numero = numero;
		this.tipo = tipo;
		this.preco = preco;
		this.disponivel = disponivel;
	}
	public Quarto() {
		super();
	}
	@Override
	public String toString() {
		return "Quarto [numero=" + numero + ", tipo=" + tipo + ", preco=" + preco + "]";
	}
	
	

}
