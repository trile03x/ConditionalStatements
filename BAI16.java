import java.util.Scanner;
public class BAI16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập điểm của học sinh: ");
        double diem  = sc.nextDouble();
        if(diem<5)
        {
            System.out.println("Bad");
        }
        else if(diem>=5&&diem<7)
        {
            System.out.println("Average");
        }
        else if(diem>=7&&diem<8)
        {
            System.out.println("Goood");
        }
        else if(diem>=8&&diem<9)
        {
            System.out.println("Very Goood");
        }
        else if(diem>=9&&diem<=10)
        {
            System.out.println("Excellent");
        }
        else
            System.exit(0);
    }
}