package br.edu.univas.br;

import java.util.ArrayList;
import java.util.Scanner;

public class Databese {
	
	private ArrayList<Doador> doador = new ArrayList();
	
	//private Map<String, long,> mapaNomes = new HashMap<String, long>();
	
	
	public static void adicionoarDoador(Scanner scanner ,ArrayList <Doador>doadores) {
		
		System.out.println("Infome o cp0f do Doador");
		long doacao = scanner.nextLong();
		
		
		doadores.add(doacao);
		
	}
	public static void adicionarDoacao(String tipoSanguinio,long quantidade)thows {
		
		
	}
}