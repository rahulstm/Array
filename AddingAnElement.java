package Arrays;

public class AddingAnElement {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int []temp=new int[n+1];
        int addingelement=6;
        temp[n]=addingelement;
        for(int i=0;i<arr.length;i++){
            temp[i]=arr[i];
        }
        for(int i=0;i<temp.length;i++){
            System.out.print(temp[i]+" ");
        }
    }
    
}
