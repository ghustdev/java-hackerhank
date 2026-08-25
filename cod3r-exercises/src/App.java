import initial.code.Artigo;

import java.math.BigDecimal;
import java.time.*;
import java.util.*;
import java.lang.Math;

import POO.EstudoPOO;
import lambdas.DesafioLambda;

public class App {
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Hello, World!");
		
		Artigo artigo1 = new Artigo("Java Basics", "John Doe", LocalDate.of(2023, 1, 15), "Programming");
		
		System.out.println(artigo1);
		artigo1.countHello();
		if (args.length > 0) {
			System.out.println("Primeiro argumento: " + args[args.length - 1]);
		}
		
		Date data = new Date();
		System.out.println(data);
		
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
				+ sobrenome + "\nIdade: " + idade +
				"\nSalario: " + salario + "\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		
		String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
				nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10));
		
		String n1 = "7.9";
		String n2 = "8.3";
		
		System.out.println(n1);
		System.out.println(n2);
		
		BigDecimal numero1 = new BigDecimal(n1);
		BigDecimal numero2 = new BigDecimal(n2);
//		Double numero1 = Double.parseDouble(n1);
//		Double numero2 = Double.parseDouble(n2);
		
		System.out.println(numero1);
		System.out.println(numero2);
		
		BigDecimal soma = numero1.add(numero2);
//		Double soma = numero1 + numero2;
		
		System.out.println(soma);
		
		System.out.println(Math.abs(-10));
		System.out.println((int) Math.pow(2, 4));
		
		System.out.println(1 ^ 3);
		System.out.println(1 ^ 1);
		
		/* System.out.println("Quantidade de notas: ");
		int qtd = scan.nextInt(); scan.nextLine();
		
		double[] notas = new double[qtd];
		int aux = qtd;
		 */
		/* while (qtd != 0) {
			System.out.printf("Nota %d: ", aux - qtd + 1);
			notas[aux - qtd] = scan.nextInt(); scan.nextLine();
			qtd--;
		}
		
		for (double nota : notas) {
			System.out.println(nota);
		} */

		// Collections Java
		HashSet<Integer> numeros = new HashSet<>(); // desconsidera ordem
		TreeSet<Integer> numeros2 = new TreeSet<>(); // considera ordem de inserção
		numeros.add(10);
		numeros.add(10);
		numeros.add(20);
		numeros.add(20);
		numeros.add(null);
		// remove
		// contains
		// //size
		// clear
		System.out.println(numeros);

		// int less = null;

		ArrayList<String> nomes = new ArrayList<>();
		ArrayList<Integer> testes = new ArrayList<>();
		List<String> tess = new ArrayList<>();
		List<String> tes = new LinkedList<>();
		// add
		// get
		// set
		// remove
		// size
		// contains -> usa método hashCode para comparar a posição da memória

		Queue<Integer> fila = new LinkedList<>();
		fila.add(1);
		fila.add(2);
		System.out.println(fila);
		System.out.println(fila.poll());
		fila.remove();
		System.out.println(fila.peek()); // obtem proximo elemento
		System.out.println(fila);

		Stack<Integer> stack = new Stack<>();
		Deque<Integer> pilha = new ArrayDeque<>();
		stack.add(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		System.out.println(stack.peek());

		// Complexidade algoritmico O(1) na maioria dos casos
		Map<Integer, String> cadastro = new HashMap<>();
		cadastro.put(1, "Gustavo");
		cadastro.put(1, "Felipe");
		cadastro.put(2, "Ster");
		System.out.println(cadastro);
		cadastro.put(3, "Ster");
		System.out.println(cadastro.keySet());
		System.out.println(cadastro.values());
		System.out.println(cadastro.entrySet());
		// containsKey
		// constainsValue

		// hashCode -- Atrelado ao contains

		System.out.println("teste");

		EstudoPOO poo = new EstudoPOO();

		StringBuilder sb = new StringBuilder("texto");
		
		// Lambdas e Streams
		//		DesafioLambda desafio = new DesafioLambda();
		
		// Classes Uteis:
		
		Date date = new Date();
		System.out.println(date);
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		System.out.println(cal.get(Calendar.MINUTE));
		
		Instant instant = cal.toInstant();
		System.out.println(instant);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println(zonedDateTime);
		
		ZoneId fusoSp = ZoneId.of("America/Bahia");
		System.out.println(fusoSp);
		
		// OffsetDateTime para serialização em APIs REST
		OffsetDateTime offsetUtc = OffsetDateTime.now(ZoneOffset.UTC);
		System.out.println(offsetUtc);
		System.out.println(offsetUtc.isEqual(offsetUtc));
		
		int[] arr = new int[5];
		
		for (int n: arr) {
			System.out.println(n);
		}
	}
}
