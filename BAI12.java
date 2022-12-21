import java.util.Scanner;
public class BAI12 {
    public static double dientich(double xA, double yA, double xB, double yB, double xC, double yC)
    {
        return Math.abs(xA*yB-xB*yA+xB*yC-xC*yB+xC*yA-xA*yC);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào tọa độ 3 điểm A,B,C của tam giác");
        System.out.println("Nhập tọa độ điểm A:");
        System.out.println("\txA = ");
        double xA = sc.nextDouble();
        System.out.println("\tyA = :");
        double yA = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm B:");
        System.out.println("\txB = ");
        double xB = sc.nextDouble();
        System.out.println("\tyB = :");
        double yB = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm C:");
        System.out.println("\txC = ");
        double xC = sc.nextDouble();
        System.out.println("\tyC = :");
        double yC = sc.nextDouble();
        System.out.println("Nhập vào tọa độ điểm M :");
        System.out.println("\txM = ");
        double xM = sc.nextDouble();
        System.out.println("\tyM = :");
        double yM = sc.nextDouble();
        double dtMAB = dientich(xM, yM, xA, yA, xB, yB);
        double dtMAC = dientich(xM, yM, xA, yA, xC, yC);
        double dtMBC = dientich(xM, yM, xB, yB, xC, yC);
        double dtABC = dientich(xA, yA, xB, yB, xC, yC);
        double d = dtMAB+dtMAC+dtMBC-dtABC;

      if(d>0)
      {
        System.out.println("M không nằm trong tam giac ABC");
      }
      else if(dtMAB==0 || dtMAC==0 || dtMBC==0)
      {
        System.out.println("M nam tren canh cua tam giac ABC");
      }
      else
      {
        System.out.println("M nam trong tam giac ABC");
      }
        
    }
}