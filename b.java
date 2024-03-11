import java.util.Scanner;
public class b {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        String str=obj.next();
        String rev="";
        int l=str.length()-1;
        //System.out.println(l);
        for(int i=l;i>=0;i--){
            rev=rev+str.charAt(i);

            
        }
        System.out.println(rev);
       if(rev.equals(str)){
        
        int n=rev.length();
         int count=0;
        for(int i=1;i<=n;i++){
           
            if(n%i==0){
                count+=1;
            }


        }
        if(count==2){
            System.out.println("prime pelindrome");
        }
        else{
            System.out.println("not prime pelindrome");
        }
       }

    }
    
}
