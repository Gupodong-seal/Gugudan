//import java.util.Scanner;
//
//public class final_mission {
//	 public static void main(String[] args) {
//		 System.out.println("����ϰ� ���� ����?");
//		 Scanner scanner = new Scanner(System.in);
//		 	int j = scanner.nextInt();
//		 	
//		 	int[] result = new int[j];
//			for(int i=0; i < result.length; i++) {
//				result[i] =  j  * (i + 1);      // ��� ����� �迭�� ����   
//			}
//		
//			for(int i=0; i <result.length; i++) {
//				System.out.println(result[i]);  // ��� ����� ȭ�鿡 ���
//		 	
//		 	}
//		 }
//}
//		 

import java.util.Scanner;

public class final_mission {
	 public static void main(String[] args) {
		 System.out.println("����ϰ� ���� ����?");
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

			
		
	 
	 

	 


