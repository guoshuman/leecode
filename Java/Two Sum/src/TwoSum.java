import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.

 * You may assume that each input would have exactly one solution, and you may not use the same element twice.

 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,

 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */




public class TwoSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TwoSum sum = new TwoSum();
		int[] arr = {1,2,3,5};
		System.out.println(Arrays.toString(twoSum1(arr,7)));
		System.out.println(Arrays.toString(twoSum2(arr,7)));
		System.out.println(Arrays.toString(twoSum3(arr,7)));
		
	}
	
	//时间复杂度O(n2)，空间复杂度O(1)
	public static int[] twoSum1(int[] nums, int target) 
	{
        for(int i=0;i<nums.length;i++)
        {
        	for (int j=i;j<nums.length;j++)
        		if(nums[i]+nums[j]==target)
        		{
        			return new int[]{i,j};
        		}
        }
        throw new IllegalArgumentException("No two sum solution");
    }
	
	
	//时间复杂度为O(n)，空间复杂度为O(n)，双向哈希表
	public static int[] twoSum2(int[] nums, int target) 
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++)
		{
			map.put(nums[i],i);
		}
		for (int i=0;i<nums.length;i++)
		{
			int mid = target - nums[i];
			if(map.containsKey(mid)&&map.get(mid)!=i)
			{
				return new int[]{i,map.get(mid)};
			}
		}
		throw new IllegalArgumentException("No two sum solution");
    }
	
	
	
	//时间复杂度为O(n)，空间复杂度为O(n)，单向哈希表
	public static int[] twoSum3(int[] nums, int target) 
	{
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i=0;i<nums.length;i++)
		{
			 int complement = target - nums[i];
		     if (map.containsKey(complement)) 
		     {
		         return new int[] { map.get(complement), i };
		     }
		     map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
    }
	
}

