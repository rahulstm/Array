

public class Triplet_Sum {
    public static void main(String[] args) {
        int []ar={3,4,5,6,7,8,9};
        int []ar1={5,6,0,2,9,1,0};
        int []ar2={1,2,4,5,6,7,0};
        int x=9;
        int count=0;
        for(int i=0;i<ar.length-2;i++){
            for(int j=i+1;j<ar1.length-1;j++){
                for(int k=j+1;k<ar2.length;k++){
                    if(ar[i]+ar1[j]+ar2[k]==x){
                        count++;
                    }
                }

            }
        }
        System.out.println(count);

        
    }
    
}
