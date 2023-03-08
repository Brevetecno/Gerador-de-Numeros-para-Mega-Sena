import java.util.*;


// Classe de gerar números para Mega-Sena 
// Gerador de 6 números de 1 a 60
public class RandomNumbers{
	
	public static void main(String args[]){
		// Classe de gerar números aleatórios
		Random random = new Random();
		
		// Variavéis
		int numbers[] = new int[6]; // Lista para guardar os 6 números sorteados
		String result = ""; // String que irá guardar os valores a serem mostrado no final
		
		
		for(int i = 0; i < 6; i++){
			
			// Adiciona o novo número sorteado dentro da lista de números
			numbers[i] = random.nextInt(60) + 1;
			
			// Enquanto não chegar no último número irá adicionar um traço para separar os números
			if(i < (6-1)){
				// Adiciona traço
				result += String.valueOf(numbers[i]).toString() + " - ";
			}else{
				// Não adiciona traço depois do último número
				result += String.valueOf(numbers[i]).toString();
			}
		}  
		
		// Mostra o resultado
		System.out.println("Números gerados: " + result);
	
	}
}
