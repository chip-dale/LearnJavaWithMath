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

		int i = 0, j = 0, k = 0, x = 9;
		
		for(i = 0; i <= x; i++) {
			methodIf(i, j, k, x);
			methodLoop(i, j, k, x);
		}
		for (i = x - (x - 2); i >= 0; i--) {
			methodIf(i, j, k, x);
			methodLoop(i, j, k, x);
		}
		
	}
	
	static void methodIf(int i, int j, int k, int x) {
		if(i == 0) {
			for(j = x - 1; j > i; j--) {
				System.out.print(' ');
			}
			for(k = 0; k < 2; k++) {
				System.out.print('*');
			}
		}
	}
	
	static void methodLoop(int i, int j, int k, int x) {
		for(j = x - 1; j >= i; j--) {
			System.out.print(' ');
		}
		for(k = 0; k < (i * 2); k++) {
			System.out.print('*');
		}
		System.out.println();
	}

}
