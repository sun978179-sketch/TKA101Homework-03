package hw4;

import java.util.Scanner;

public class Homework4 {
	
//	有個一維陣列如下:
//	{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//	請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//	public static void main(String[] args) {
//		int[] arr = {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
//		double sum = 0;
//		
//		for(int i = 0; i < arr.length; i++) {
//			sum = sum + arr[i];
//		}
//		double avg = sum / arr.length;
//		System.out.println("所有元素的平均值 = " + avg);
//		
//		
//		System.out.print("大於平均值的元素：");
//		
//		for(int j = 0; j < arr.length; j++) {
//			if(arr[j] > avg) {
//				System.out.print(arr[j] + " " );
//			}
//		}
//	}
	
	
//	請建立一個字串,經過程式執行後,輸入結果是反過來的
//	例如String s = “Hello World”,執行結果即為dlroW olleH
//	public static void main(String[] args) {
//		String s ="Hello World";
//		
//		char[] chars = s.toCharArray();
//		String reversed = "";
//		
//		for(int i = chars.length - 1; i >= 0; i--) {
//			reversed = reversed + chars[i];
//		}
//		System.out.println(reversed);
//	}
	
	
//		有個字串陣列如下 (八大行星):
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		public static void main(String[] args) {
//		String[] planets = {"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
//		
//
//		int count = 0;
//		for(int i = 0; i < planets.length; i++) {
//			String a = planets[i];
//			for(int j = 0; j < a.length(); j++) {
//				char c = a.charAt(j);
//				if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
//					count++;
//				}
//			}
//		}	
//		System.out.println("陣列裡面母音為(a, e, i, o, u)的共有：" + count + "個");
//		}
//
		
	
//		阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下:
//	
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int a = sc.nextInt();
//			int count = 0;
//			
//			int[][] intArray = { {25,32,8,19,27}, {2500,800,500,1000,1200} };
//			
//			System.out.print("有錢可借的員工編號: ");
//			for(int i = 0; i < intArray[1].length ;i++) {
//				if(intArray[1][i] >= a) {
//					System.out.print(intArray[0][i] + " ");
//					count++;
//				}
//			}
//			System.out.print(" 共 " + count + " 人!");
//		}
	
	
//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//	
//		例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」
//	
//		(提示1:Scanner,陣列)
//		(提示2:需將閏年條件加入)
//		(提示3:擋下錯誤輸入:例如月份輸入為2,則日期不該超過29)
	
//		public static void main(String[] args) {
//			Scanner sc = new Scanner(System.in);
//			int yy  = sc.nextInt();
//			int mm  = sc.nextInt();
//			int dd  = sc.nextInt();
//			int sum = 0;
//			int[] intArray = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
//			
//			if (mm < 1 || mm > 12) {
//			    System.out.println("月份錯誤");
//			    return;
//			}
//			
//			boolean isLeap = (yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0); 
//			if (isLeap) { 
//				intArray[1] = 29; 
//			}
//			
//			if (dd < 1 || dd > intArray[mm - 1]) {
//			    System.out.println("日期錯誤");
//			    return;
//			}
//			
//			
//			for(int i = 0; i < mm - 1 ;i++) {
//				sum = sum + intArray[i];
//			}
//			sum += dd;
//		
//			System.out.println("輸入的日期為該年第" + sum + "天");
//	
//		}
		
	
	
//		班上有8位同學,他們進行了6次考試結果如下:
//		請算出每位同學考最高分的次數
//		(提示:二維陣列)
		public static void main(String[] args) {
			int[][] intArray = {
					{10, 35, 40, 100, 90, 85, 75, 70},
					{37, 75, 77, 89, 64, 75, 70, 95},
					{100, 70, 79, 90, 75, 70, 79, 90},
					{77, 95, 70, 89, 60, 75, 85, 89},
					{98, 70, 89, 90, 75, 90, 89, 90},
					{90, 80, 100, 75, 50, 20, 99, 75}
			};
			int[] count = new int[8];
		
			for(int i = 0 ; i < 6 ; i++) {
				
				int max = 0;
				for(int j = 0 ; j < 8 ; j++) {
					if(intArray[i][j] > max) {
						max = intArray[i][j];
					}
				}
				
				for(int j = 0 ; j < 8 ; j++) {
					if(intArray[i][j] == max) {
						count[j]++;
					}
				}
			}
			for(int k = 0; k < count.length; k++) {
			    System.out.print(count[k] + " ");
			}
			
		}
	
}
