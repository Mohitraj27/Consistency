// Linear Search
arr=[12,23,1,-1];
let target = -1;
function LinearSearch(arr,target){
    for(let i=0;i<arr.length;i++){
        if(arr[i]===target){
            return { value: arr[i], index: i };
        }
        
    }
    return null;
}

console.log(LinearSearch(arr,target));