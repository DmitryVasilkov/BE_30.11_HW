import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

//        int a = scanner.nextInt();
//        System.out.println(a);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println(sum(x,y,z));
        System.out.println(minus(x,y));
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int minus(int a,int b){
        return a-b;
    }
}