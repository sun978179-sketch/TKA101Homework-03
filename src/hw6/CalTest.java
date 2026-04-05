package hw6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class CalTest {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("請輸入x的值：");
			int x = sc.nextInt();
			
			System.out.println("請輸入y的值：");
			int y = sc.nextInt();
			
			int result = Calculator.powerXY(x, y);
			System.out.println(x + "的" + y + "次方等於" + result);
		
		}catch(CalException e){
			System.out.println(e.getMessage());
		
		}catch (InputMismatchException e) {
            System.out.println("輸入格式不正確！");
        }
		
		
	}

}
