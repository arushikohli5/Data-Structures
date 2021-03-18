class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        
        PriorityQueue<Character> maxheap=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        maxheap.addAll(map.keySet());
        
        StringBuilder ans=new StringBuilder();
        while(!maxheap.isEmpty()){
            char c=maxheap.remove();
            for(int i=0;i<map.get(c);i++){
                ans.append(c);
                
            }
        }
        
        return ans.toString();
    }
}
