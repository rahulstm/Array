
import java.util.Scanner;

public class LargestOfArray {
    public static int largest(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    public static int[] takeInput(){
         Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        return arr;
    }
    public static void print(int arr[]){
        int size=arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[]=takeInput();
        print(arr);
        int largest =largest(arr);
        System.out.println(largest);
    }
    }
    


