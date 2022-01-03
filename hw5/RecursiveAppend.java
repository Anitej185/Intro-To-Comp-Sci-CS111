// @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200
public class RecursiveAppend
{
	public static void main(String args[])
	{
		System.out.println("Start of program.");
		System.out.println(appendNTimes("cat", 0));
		System.out.println(appendNTimes("cat", 1));
		System.out.println(appendNTimes("cat", 2));
		System.out.println("End of program.");

	}

	public static String appendNTimes(String original, int n)
	{
		if(n == 0)
		{
			return original;
		}

		return original + appendNTimes(original, n-1);
	}
}
