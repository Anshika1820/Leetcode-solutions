class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> mp=new HashMap<>();   //map created to  keep  the elements in it temporarly until the other pair is found.
        for(int i=0; i<nums.length;i++){
            int com=target-nums[i];
            if(mp.containsKey(com)){
                return new int[] {mp.get(com), i};
            }
            else{
                mp.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("No Match");
    }
    
}