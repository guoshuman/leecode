# Given an array of integers, return indices of the two numbers such that they add up to a specific target.
# You may assume that each input would have exactly one solution, and you may not use the same element twice.
# Example:
# Given nums = [2, 7, 11, 15], target = 9,
# Because nums[0] + nums[1] = 2 + 7 = 9,
# return [0, 1].

class Solution:
    def twoSum(self, nums, target):
        if (len(nums)<=1):
            print "Input Error"
        else:
            buff_dict = {}
            for i in range(len(nums)):
                complement = target - nums[i]
                if nums[i] in buff_dict:
                    return [buff_dict[nums[i]],i]
                else:
                    buff_dict[complement]=i



if __name__ == '__main__':
    solution = Solution();
    arr = solution.twoSum([1,3,5,7],8);
    print arr;
