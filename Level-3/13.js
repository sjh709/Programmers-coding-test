class MinHeap {
    constructor() {
        this.heap = [];
    }
    
    size() {
        return this.heap.length;
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
    
    swap(a, b) {
        [this.heap[a], this.heap[b]] = [this.heap[b], this.heap[a]];
    }
    
    push(value) {
        this.heap.push(value);
        
        // bubbleUp
        let curIdx = this.heap.length - 1;
        let parIdx = this.getParentIndex(curIdx);
        
        while(curIdx > 0 && this.heap[curIdx][1] < this.heap[parIdx][1]) {
            this.swap(curIdx, parIdx);
            
            curIdx = parIdx;
            parIdx = this.getParentIndex(curIdx);
        }
    }
    
    pop() {
        if(!this.size()) return null;
        if(this.size() === 1) return this.heap.pop();
        
        const value = this.heap[0];
        this.heap[0] = this.heap.pop();
        
        // bubbleDown
        let curIdx = 0;
        let leftIdx = this.getLeftChildIndex(curIdx);
        let rightIdx = this.getRightChildIndex(curIdx);
        
        while((leftIdx < this.size() && this.heap[leftIdx][1] < this.heap[curIdx][1]) || 
              (rightIdx < this.size() && this.heap[rightIdx][1] < this.heap[curIdx][1])) {
            let minChildIdx = leftIdx;
            if(rightIdx < this.size() && this.heap[rightIdx][1] < this.heap[minChildIdx][1]) {
                minChildIdx = rightIdx;
            }
            this.swap(curIdx, minChildIdx);
            
            curIdx = minChildIdx;
            leftIdx = this.getLeftChildIndex(curIdx);
            rightIdx = this.getRightChildIndex(curIdx);
        }
        
        return value;
    }
}

function solution(jobs) {
    const count = jobs.length;
    const minHeap = new MinHeap();
    
    jobs.sort((a, b) => a[0] - b[0]);
    
    let time = 0; // 현재시간
    let complete = 0; // 각 작업이 종료될 때의 완료시점
    let total = 0; // 각 작업들이 소요된 시간의 누적합
    
    while(jobs.length || minHeap.size()) {
        while(jobs.length) {
            if(jobs[0][0] === time) {
                minHeap.push(jobs.shift());
            }else break;
        }
        
        if(minHeap.size() && time >= complete) {
            const task = minHeap.pop();
            complete = task[1] + time;
            total += complete - task[0];
        }
        time++;
    }
    
    return total / count >> 0;
}

