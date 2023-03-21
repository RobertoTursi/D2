package esercizi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Esercizio2 {
	static Scanner s = new Scanner(System.in);
	public static void main(String[] args) {
		
		List<Integer> arr = createArray();
		
		print(arr);
		
		List<Integer> shuffleArr = shuffle(arr);
		print(shuffleArr);
		
		oddOrEven(shuffleArr, false);
		
	}
	static List<Integer> createArray(){
		System.out.println("Inserisci la lunghezza dell'array");
		int arrayLength = s.nextInt();
		
		List<Integer> arr = new ArrayList<Integer>();
		for(int i = 0; i < arrayLength; i++) {
			int number = (int) Math.round(Math.random()*100);
			arr.add(number);
		}
		return arr;
	}
	
	static List<Integer> shuffle(List<Integer> arr) {
		List<Integer> firstArray = arr;
		Collections.shuffle(arr);
			
		return arr;		
	}
	
	
	static void oddOrEven(List<Integer> arr, boolean b) {
		for(int i = 0; i < arr.size(); i++) {
			if(b == true && arr.get(i) %2 == 0) {
				System.out.print(arr.get(i) + " ");
			} else if(b == false && arr.get(i) %2 != 0) {
				System.out.print(arr.get(i) + " ");
			}
		}
	}
	
	static void print(List<Integer> arr) {
		for(int i = 0; i < arr.size(); i++) {
			Integer number = arr.get(i);
			System.out.print(number + " ");
		}
		System.out.println();
	}
}
