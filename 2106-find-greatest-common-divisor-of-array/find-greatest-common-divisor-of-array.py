class Solution:
    def findGCD(self, nums: List[int]) -> int:
        minv=min(nums)
        maxv=max(nums)
        return gcd(minv,maxv)
        