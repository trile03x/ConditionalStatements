import java.util.Scanner;
public class BAI07 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double denta = Math.pow(b,2)-4*a*c;
        if(denta==0)
        {
            System.out.println("Phuong trinh co nghiem kep: "+(-b/(2*a)));
        }
        else if (denta>0)
        {
            System.out.println("Phuong trinh co 2 nghiem lan luot la: \n"+"\tx1 = "+(-b+Math.sqrt(denta))/(2*a)+"\n\tx2 = "+(-b-Math.sqrt(denta))/(2*a));
        }
        else 
              System.out.println("Phuong trinh vo nghiem!");
      }    
}
