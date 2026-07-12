class maxHeap {

    private ArrayList<Integer> heap;
    
    public maxHeap() {
        heap = new ArrayList<>();
    }

    public void push(int x) {
        heap.add(x);
        int current = heap.size() - 1;
        while(current>0){
            int parent = (current-1)/2;
            if(heap.get(parent) >= heap.get(current)){
                break;
            }
            int temp = heap.get(parent);
            heap.set(parent, heap.get(current));
            heap.set(current, temp);
            
            current = parent;
        }
    }

    public void pop() {
        if(heap.size() == 0){
            return;
        }
        if(heap.size() == 1){
            heap.remove(0);
            return;
        }
        int last = heap.size()-1;
        heap.set(0,heap.get(last));
        heap.remove(last);
        
        int current = 0;
        while(true){
            int left = 2*current+1;
            int right = 2*current+2;
            int largest = current;
            
            if(left < heap.size() && heap.get(left) > heap.get(largest)){
                largest = left;
            }
            if(right < heap.size() && heap.get(right) > heap.get(largest)){
                largest = right;
            }
            if(largest == current){
                break;
            }
            int temp = heap.get(current);
            heap.set(current, heap.get(largest));
            heap.set(largest,temp);
            
            current = largest;
        }
    }

    public int peek() {
        if(heap.size() == 0){
            return -1;
        }
        return heap.get(0);
    }

    public int size() {
        return heap.size();
    }
}