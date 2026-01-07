import java.util.Scanner;
class format {
    public static void main(String[]args){
        Scanner x= new Scanner(System.in);
        int n=x.nextInt();
        int[]arr = new int[n];
        for(int i=1;i<n;i++){
            arr[i] = x.nextInt();
        }
        for(int i=1;i<n;i++){
            System.out.println(arr[i]);
        }

    }
}
