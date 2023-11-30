package Phase1;

import java.util.Scanner;

public class MathOperations {
	public static void main(String[] num1rgs) {
		int num1,num2,result,option;
		while(true) {
			System.out.println("Input 2 Integer");
			
			Scanner inputobj=new Scanner(System.in);
			
			num1=inputobj.nextInt();
			num2=inputobj.nextInt();
			System.out.println();
			
			System.out.println("Options");
			System.out.println();
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Mul");
			System.out.println("4. Div");
			
			option=inputobj.nextInt();
			
			if(option==1) {
				result=num1+num2;
				System.out.println("added number is "+result);
				System.out.println();
			}
			else if(option==2) {
				result=num1-num2;
				System.out.println("subtracted number is"+result);
				System.out.println();
			}
			else if(option==3) {
				result=num1*num2;
				System.out.println("Mutliplied number is "+result);
				System.out.println();
			}
			else if(option==4) {
				result=num1/num2;
				System.out.println("Divided number is  "+result);
				System.out.println();
			}
			else {
				System.out.println("Invalid Option");
				System.out.println();
			}
		}
	}
}
