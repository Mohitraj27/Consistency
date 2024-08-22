// Problem Statement: Merge Two Array

const arr1 = [1,9,12,43,12];
const arr2 = [-2,87,98,12];


for (const item of arr2) {
    arr1.push(item);
  }
console.log(arr1);

// Binary Search
const bs = [121,43,34,12,-1];
let target=121;
function BinarySearch(bs,target){
    let low=0,high=bs.length-1;
    bs.sort((a, b) => a - b);

    while(low<=high){
        
        let mid = Math.floor((low+high)/2);
        if(bs[mid]=== target){
            return mid;
        }
        else if(bs[mid]<target){
            low=mid+1;
        }
        else{
            high=mid-1;
        }
    }
    return -1;
}

const result = BinarySearch(bs,target);
if(result !==-1){
    console.log(`Value found`);

}
else {
    console.log(`Value Not found`);
}
