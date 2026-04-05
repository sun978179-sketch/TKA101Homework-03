package hw6;

public class Calculator {
	public static int powerXY(int x, int y) throws CalException {
		int result = 1;
		
		if(x == 0 && y == 0) {
			throw new CalException("0的0次方沒有意義！");
		}
		
		if(y < 0) {
		    throw new CalException("次方不能為負數！");
		}
		
		for(int i = 0; i < y; i++) {
			result *= x;
		}
		return result;
		
		
	}
}
