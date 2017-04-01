/*Reverse digits of an integer.
 *
 *Example1: x = 123, return 321
 *Example2: x = -123, return -321
 *
 *click to show spoilers.
 *
 *Note:
 *The input is assumed to be a 32-bit signed integer. Your function should return 0 when the reversed integer overflows.
 *
 *Subscribe to see which companies asked this question.
 */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse(1534236469));

	}
	
	public static int reverse(int s){
		boolean flag = false;
		if (s<0)
		{
			s = 0-s;
			flag = true;
		}	
		int rev = 0;
		int mid = 0;
		int p = s;
		while(p>0)
		{
			//�������
			if (rev != 0 && Integer.MAX_VALUE / rev < 10
	                   && Integer.MAX_VALUE / rev > -10)
				return 0;
			int mod = p % 10;
			p = p / 10;
			rev = rev * 10 + mod;
		}
		if(flag)
		{
			rev = 0 - rev;
		}
		return rev;
	}

}
