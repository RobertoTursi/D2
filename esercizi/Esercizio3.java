package esercizi;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Esercizio3 {

	public static void main(String[] args) {
		Map<String, Integer> rubrica = new HashMap<String, Integer>();
		addToRubrica(rubrica, "Roberto", 12345);
		addToRubrica(rubrica, "Mimmo", 84973);
		addToRubrica(rubrica, "Lazzia", 12098);
		addToRubrica(rubrica, "Marika", 84973);
		
		
		printRubrica(rubrica);
		
		System.out.println();
		
		removeFromRubrica(rubrica, "Roberto");
		printRubrica(rubrica);
		
		searchFromRubricaByName(rubrica, "Roberto");
		searchFromRubricaByName(rubrica, "Mimmo");
		
		searchFromRubricaByNumber(rubrica, 84973);
		searchFromRubricaByNumberSecondVersion(rubrica, 12098);
	}
	static void addToRubrica(Map<String, Integer> rubrica, String nome, Integer numero) {
		rubrica.put(nome, numero);
	}
	
	static void removeFromRubrica(Map<String, Integer> rubrica, String nome) {
		rubrica.remove(nome);
	}
	
	static void searchFromRubricaByName(Map<String, Integer> rubrica, String nome) {
		if(rubrica.containsKey(nome)) {
			System.out.println(rubrica.get(nome));
		} else {
			System.out.println("Nessun riscontro");
		}
	}
	
	static void searchFromRubricaByNumber(Map<String, Integer> rubrica, Integer number) {
		Set<String> keys = rubrica.keySet();
		for(int i = 0; i < keys.size(); i++) {
			if(rubrica.get(keys.toArray()[i]).equals(number)) {
				System.out.println(keys.toArray()[i]);
			} else{
				System.out.println("nessun riscontro");			
}
		}
	}
	
	static void searchFromRubricaByNumberSecondVersion(Map<String, Integer> rubrica, Integer number) {
		Set<String> keys = rubrica.keySet();
		for(String k : keys) {
			long n = rubrica.get(k);
			if(n == number) {
				System.out.println("secondo metodo: " + k);
			} else{
				System.out.println("nessun riscontro");				
}
		}
	}
	
	
	static void printRubrica(Map<String, Integer> rubrica) {
		Set<String> keys = rubrica.keySet();
		for(String elem : keys) {
			System.out.print(elem + ": ");
			System.out.println(rubrica.get(elem));
		}
	}

}
