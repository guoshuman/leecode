/*
 * Determine whether an integer is a palindrome. Do this without extra space.
 */


public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isPalindrome(123321));
		
	}
	public static boolean isPalindrome(int x){
		if(x<0)
			return false;
		int len=10;
		while((x/len)>10)
			len*=10;
		int right = 0;
		int left = 0;
		int pa = x;
		while(pa!=0)
		{
			right = pa/len;
			left = pa%10;
			if(right!=left)
				return false;
			else{
				pa = pa%len;
				pa = pa/10;
				len = len/100;
			}				
		}
		return true;
	}
}
