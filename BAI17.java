import java.util.Scanner;
public class BAI17 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số n cần tính căn bậc 2 :");
        double n = sc.nextDouble();
        if(n<0)
        {
            System.out.println("ERROR");
        }
        else
        {
            System.out.println("Căn bậc 2 của "+n+" = "+Math.sqrt(n));
        }
    }
}
