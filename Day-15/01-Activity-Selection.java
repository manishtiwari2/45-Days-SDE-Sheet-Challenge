class Solution {
    
    static class Activity {
        int start;
        int finish;
        
        Activity(int s, int f){
            start = s;
            finish = f;
        }
    }
    
    public int activitySelection(int[] start, int[] finish) {
        
        int n = start.length;
        Activity[] arr = new Activity[n];
        for(int i=0; i<n; i++){
            arr[i] = new Activity(start[i], finish[i]);
        }
        Arrays.sort(arr, (a,b) -> a.finish - b.finish);
        int count = 1;
        int lastFinish = arr[0].finish;
        
        for(int i=1; i<n; i++){
            if(arr[i].start > lastFinish){
                count++;
                lastFinish = arr[i].finish;
            }
        }
        return count;
    }
}

