// @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200

public class RandomWalker {

	public static void main(String[] args) {

		int n = Integer.parseInt(args[0]);
		int x = 0;
		int y = 0;
		double distance = 0;
		
		while (n != -1)
		{
			System.out.println("(" + x + "," + y + ")");
			int direction = (int)(Math.random() * 4); //0-4
			
			
			if (direction == 0) //north
			{
				y ++;
			}
			else if (direction == 1) //south
			{
				y --;
			}
			else if (direction == 2) //east
			{
				x ++;
			}
			else if (direction == 3) //west
			{
				x --;
			}
			n--;
			distance = Math.pow(x, 2) + Math.pow(y, 2);
		}
		System.out.println("(" + x + "," + y + ")");
		System.out.println("Squared distance = " + distance);
	}
}
