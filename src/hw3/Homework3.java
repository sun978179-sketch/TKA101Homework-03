package hw3;

import java.util.Scanner;

public class Homework3 {
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("input numbers");
//		int data1 = sc.nextInt();
//		int data2 = sc.nextInt();
//		int data3 = sc.nextInt();
//		
//		if(((data1 + data2) <= data3) || ((data2 + data3) <= data1) || ((data1 + data3) <= data2))
//			System.out.println("不是三角形");
//		
//		else if(
//				Math.pow(data1, 2) + Math.pow(data2, 2) == Math.pow(data3, 2) ||
//				Math.pow(data1, 2) + Math.pow(data3, 2) == Math.pow(data2, 2) ||
//				Math.pow(data2, 2) + Math.pow(data3, 2) == Math.pow(data1, 2) 
//			)
//			System.out.println("直角三角形");
//		
//		else if((data1 == data2) && (data2 == data3)) 
//			System.out.println("正三角形");
//			
//		else if((data1 == data2) || (data2 == data3) || (data1 == data3))
//			System.out.println("等腰三角形");
//		
//		else {
//			System.out.println("其它三角形");
//	
//		}
//	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = (int)(Math.random() * 10);
		System.out.println("開始猜數字吧！");
		int a = sc.nextInt();
		
		while(a != num) {	
			System.out.println("猜錯囉");
			}
			System.out.println("答對了！答案就是" + num);//****待完成****
	}
}

