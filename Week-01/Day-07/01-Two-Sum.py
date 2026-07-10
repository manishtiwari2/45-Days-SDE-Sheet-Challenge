class Solution(object):
    def twoSum(self, nums, target):
        
        map = {}
        for i in range(len(nums)):
            num = nums[i]
            comp = target - num
            if comp in map:
                return [map[comp],i]
            map[num] = i