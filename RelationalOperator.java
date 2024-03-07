import java.util.* ;
public class RelationalOperator {
	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    System.out.println("Enter the value of x : ");
	    int x = sc.nextInt();
	    System.out.println("Enter the value of y : ");
	    int y = sc.nextInt();
		if (x != y) {
			System.out.println("x != y : " + (x != y));
		}
		if (x < y) {
			System.out.println("x < y : " + (x < y));
		}
		x++;// incrementing x
		if (x == y) {
			System.out.println("x == y : " + (x == y));
		}
		--y;// decrementing y
		if (x > y) {
			System.out.println("x > y : " + (x > y));
		}
	}
}
