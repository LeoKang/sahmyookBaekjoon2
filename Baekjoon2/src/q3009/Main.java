package q3009;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Integer, Integer> mapX = new HashMap<>();
		Map<Integer, Integer> mapY = new HashMap<>();
		for (int i = 0; i < 3; i++) {
			int inpX = sc.nextInt();
			int cnt = 0;
			if (mapX.containsKey(inpX)) {
				cnt = mapX.get(inpX);
			}
			mapX.put(inpX, cnt + 1);
			
			int inpY = sc.nextInt();
			cnt = 0;
			if (mapY.containsKey(inpY)) {
				cnt = mapY.get(inpY);
			}
			mapY.put(inpY, cnt + 1);
		}
		sc.close();

//		System.out.println("MapX => ");
		int xValue = 0;
		for (Map.Entry<Integer, Integer> entry : mapX.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
			if(entry.getValue() == 1)
				xValue = entry.getKey();
		}
		
		int yValue = 0;
//		System.out.println("\nMapY => ");
		for (Map.Entry<Integer, Integer> entry : mapY.entrySet()) {
//			System.out.println(entry.getKey() + " : " + entry.getValue());
			if(entry.getValue() == 1)
				yValue = entry.getKey();
		}

		System.out.println(xValue + " " + yValue);
	}
}
