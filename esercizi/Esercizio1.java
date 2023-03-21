package esercizi;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Esercizio1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		Set<String> arr = new HashSet<String>();
		List<String> list = new ArrayList<String>();
		
		System.out.println("Inserire il numero di elementi che si desidera aggiungere all'array");
		int numberOfElements = s.nextInt();
		s.nextLine();
		
		int counter = 0;
		for(int i = 0; i < numberOfElements; i++) {
			
			System.out.println("Inserire la stringa numero " + i);
			String str = s.nextLine();
			boolean added = arr.add(str);
			if(!added) {
				list.add(str);
			} else {
				counter++;
			}
		}
		
		System.out.println("lista parole ripetute: ");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		
		System.out.println("il numero di parole distinte è " + counter);
		
		System.out.println("lista parole distinte:");
		for(String str : arr) {
			System.out.println(str);
		}
	}

}
