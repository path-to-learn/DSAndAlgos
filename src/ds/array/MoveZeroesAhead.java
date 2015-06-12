package ds.array;

/**
 * Move zeroes in the integer to ahead
 * {1,3,0,6,0,9,10,0} to {0,0,0,1,3,6,9,10}
 * 
 * @author prashantdathwal
 *
 */
public class MoveZeroesAhead {

	public static void main(String[] args) {
      int[] num = {0,1,3,0,6,0,9,10,0};
      
     num = moveZeroesAhead(num);
	 for (int i=0;i<num.length;i++)
		 System.out.print(" " + num[i]);
	}

	/**
	 *  Tricky error is when in Line 31, you do count++ >j
	 * @param num
	 * @return
	 */
	private static int[] moveZeroesAhead(int[] num) {
		int j = 0;
		for (int i=1; i<num.length;i++) {
			if(num[i]==0)
			{
			   int count = i;
			    while (count>j && num[count-1] >0) {
					num[count] = num[count-1];
					num[count-1] = 0;
					count--;
				}
			    j++;
			}
		}
		return num;
	}

}
