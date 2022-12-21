import java.util.Scanner;
public class BAI11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lần lượt tọa độ của 3 điểm A,B,C :");
        System.out.println("Nhập tọa độ điểm A:");
        System.out.println("xA = ");
        double xA = sc.nextDouble();
        System.out.println("yA = :");
        double yA = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm B:");
        System.out.println("xB = ");
        double xB = sc.nextDouble();
        System.out.println("yB = :");
        double yB = sc.nextDouble();
        System.out.println("Nhập tọa độ điểm C:");
        System.out.println("xC = ");
        double xC = sc.nextDouble();
        System.out.println("yC = :");
        double yC = sc.nextDouble();
        double AB =Math.sqrt(Math.pow((xB-xA),2)+Math.pow((yB-yA),2));
        double AC =Math.sqrt(Math.pow((xC-xA),2)+Math.pow((yC-yA),2));
        double BC =Math.sqrt(Math.pow((xB-xC),2)+Math.pow((yB-yC),2));
        if(AB+BC>AC&&AC+BC>AB&&AB+AC>BC)
        {
            System.out.println("Là cạnh của tam giac");
        }
        else
            System.out.println("Khong phải là cạnh của tam giac");
        } 
    }

