public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int towerOfHanoi(int num) {
		if (num < 3) {
			return -1;
		}
		return countmoves(num);
	}
	public static int countmoves(int n) {
		if (n == 1) {
			return 1;
		}
		return 2 * countmoves(n - 1) + 1;

	}

}
