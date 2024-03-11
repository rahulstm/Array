public class pair_Sum {
    public static void main(String[] args) {
        int[] arr1={1,3,4,5,6,6,7};
        int []arr2={4,5,4,7,1,2,8};
        int count=0;
        int x=8;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(i!=j){
                    if(arr1[i]+arr2[j]==x){
                        count++;

                    }
                }
            }
        }
        System.out.println(count);
    }
    
}
