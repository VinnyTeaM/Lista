package app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exemplo {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		// recebe a posição e o elemento.
		list.add(2, "Marco");

		// tamanho da lista
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-------------------");

		/*
		 * remove da lista list.remove("Anna");
		 */

		// remover com condição
		list.removeIf(x -> x.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}

		System.out.println("-------------------");
		// encontrar posição de um elemento, quando ele não encontra elemento retorna
		// -1.
		System.out.println("Index of Bob: " + list.indexOf("Bob"));

		System.out.println("-------------------");
		/*
		 * adiciona com condição, pega lista converte para String,list stream faz
		 * operação lambda e Filter devolve String filtrado conforme a codição, Collect
		 * converte stream para lista
		 */
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}

		System.out.println("-------------------");
		/*
		 * encontra elemento da lista com uma condição, chama findFirst vai pegar
		 * primeiro elemento da String que atenda a condição, orElse se não existi
		 * retorna null.
		 */
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}

}
