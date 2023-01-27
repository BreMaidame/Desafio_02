package Desafio_02;

public class Desafio_02 {
	
	public static void main(String[] args) {
		
		System.out.println("Bem vindo ao Registro Ubuntu 1.0 \n");
		
		String nome1 = "José Pereira da Silva";
		int idade1 = 53;
		double peso1 = 72.50;
		float altura1 = 1.70F;
		boolean ehDev1 = false;
		double imc1 = peso1 / (altura1*altura1) ;
		
		String nome2 = "Ricardo de Oliveira";
		int idade2 = 44;
		double peso2 = 88.00;
		float altura2 = 1.80F;
		boolean ehDev2 = true;
		double imc2 = peso2 / (altura2*altura2) ;
		
		String nome3 = "Geovana da Silva";
		int idade3 = 27;
		double peso3 = 64.40;
		float altura3 = 1.75F;
		boolean ehDev3 = false;
		double imc3 = peso3 / (altura3*altura3) ;
		
		String nome4 = "Nilton José Paiva";
		int idade4 = 66;
		double peso4 = 69.33;
		float altura4 = 1.68F;
		boolean ehDev4 = false;
		double imc4 = peso4 / (altura4*altura4) ;
		
		String nome5 = "Guilhermina dos Santos";
		int idade5 = 74;
		double peso5 = 71.50;
		float altura5 = 1.78F;
		boolean ehDev5 = true;
		double imc5 = peso5 / (altura5*altura5) ;
		
		String espaçament = "-".repeat(30);
		System.out.println (espaçament);
		System.out.println ("      Fichas dos Ubuntu's");
		System.out.println (espaçament);
		System.out.println ("Nome: " + nome1);
		System.out.println ("Idade: " + idade1 + " anos");
		System.out.println ("Peso: " + peso1 + " Kgs");
		System.out.println ("Altura: " + altura1);
		System.out.println ("É Dev? " + ehDev1);
		System.out.println (espaçament);
		
		System.out.println (espaçament);
		System.out.println ("Nome: " + nome2);
		System.out.println ("Idade: " + idade2 + " anos");
		System.out.println ("Peso: " + peso2 + " Kgs");
		System.out.println ("Altura: " + altura2);
		System.out.println ("É Dev? " + ehDev2);
		System.out.println (espaçament);
		
		System.out.println (espaçament);
		System.out.println ("Nome: " + nome3);
		System.out.println ("Idade: " + idade3 + " anos");
		System.out.println ("Peso: " + peso3 + " Kgs");
		System.out.println ("Altura: " + altura3);
		System.out.println ("É Dev? " + ehDev3);
		System.out.println (espaçament);

		System.out.println (espaçament);
		System.out.println ("Nome: " + nome4);
		System.out.println ("Idade: " + idade4 + " anos");
		System.out.println ("Peso: " + peso4 + " Kgs");
		System.out.println ("Altura: " + altura4);
		System.out.println ("É Dev? " + ehDev4);
		System.out.println (espaçament);
		
		System.out.println (espaçament);
		System.out.println ("Nome: " + nome5);
		System.out.println ("Idade: " + idade5 + " anos");
		System.out.println ("Peso: " + peso5 + " Kgs");
		System.out.println ("Altura: " + altura5);
		System.out.println ("É Dev? " + ehDev5);
		System.out.println (espaçament);
		
		System.out.println ("\n");
		String nextline = "-----/".repeat(15);
		System.out.println (nextline);
		System.out.println ("\n");
		
		int idadetotal = (idade1 + idade2 + idade3 + idade4 + idade5);
		System.out.println ("- A idade de todos os Ubuntu's somadas é igual a: " + idadetotal + " Anos");
		
		String equipeNom = (nome1 + ", " + nome2 + ", " + nome3 + ", " + nome4 + " e " + nome5);
		System.out.println ("- Nossa equipe é formada por: " + equipeNom);
		
		double medIMC = ((imc1 + imc2 + imc3 + imc4 + imc5) / 5);
		double medIMCdec = medIMC;
		medIMCdec = Math.round(medIMCdec * 100.0) / 100.0;
		System.out.println("- A média do Indice de Massa Corporal da equipe é: " + medIMCdec);
		
		int contador = 0;

		if (ehDev1 == true) {
		contador++;
		}

		if (ehDev2 == true) {
		contador++;
		}

		if (ehDev3 == true) {
		contador++;
		}

		if (ehDev4 == true) {
		contador++;
		}

		if (ehDev5 == true) {
		contador++;
		}

		System.out.println("- Nessa equipe temos " + contador + " dev's");
		
		System.out.println("- Na equipe também temos duas pessoas da mesam família: ");

		if(nome1.toLowerCase().contains("silva")) {
			System.out.println("- " + nome1);
		}
		if(nome2.toLowerCase().contains("silva")) {
			System.out.println("- " + nome2);
		}
		if(nome3.toLowerCase().contains("silva")) {
			System.out.println("- " + nome3);
		}
		if(nome4.toLowerCase().contains("silva")) {
			System.out.println("- " + nome4);
		}
		if(nome5.toLowerCase().contains("silva")) {
			System.out.println("- " + nome5);
		}
		System.out.println ("\n");
		System.out.println (nextline);
	}

}
