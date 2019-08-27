import java.util.*;

class Solution1 {
	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if (a < 100000) {
			for (int i = 0 ; i < a ; i++) {
				System.out.print("#");
			}
		}
	}
}
