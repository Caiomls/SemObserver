/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semobservador;

import java.util.Scanner;


public class SemObservador {

	public static void main(String[] args) {
		System.out.println("Vers縊 SEM Observer. \n");

		Pessoa pJoao = new Pessoa("Jo縊", "12345678");
		Pessoa pMaria = new Pessoa("Maria", "98765432");
		
		SecretariaEletronica sABC = new SecretariaEletronica("ABC", "X25");
		
		Fax fax123 = new Fax("Motorola", 123456);
		
		Telefone telefone1 = new Telefone("9999-9999");
		Telefone telefone2 = new Telefone("8888-8888");
		
		
		Scanner scanner = new Scanner(System.in);
		
		String cmd = "";
		
		while (!cmd.equalsIgnoreCase("exit")) {
			System.out.print("Digite o comando: ");
			cmd = scanner.nextLine();
			
			String[] cmdSplited = cmd.split(" ");
			
			if (cmdSplited.length == 2) {				
				Telefone t = telefone1;
				if (cmdSplited[1].equals("2"))
					t = telefone2;
				
				if (cmdSplited[0].equalsIgnoreCase("t")) {
					t.tocar();
				} else if (cmdSplited[0].equalsIgnoreCase("a")) {
					t.atender();
				} else if (cmdSplited[0].equalsIgnoreCase("d")) {
					t.desligar();
				}
			}
				
			
		}
		System.out.println("Good by!");
		
	}

}
