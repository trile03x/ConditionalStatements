import java.util.Scanner;
public class BAI01 {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        if (length <=0||width<=0)
        {
            System.out.println("N/A");
        }
        else 
        {
            System.out.println("Area of a ractangle is : "+(length*width));
        }       
    }
}
