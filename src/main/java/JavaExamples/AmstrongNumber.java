package JavaExamples;

import static org.testng.Assert.assertTrue;

public class AmstrongNumber {

	
	public boolean amstrong(int num) {
		int input = num;
		int result=0;
		while(input>0) {
			int n=input%10;
			 result += n*n*n;
			input = input/10;
		}
		if(num == result) {
		return	true;
		}
		return false;
	}

}
