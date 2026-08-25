package lambdas;

import java.math.BigDecimal;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {
	public static void main(String[] args) {
		Function<Produto, BigDecimal> precoFinal = produto -> produto.getPreco().subtract(produto.getPreco().multiply(produto.getDesconto()));
//		UnaryOperator<BigDecimal> impostoMunicipal = preco -> BigDecimal.valueOf(preco.compareTo(new BigDecimal("2500")) > 0 ? preco.subtract(preco.multiply(BigDecimal.valueOf(0.085))) : preco);
		UnaryOperator<BigDecimal> frete = null;
		UnaryOperator<BigDecimal> arredondar = null;
		Function<BigDecimal, String> formatar = null;
		
		Produto produto = new Produto("iPad", new BigDecimal("3235.89"), new BigDecimal("0.13"));
		
		//		System.out.println(produto.calcularDesconto());
		
		String preco = precoFinal
//				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto);
		
	}
}
