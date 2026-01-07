import java.util.Scanner;
class substring {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
       String s= sc.nextLine();
       int n= sc.nextInt();
       int m= sc.nextInt();
       System.out.println(s.substring(n,m));
    }
}
