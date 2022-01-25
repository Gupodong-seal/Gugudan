//import java.util.Scanner;
//
//public class final_mission {
//	 public static void main(String[] args) {
//		 System.out.println("출력하고 싶은 단은?");
//		 Scanner scanner = new Scanner(System.in);
//		 	int j = scanner.nextInt();
//		 	
//		 	int[] result = new int[j];
//			for(int i=0; i < result.length; i++) {
//				result[i] =  j  * (i + 1);      // 계산 결과를 배열에 저장   
//			}
//		
//			for(int i=0; i <result.length; i++) {
//				System.out.println(result[i]);  // 계산 결과를 화면에 출력
//		 	
//		 	}
//		 }
//}
//		 

import java.util.Scanner;

public class final_mission {
	 public static void main(String[] args) {
		 System.out.println("출력하고 싶은 단은?");
		 Scanner scanner = new Scanner(System.in);
		 	String inputValue = scanner.nextLine();
		 	String[] splitedValue = inputValue.split(",");
		 	int first = Integer.parseInt(splitedValue[0]);
		 	int second = Integer.parseInt(splitedValue[1]);
		 	
		 	int[] result = new int[second];
		 			for(second=0; second < result.length; second++) {
		 				result[second] = first * (second + 1);
		 			}
		 	for(second=0; second < result.length; second++) {
		 		System.out.println(result[second]);
		 		
		 	
		 }
	}
}

			
		
	 
	 

	 


