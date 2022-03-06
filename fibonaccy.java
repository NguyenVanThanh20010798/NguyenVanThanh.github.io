import java.util.Scanner;

public class Program3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n; 
        System.out.println("Nhap n: ");
        do{
            n = scanner.nextInt();
        }while (n < 2 || n>100);
        System.out.print("Gia tri tong day fibo la: " + fibonacci(n));
    }
    public static int fibonacci(int n) {
        int f1 = 0;
        int f2 = 1;
        int f3 = 1;
        int s = 1;
        if(n == 2){
            return 2;
        }else{
        for (int i = 2; i < n; i++){
            f3=f2+f1;
            f1=f2;
            f2=f3;
            s += f3;
        }
        return s;
    }
}
}
