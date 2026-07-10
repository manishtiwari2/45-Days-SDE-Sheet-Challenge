class Solution {
    
    static ArrayList<String> ans;
    
    static String[] wordBreak(String[] dict, String s) {
        
        ans = new ArrayList<>();
        HashSet<String> set = new HashSet<>();
        for(String word : dict){
            set.add(word);
        }
        solve(0,s,set,new ArrayList<>());
        Collections.sort(ans);
        return ans.toArray(new String[0]);
    }
    static void solve(int index,String s, HashSet<String> set, ArrayList<String> path){
        if(index == s.length()){
            ans.add(String.join(" ",path));
            return;
        }
        for(int end = index+1; end<= s.length(); end++){
            String word = s.substring(index,end);
            if(set.contains(word)){
                path.add(word);
                solve(end,s,set,path);
                path.remove(path.size()-1);
            }
        }
    }
}
