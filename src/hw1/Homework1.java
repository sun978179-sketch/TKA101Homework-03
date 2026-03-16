package hw1;

public class Homework1 {
	
	//請設計一隻Java程式,計算12,6這兩個數值的和與積
//	public static void main(String[] args) {
//		int i = 12;
//		int j = 6;
//		int sum = i + j; 
//		int product = i * j; 
//		System.out.println(i + " + " + j + " = " + sum);
//		System.out.println(i + " * " + j + " = " + product);
//	}
	
//	請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
//	public static void main(String[] args) {
//		int i = 200;
//		int y = 200 / 12;
//		int z = 200 % 12;
//		System.out.println(i + "顆蛋共是" + y + "打" + z + "顆");
//	}
	
//	請由程式算出256559秒為多少天、多少小時、多少分與多少秒
//	public static void main(String[] args) {
//		int day = 256559 / 60 / 60 / 24 ;
//		int hour = (256559 / 60 / 60) % 24;
//		int minute = (256559 / 60) % 60;
//		int second = 256559 % 60;
//		System.out.println(day + "天" + hour + "小時" + minute + "分鐘" + second + "秒");
//	}
	
	
//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長 

//	public static void main(String[] args) {
//		final double PI = 3.1415;
//		int r = 5;
//		double circleArea = PI * r * r;
//		double circumference = 2 * PI * r;
//		System.out.println("圓面積 = " + circleArea);
//		System.out.println("圓周長 = " + circumference);
//	}

//	某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,請用程式計算10年後,本
//	金加利息共有多少錢 (用複利計算,公式請自行google)
//	public static void main(String[] args) {
//		double p = 1500000;
//		double r = 0.02;
//		int y = 10;
//		double sum = p * Math.pow((1 + r), y); 
//		System.out.println("10年後本金加利息共有" + sum + " 元");
//	}
	
//	請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
//		5 + 5
//		5 + ‘5’
//		5 + “5”
//		並請用註解各別說明答案的產生原因
//	public static void main(String[] args) {
//		System.out.println(5 + 5); //左邊和右邊的5皆是常數，所以5+5=10
//		System.out.println(5 + '5'); //左邊的5是常數，右邊的5是字元(char)，Java 會把 char 轉成對應的 Unicode 整數值 (53) 再相加 → 結果 58
//		System.out.println(5 + "5"); //左邊的5是常數，右邊的5是字串，在這裡會變成字串串接，結果是 "55"
//	}
	
}	

