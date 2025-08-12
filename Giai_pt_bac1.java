import java.util.Scanner;

public class Giai_pt_bac1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==0){
            if(b==0){
                System.out.println("VSN");
            }
            else{
                System.out.println("VN");
            }
        }
        else{
            String ans = String.format("%.2f",-(double)b/a);
            System.out.println(ans);
        }
        
        sc.close();
    }
}
