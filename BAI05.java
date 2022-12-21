import java.util.Scanner;
public class BAI05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 2 số can tinh :");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        System.out.println("Nhap phep toan : ");
        char operator = sc.next().charAt(0);
        switch(operator)
        {
            case '+':
                System.out.println("Ket qua cua "+a+"+"+b+" = "+(a+b));
                break;
            case '-':
               System.out.println("Ket qua cua "+a+"-"+b+" = "+(a-b));
                break;
            case '*':
               System.out.println("Ket qua cua "+a+"*"+b+" = "+(a*b));
                break;
            case '/':
               System.out.println("Ket qua cua "+a+"/"+b+" = "+(a/b));
                break;
            case '%':
               System.out.println("Ket qua cua "+a+"%"+b+" = "+(a%b));
               break;
            default:
                System.out.println("Bạn đã nhập sai phép tính");
                break;
        } 
    }
}
