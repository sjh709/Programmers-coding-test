class MinHeap {
    constructor() {
        this.heap = [];
    }
    
    getParentIndex(i) {
        return Math.floor((i - 1) / 2);
    }
    
    getLeftChildIndex(i) {
        return i * 2 + 1;
    }
    
    getRightChildIndex(i) {
        return i * 2 + 2;
    }
    
    swap(i1, i2) {
        [this.heap[i1], this.heap[i2]] = [this.heap[i2], this.heap[i1]];
    }
    
    size() {
        return this.heap.length;
    }
    
    peek() {
        return this.heap[0];
    }
    
    push(value) {
        this.heap.push(value);
        
        let currIdx = this.heap.length - 1;
        let parentIdx = this.getParentIndex(currIdx);
        
        while(currIdx > 0 && this.heap[currIdx] < this.heap[parentIdx]) {
            this.swap(currIdx, parentIdx);
            
            currIdx = parentIdx;
            parentIdx = this.getParentIndex(currIdx);
        }
    }
    
    pop() {
        if(!this.size()) return null;
        if(this.size() === 1) return this.heap.pop();
        
        const value = this.heap[0];
        this.heap[0] = this.heap.pop();
        
        let currIdx = 0;
        let leftIdx = this.getLeftChildIndex(currIdx);
        let rightIdx = this.getRightChildIndex(currIdx);
        
        while((leftIdx < this.size() && this.heap[leftIdx] < this.heap[currIdx]) || 
              (rightIdx < this.size() && this.heap[rightIdx] < this.heap[currIdx])) {
            let minChildIdx = leftIdx;
            
            if(rightIdx < this.size() && this.heap[rightIdx] < this.heap[minChildIdx]) {
                minChildIdx = rightIdx;
            }
            
            this.swap(currIdx, minChildIdx);
            
            currIdx = minChildIdx;
            leftIdx = this.getLeftChildIndex(currIdx);
            rightIdx = this.getRightChildIndex(currIdx);
        }
        
        return value;
    }
}

function solution(scoville, K) {
    const minHeap = new MinHeap();
    
    for(const sco of scoville) {
        minHeap.push(sco);
    }
    
    let count = 0;
    
    while(minHeap.size() >= 2 && minHeap.peek() < K) {
        const first = minHeap.pop();
        const second = minHeap.pop();
        
        const mixedScov = first + second * 2;
        minHeap.push(mixedScov);
        count++;
    }
    
    return minHeap.peek() >= K ? count : -1; 
}
