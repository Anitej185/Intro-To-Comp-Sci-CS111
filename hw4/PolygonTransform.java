/*************************************************************************
 *  Compilation:  javac PolygonTransform.java
 *  Execution:    java PolygonTransform
 *
 *  @author: Anitej Thamma, ajt200@scarletmail.rutgers.edu, ajt200
 *
 *************************************************************************/

public class PolygonTransform {


    // Returns a new array that is an exact copy of the given array. 
    // The given array is not mutated. 
    public static double[] copy(double[] array) {
    	double[] arr = new double[array.length];
    	for(int i = 0; i < array.length; i++)
    	{
    		arr[i] = array[i];
    	}
    	return arr;
    }
    
    // Scales the given polygon by the factor alpha. 
    public static void scale(double[] x, double[] y, double alpha) {
    	for(int i = 0; i < x.length; i++)
    	{
    		x[i] *= alpha;
    		y[i] *= alpha;
    	}
    }
    
    // Translates the given polygon by (dx, dy). 
    public static void translate(double[] x, double[] y, double dx, double dy) {
    	for(int i = 0; i < x.length; i++)
    	{
    		x[i] += dx;
    		y[i] += dy;
    	}
    }
    
    // Rotates the given polygon theta degrees counterclockwise, about the origin. 
    public static void rotate(double[] x, double[] y, double theta) {
    	double radians = Math.toRadians(theta);
    	for(int i = 0; i < x.length; i++)
    	{
    		double newX = x[i];
    		double newY = y[i];
    		x[i] = (newX * Math.cos(radians) - (newY * Math.sin(radians)));
    		y[i] = (newY * Math.cos(radians) + (newX * Math.sin(radians)));
    	}
    }

    // Tests each of the API methods by directly calling them. 
    public static void main(String[] args) {
    	
    }
}
