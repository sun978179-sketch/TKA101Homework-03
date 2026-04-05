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
	
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = (int)(Math.random() * 10);
//		System.out.println("開始猜數字吧！");
//		int a = sc.nextInt();
//		
//		while(a != num) {
//			System.out.println("猜錯囉");
//			a = sc.nextInt();
//			}
//			System.out.println("答對了！答案就是" + num);
//	}
	
//	進階功能:產生0~100亂數,每次猜就會提示你是大於還是小於正確答案
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int num = (int)(Math.random() * 100) + 1;
//		System.out.println("開始猜數字吧！");
//		int a = sc.nextInt();
//		
//	while(a != num) {
//		if(a > num) {
//			System.out.println(a + "大於正確答案");
//			a = sc.nextInt();
//		}else if(a < num){
//			System.out.println(a + "小於正確答案");
//			a = sc.nextInt();
//		}
//		}
//		System.out.println("答對了！答案就是" + a);
//	}
	
	
//	阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
//	厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
//	的號碼與總數,如圖:
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();
//		int count = 0;
//		for(int i = 1; i < 50; i++) {
//			if(i % 10 != a && i / 10 != a ) {
//				System.out.print(i + " ");
//				count++;
//				if(count % 6 == 0)
//						System.out.println();
//			}
//		}
//		System.out.println("總共有" + count + "個數字可選");
//	}
	
	
//	進階挑戰:輸入不要的數字後,直接亂數印出6個號碼且不得重複
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		int[] arr = new int[6];

		while(count < 6) {
				int num = (int)(Math.random() * 49) + 1;
				if(num % 10 != a && num / 10 != a){
					boolean isDuplicate = false;

			        for(int i = 0; i < count; i++) {
			            if(arr[i] == num) {
			                isDuplicate = true;
			                break;
			            }
			        }
			        if(!isDuplicate) {
					arr[count] = num;
					count++;
					System.out.print(num + " ");
			        }    
				}
		}
	}
	
}

