import java.util.Scanner;

public class tong_n_so_duong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            long n = sc.nextInt();
            long res=n*(n+1)/2;
            System.out.println(res);
        }
        sc.close();
    }
}
