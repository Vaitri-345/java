import java.util.Scanner;
class arithmetic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 no. ");
        int a=sc.nextInt();
         System.out.println("Enter 2 no. ");
       int b=sc.nextInt();
        System.out.println("sum = "+(a+b));
        System.out.println("diff = "+(a-b));
        System.out.println("pro = "+(a*b));
        System.out.println("quo = "+(a/b));
        System.out.println("rem = "+(a%b));
        if(a%2==0){
            System.out.println("even");       
        }else{
            System.out.println("odd");
        }
    }
}
