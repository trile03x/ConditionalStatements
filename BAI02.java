import java.util.Scanner;
public class BAI02 {
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        if (r <0)
        {
            System.out.println("N/A");
        }
        else 
        {
            System.out.println("Area of a circle is : "+(Math.pow(r,2)*Math.PI));
        }       
    }
}
