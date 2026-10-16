package Funcoes.intereressantes.Srtring;

public class Main {

	public static void main(String[] args) {
		String nome = " joNas PEREIRA CardoSo ";
		String maiusculo = nome.toUpperCase();
		String minusculo = nome.toLowerCase();
		String semEspacos = nome.trim();
		String substringInicio = nome.substring(6);
		String substring_Inicio_Fim = nome.substring(7, 14);
		int indexOF = nome.indexOf("j");
		int lastindexOF = nome.lastIndexOf("o");
		String Split = "jonas pereira cardoso";
		String[] vetor = Split.split(" ");
		String p1 = vetor[0];
		String p2 = vetor[1];
		String p3 = vetor[2];

		System.out.println("Original:" + nome);
		System.out.println();
		System.out.println("toUpperCase:" + maiusculo);
		System.out.println("toLowerCase:" + minusculo);
		System.out.println("trim:" + semEspacos);
		System.out.println("substring.Inicio:" + substringInicio);
		System.out.println("substring.Inicio.Fim:" + substring_Inicio_Fim);
		System.out.println("indexOF:" + indexOF);
		System.out.println("indexOF:" + lastindexOF);

		for (int i = 0; i < 3; i++) {
			System.out.println(vetor[i]);
		}

	}
}
