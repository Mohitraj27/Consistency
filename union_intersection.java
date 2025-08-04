import java.util.*;
class union_intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array");
        int size1 = sc.nextInt();
        System.out.println("Enter the size of 2nd array");
        int size2 = sc.nextInt();
        
        int a[]=new int[size1];
        int b[]=new int[size2];
        
        System.out.println("Enter the elements of 1st array");    
        for(int i=0;i<size1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of 2nd array");
        for(int j=0;j<size2;j++){
            b[j]=sc.nextInt();
        }
        sc.close();
        System.out.println("Given array");
        printArray(a,b);
        List<Integer> union = unionArray(a,b);
        System.out.println("Union of two arrays "+ union);
        List<Integer> intersection = intersectionArray(a,b);
        System.out.println("Intersection of two array "+intersection);
    }
    public static List<Integer> intersectionArray(int[] a, int[] b) {
        Set<Integer> setA = new HashSet<>();
        List<Integer> intersect = new ArrayList<>();

        // Store elements of array a in set
        for (int num : a) {
            setA.add(num);
        }

        // Check if elements of b exist in setA (and add only once to result)
        Set<Integer> seen = new HashSet<>();
        for (int num : b) {
            if (setA.contains(num) && !seen.contains(num)) {
                intersect.add(num);
                seen.add(num);  // Avoid duplicates in result
            }
        }

        // Sort the result
        return bubbleSort(new HashSet<>(intersect));
    }

    public static List<Integer> unionArray(int a[],int b[]){
        HashSet<Integer> result = new HashSet<Integer>();
        for(int i=0;i<a.length;i++){
            if(!result.contains(a[i])){
                result.add(a[i]);
            }
        }
        
        for(int j=0;j<b.length;j++){
            if(!result.contains(b[j])){
                result.add(b[j]);
            }
        }
        
        List<Integer> sortedList = bubbleSort(result);
        return sortedList;
    }
    
     public static List<Integer> bubbleSort(Set<Integer> result) {
        List<Integer> list = new ArrayList<>(result);
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        return list;
    }
    
    public static void printArray(int a[],int b[]) {
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }   
        
        System.out.println();
        for(int j=0;j<b.length;j++){
            System.out.print(b[j]+" ");
        }
        System.out.println();
    }
}





