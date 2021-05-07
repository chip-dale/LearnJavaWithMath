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

		int i = 0, j = 0, k = 0, num = 9;
		
		for(i = 0; i <= num; i++) {
			print(i, j, k, num);
		}
		for (i = num - (num - 2); i >= 0; i--) {
			print(i, j, k, num);
		}
		
	}
	
	static void print(int i, int j, int k, int num) {
		if(i == 0) {
			for(j = num - 1; j > i; j--) {
				System.out.print(' ');
			}
			for(k = 0; k < 2; k++) {
				System.out.print('*');
			}
			System.out.println();
		} else {
			for(j = num - 1; j >= i; j--) {
				System.out.print(' ');
			}
			for(k = 0; k < (i * 2); k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

}
