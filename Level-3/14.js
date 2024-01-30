class MinHeap {
    constructor() {
        this.heap = [];
    }
    
    getParentIdx(i) {
        return Math.floor((i - 1) / 2);
    }
    
    getLeftChildIdx(i) {
        return 2 * i + 1;
    }
    
    getRightChildIdx(i) {
        return 2 * i + 2;
    }
    
    swap(i1, i2) {
        [this.heap[i1], this.heap[i2]] = [this.heap[i2], this.heap[i1]];
    }
    
    push(value) {
        this.heap.push(value);
        
        // bubbleUp
        let currIdx = this.heap.length - 1;
        let parentIdx = this.getParentIdx(currIdx);
        
        while(currIdx > 0 && this.heap[currIdx] < this.heap[parentIdx]) {
            this.swap(currIdx, parentIdx);
            
            currIdx = parentIdx;
            parentIdx = this.getParentIdx(currIdx);
        }
    }
    
    pop(s) {
        if(!this.heap.length) return null;
        if(this.heap.length === 1) return this.heap.pop();
        
        if(s === 'max') {
            let parentIdx = this.getParentIdx(this.heap.length - 1);
            let lastLeaf = this.heap.slice(parentIdx);
            let max = Math.max(...lastLeaf);
            this.swap(parentIdx + lastLeaf.indexOf(max), this.heap.length - 1);
            return this.heap.pop();
        }
        
        let value = this.heap[0];
        this.heap[0] = this.heap.pop();
        
        // bubbleDown
        let currIdx = 0;
        let leftIdx = this.getLeftChildIdx(currIdx);
        let rightIdx = this.getRightChildIdx(currIdx);
        
        while((leftIdx < this.heap.length && this.heap[leftIdx] < this.heap[currIdx]) || 
              (rightIdx < this.heap.length && this.heap[rightIdx] < this.heap[currIdx])) {
            let maxChildIdx = leftIdx;
            if(rightIdx < this.heap.length && this.heap[rightIdx] < this.heap[maxChildIdx]) {
                maxChildIdx = rightIdx;
            }
            this.swap(currIdx, maxChildIdx);
            
            currIdx = maxChildIdx;
            leftIdx = this.getLeftChildIdx(currIdx);
            rightIdx = this.getRightChildIdx(currIdx);
        }
        
        return value;
    }
    
    result() {
        if(!this.heap.length) return [0, 0];
        if(this.heap.length === 1) return [this.heap[0], this.heap[0]];
        let parentIdx = this.getParentIdx(this.heap.length - 1);
        let lastLeaf = this.heap.slice(parentIdx);
        let max = Math.max(...lastLeaf);
        return [max, this.heap[0]];
    }
}

function solution(operations) {
    const minHeap = new MinHeap();
    
    operations.forEach((v) => {
        let arr = v.split(' ');

        if(arr[0] === 'I') {
            minHeap.push(Number(arr[1]));
        }else {
            if(arr[1] === '1') {
                minHeap.pop('max');
            }else {
                minHeap.pop('min');
            }
        }
    });
    
    return minHeap.result();
}
