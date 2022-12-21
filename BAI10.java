import java.util.Scanner;
public class BAI10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 3 số để kiếm tra xem có phải cạnh của tam giac không  :");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a+b>c&&a+c>b&&b+c>a)
        {
            System.out.println("Là cạnh của tam giac");
        }
        else
            System.out.println("Khong phải là cạnh của tam giac");
        } 
    }

