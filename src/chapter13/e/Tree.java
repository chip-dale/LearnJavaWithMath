package chapter13.e;

/**
 * <pre>Write Java code to draw the Christmas tree:
 * 
 *         **
 *         **
 *        ****
 *       ******
 *      ********
 *     **********
 *    ************
 *   **************
 *  ****************
 * ******************
 *        ****
 *         **
 *         **
 * </pre>
 */

public class Tree {

	public static void main(String[] args) {

		int i = 0, j = 0, k = 0, dotCount = 9;
		
		for(i = 0; i <= dotCount; i++) {
			print(i, j, k, dotCount);
		}
		for (i = dotCount - (dotCount - 2); i >= 0; i--) {
			print(i, j, k, dotCount);
		}
		
	}
	
	static void print(int i, int j, int k, int dotCount) {
		if(i == 0) {
			for(j = dotCount - 1; j > i; j--) {
				System.out.print(' ');
			}
			for(k = 0; k < 2; k++) {
				System.out.print('*');
			}
			System.out.println();
		} else {
			for(j = dotCount - 1; j >= i; j--) {
				System.out.print(' ');
			}
			for(k = 0; k < (i * 2); k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
