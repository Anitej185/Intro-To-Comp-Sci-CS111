// @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200

public class LargestOfFive {

	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		int num3 = Integer.parseInt(args[2]);
		int num4 = Integer.parseInt(args[3]);
		int num5 = Integer.parseInt(args[4]);
		
		int max = num1;
		
		if (max <= num2)
		{
			max = num2;
		}
		
		if(max <= num3)
		{
			max = num3;
		}
		
		if(max <= num4)
		{
			max = num4;
		}
		
		if(max <= num5)
		{
			max = num5;
		}
		
		System.out.println(max);
	}

}
