public class Merging0fTwoArrays {
    public static void main(String[] args) {
        int arr1[]={1,2,5};
        int arr2[]={3,4,};
        int a=arr1.length;
        int b=arr2.length;
        int c=a+b;
        System.out.println(c);
        int arr[]=new int[c];
        for(int i=0;i<a;i++){
            arr[i]=arr1[i];
        }
        for(int i=0;i<b;i++){
            arr[a+i]=arr2[i];
        }
        for(int i=0;i<c;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
        if(c%2!=0){
            System.out.println(arr[(c/2)]);
        }
        else{
            
            System.out.println((float)(arr[((a+b)/2)-1]+arr[((a+b)/2)])/(float)2);
        }
    }
    
}
