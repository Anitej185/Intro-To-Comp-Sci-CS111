// @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200
//print index of maxSum
public class RURottenTomatoes {

	public static void main(String[] args) {
		int r = Integer.parseInt(args[0]);
		int c = Integer.parseInt(args[1]);
		
		int[][] movieRatings = new int[r][c];
		
		int count = 2;
		for(int i = 0; i < r; i++)
		{
			for(int j = 0; j < c; j++)
			{
				movieRatings[i][j] = Integer.parseInt(args[count]);
				count++;
			}
		}
		int maxSum = 0;
		int maxSumIndex = 0;
		
		for(int i = 0; i < c; i++)
		{
			int a = 0;
			for(int j = 0; j < r; j++)
			{
				a += movieRatings[j][i];
			}
			
			if(a > maxSum)
			{
				maxSum = a;
				maxSumIndex = i;
			}
		}
		System.out.println(maxSumIndex);

	}

}
