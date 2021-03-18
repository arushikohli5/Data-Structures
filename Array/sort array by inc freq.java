class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        
        List<Integer> li=new ArrayList<>(map.keySet());
        Collections.sort(li,(a,b)->{
            return (map.get(a)==map.get(b)?b-a:map.get(a)-map.get(b));
        });
        
        int ans[]=new int[nums.length];
        int i=0;
        for(int n:li){
            for(int j=0;j<map.get(n);j++){
                ans[i++]=n;
            }
        }
        
        return ans;
    }
}
