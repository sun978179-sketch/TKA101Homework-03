package hw2;

public class Homework2 {
	
//	請設計一隻Java程式,計算1~1000的偶數和 (2+4+6+8+...+1000)
//
//	public static void main(String[] args) {
//       int sum = 0;   
//       for (int count = 0; count <= 1000; count = count + 2)
//             sum += count;
//       System.out.println("1~1000的偶數和 = " + sum);
//	}
	
	
//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用for迴圈)
//	public static void main(String[] args) {
//		int product = 1;   
//		for (int i = 1; i <= 10; i++)
//			product *= i; 
//		System.out.println("1~10的連乘積 = " + product);
//	}
	
//	請設計一隻Java程式,計算1~10的連乘積 (1*2*3*...*10) (用while迴圈)
//	public static void main(String[] args) {
//		int product = 1;
//		int i = 1;
//		while (i <= 10) {
//		product *= i;
//		i++;
//		} 
//		System.out.println("1~10的連乘積 = " + product);
//	}
	
//	請設計一隻Java程式,輸出結果為以下:
//		1 4 9 16 25 36 49 64 81 100
//	public static void main(String[] args) {
//		int i = 1;
//		int j = 1;
//		while (i <= 10) {
//		j = i * i;
//		i++;
//		System.out.print(j + " ");
//	}
//	}
	
//	阿文很熱衷大樂透 (1 ~ 49),但他不喜歡有4的數字,不論是個位數或是十位數。請設計一隻程式,
//	輸出結果為阿文可以選擇的數字有哪些?總共有幾個?
//	public static void main(String[] args) { 
//		int count = 0;
//		for (int i = 1; i <= 49; i++) {
//			if (i % 10 == 4 || i / 10 == 4) {
//				continue;
//			}
//			System.out.println(i);
//			count++;
//		}
//		System.out.println("1 ~ 49不含4的數字總共有" + count + "個");
//	}
	
	
//	請設計一隻Java程式,輸出結果為以下:
//		1 2 3 4 5 6 7 8 9 10
//		1 2 3 4 5 6 7 8 9
//		1 2 3 4 5 6 7 8
//		1 2 3 4 5 6 7
//		1 2 3 4 5 6
//		1 2 3 4 5
//		1 2 3 4
//		1 2 3
//		1 2
//		1
	
//	public static void main(String[] args) {
//		int i, j;
//		for (i = 10; i > 0; i--) {
//			for (j = 1; j <= i; j++){
//				System.out.print(j + " ");
//            }
//				System.out.println();
//		}
//	}
	
	
//	請設計一隻Java程式,輸出結果為以下:
//		A
//		BB
//		CCC
//		DDDD
//		EEEEE
//		FFFFFF
	public static void main(String[] args) {
		int i, j;
		char c = 'A';
			for(i = 1; i <= 6 ; i++) {
				for(j = 0; j < i  ; j++) {
					System.out.print(c);
					
				}
				    c++;
					System.out.println();
			}	
	}
	
	
}
	
