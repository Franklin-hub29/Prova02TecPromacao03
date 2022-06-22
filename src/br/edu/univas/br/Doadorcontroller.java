package br.edu.univas.br;

import java.util.Scanner;

public class Doadorcontroller {
	
	public static void  CadastraDoador(long cpf,String tipoSaguinio) {
		Scanner scanner = new Scanner(System.in);
		Doador doador = null ;
		try {
		System.out.println("Informe o CPF");
		doador.setCpf(scanner.nextLong());
		System.out.println("Infome o tipo sanguinio");
		doador.setTipoSanguinio(scanner.nextLine());
		
		} catch (CustomerException e) {
			
		}
		
	}
	
	public static void CadastrarDoacao(String tipoSanguinio,long quantidade) {
		
	}
	

}
