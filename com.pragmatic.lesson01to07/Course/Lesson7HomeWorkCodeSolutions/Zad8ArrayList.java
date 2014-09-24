package Lesson7HomeWorkCodeSolutions;

import java.util.ArrayList;
import java.util.List;

public class Zad8ArrayList {

	public static void main(String[] args) {
		
		List arrayList = new ArrayList<>();
		arrayList.add(2);
		arrayList.add(1);
		arrayList.add(1);
		arrayList.add(3);
		arrayList.add(3);
		arrayList.add(6);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(5);
		arrayList.add(6);
		
		int index = 0;// startov index na tekushtata redica
		int count = 1;// dyljina na tekushtata redica
		int bestIndex = 0;// startov index na nai-dylgata redica
		int bestCount = 0;// daljina na nai-dylgata redica
		
		for (int i = 0; i < arrayList.size(); i++) {
			if(i == 0 || arrayList.get(i) != arrayList.get(i-1)){
				count = 1;
				index = i;
			}else {
				count++;
				if(count > bestCount){
					bestIndex = index;
					bestCount = count;
				}
			}
		}
		for (int j = bestIndex; j < bestIndex + bestCount; j++) {
			System.out.print(arrayList.get(j) + " ");
		}

	}

}
