//Instagram @brevetecno

import java.util.*;

public class RandomNumbers{
	
	public static void main(String args[]){
		
		Random r = new Random();
		
		String resultado = "Números sorteados: ";
		
		int ran[] = new int[6];
		
		for(int i = 0; i < 6; i++){
			ran[i] = r.nextInt(60) + 1;
			if(i < 5){
				resultado += String.valueOf(ran[i]).toString() + " - ";
			}else{
				resultado += String.valueOf(ran[i]).toString();
			}
		}  
		
		System.out.println(resultado);
	
	}
}
