import java.util.Scanner;
class sum {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        int s=0,i;
        int n= sc.nextInt();
        int []a=new int[n];
        for( i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        for(i=1;i<=n;i++){
            s=s+a[i];
        }System.out.println(s);

    }
}
