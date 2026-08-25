package lambdas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Produto {
	private String nome;
	private BigDecimal preco;
	private BigDecimal desconto;
	
	public Produto(String nome, BigDecimal preco, BigDecimal desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public BigDecimal calcularDesconto() {
		return this.preco.subtract(this.preco.multiply(this.desconto)).setScale(2, RoundingMode.HALF_UP);
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public BigDecimal getPreco() {
		return preco;
	}
	
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	
	public BigDecimal getDesconto() {
		return desconto;
	}
	
	public void setDesconto(BigDecimal desconto) {
		this.desconto = desconto;
	}
}
