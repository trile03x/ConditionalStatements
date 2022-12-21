import java.util.Scanner;
public class BAI08{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Month :");
        int month =  sc.nextInt();
        switch(month)
        {
            case 1 :
            case 2 : 
            case 3 :
                System.out.println("The 1st quarter");
                break;
            case 4 :  
            case 5 :
            case 6 :  
                System.out.println("The 2nd quarter");
                break;
            case 7 :
            case 8 :  
            case 9 :
                System.out.println("The 3rd quarter");
                break;
            case 10 :  
            case 11 :
            case 12 : 
                System.out.println("The 4th quarter");
                break;
            default:
            {
                System.out.println("N/A");
            }
        }
    }
}
