import java.util.Scanner;
class calc {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
      double a=sc.nextDouble();
     double b=sc.nextDouble();
       char op = sc.next().charAt(0);
      switch(op){
        case '+':
        System.out.println("sum = "+(a+b));
        break;
        case '-':
        System.out.println("diff = "+(a-b));
        break;
        case '/':
        System.out.println("quo = "+(a/b));
        break;
        case '%':
        System.out.println("rem = "+(a%b));
        break;
        case '*':
        System.out.println("pro = "+(a*b));
        break;
      }  
    }
}
