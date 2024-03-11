import java.util.Scanner;
public class Sort_0_to_1 {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
       // System.out.println(arr[i]);
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if (arr[j] > arr[j + 1]) {
                    
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
        }
    }
}
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
    
}
