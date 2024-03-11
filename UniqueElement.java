import java.util.Scanner;
public class UniqueElement {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        int size=obj.nextInt();
        int []arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=obj.nextInt();
        }
        
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j] && (i!=j)){
                    count=count+1;

                }
                if(count==2){
                    break;
                }
            }
            if(count==1){
            System.out.print(arr[i]+" ");
        }
    }}
    
}
