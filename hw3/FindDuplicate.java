// @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200

public class FindDuplicate {

	public static void main(String[] args) {
		boolean n = false;
		
		for(int i = 0; i < args.length; i++)
		{
			int a = Integer.parseInt(args[i]);
			int number = 0;
		
			for(int j = i + 1; j < args.length; j++)
		{
			number = Integer.parseInt(args[j]);
			if (a == number)
			{
				n = true;
			}
			
		}

	}
		
	if(!n)
	{
		System.out.println(false);
	}
	else
	{
		System.out.println(true);
	}

}
}
