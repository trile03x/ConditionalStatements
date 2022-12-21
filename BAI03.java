import java.util.Scanner;
public class BAI03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap n so can so tim minimum :");
        double n = sc.nextDouble();
        double [] arr = new double[10];
        System.out.println("Nhap input :");
        for (int i =0;i<n;i++)
        {
            arr[i]= sc.nextDouble();
        }
        double min = arr[0];
        for(int i = 0;i<n;i++)
        {
            if(min>=arr[i])
            {
                min=arr[i];
            }
        }
        System.out.println("Minimum = "+ min);
    }
}

