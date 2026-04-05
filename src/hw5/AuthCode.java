package hw5;

public class AuthCode {
	
		public static String genAuthCode(){
			String a = "1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
			String result = "";
			
			for(int i = 0; i < 8; i++) {
				int index = (int)(Math.random() * a.length());
				char b = a.charAt(index);
				result += b;
			}
			return result;
		}
	
		public static void main(String[] args) {
			System.out.println("本次隨機產生驗證碼為：");
			System.out.println(genAuthCode());
		}
}
