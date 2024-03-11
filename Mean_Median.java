package Arrays;
import java.util.Arrays;
public class Mean_Median {
    public static void main(String[] args) {
        int arr[]= {1, 3, 4, 2, 6, 5, 7,8};
        Arrays.sort(arr);
        int sum=0;
        int n=arr.length;
        int mid=n/2;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];


        }
        System.out.println("Mean = "+(double)sum/n);
        if(n%2==0){
            System.out.println("Median = "+(double)(arr[mid]+arr[mid-1])/2);
        }
        else{
            System.out.println("Median = "+(double)arr[mid]);
        }
    }
    
}
