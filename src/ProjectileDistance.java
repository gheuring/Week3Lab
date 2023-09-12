/**
 * 
 */

/**
 * @author jerry
 *
 */
public class ProjectileDistance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double angle, distance, initialVelocity=88.0;
		
		System.out.println("Determine the distance a Projectile will Travel given an initial angle in degrees");
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		System.out.println("Input an angle in degrees : ");
		angle = input.nextDouble();
		distance = Math.sin((angle*3.14159/180.0)* 2.0) * initialVelocity * initialVelocity / 32.2;
		System.out.println("The projectile will travel " + distance + " feet");
		System.exit(0);

	}

}
