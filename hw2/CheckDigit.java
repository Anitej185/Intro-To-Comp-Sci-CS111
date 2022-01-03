// @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200


public class CheckDigit {

	public static void main(String[] args) {
		
		long barcode = Long.parseLong(args[0]);
		int sum1 = 0;
		int sum2 = 0;
		
		while(barcode > 0)
		{
			sum1 += barcode % 10;
			barcode /= 10;
			sum2 += barcode % 10;
			barcode /= 10;
		}
		
		int ans = ((sum1 % 10) + ((sum2 % 10) * 3)) % 10;
		
		System.out.println(ans);
				

}
}