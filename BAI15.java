import java.util.Scanner;
public class BAI15 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is our country’s name at the Dinh Tien Hoang age?"
                + "+\na.\tVan Lang"
                + "+\nb.\tDai Co Viet"
                + "+\nc.\tAn Nam");
        System.out.println("Answer is :");
        char Ans = sc.next().charAt(0);
        switch(Ans)
        {
            case 'B':
                System.out.println("Very Good");
                break;
            case 'b':
                System.out.println("Very Good");
                break;
            default:
            {
                System.out.println("You are wrong");
                break;
            }
        }
    }
}
