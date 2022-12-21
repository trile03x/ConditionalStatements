import java.util.Scanner;
public class BAI14 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập lần lượt ngày tháng năm cần kiểm tra: ");
        int day = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        if(year>=0){
        if(year % 4 == 0 && year % 100 != 0){
                if(month==1||month==3||month==5||month==7||month==8||month==10||month==12&&day==31)
                {
                    System.out.println(day+"/"+month+"/"+ year+ "- Là hợp lệ"); 
                }     
                else if(month==4||month==6||month==9||month==11&&day==30)
                {
                    System.out.println(day+"/"+month+"/"+ year+ "- Là hợp lệ");
                }
                else if(month==2&&day==29)
                {
                    System.out.println(day+"/"+month+"/"+ year+ "- Là hợp lệ");
                } 
                else
                {
                    System.out.println("Khong hợp lệ");
                }
            }
        else {
            if(month==1||month==3||month==5||month==7||month==8||month==10||month==12&&day==31)
                {
                    System.out.println(day+"/"+month+"/"+ year+ "- Là hợp lệ");  
                }
            else if(month==4||month==6||month==9||month==11&&day==30)
                {
                    System.out.println(day+"/"+month+"/"+ year+ "- Là hợp lệ"); 
                }
            else if(month==2&&day==28)
                {
                    System.out.println(day+"/"+month+"/"+ year+ "- Là hợp lệ"); 
                }
            else
            {
                System.out.println("Khong hợp lệ");
            }
            }   
        }
        else
        {
            System.out.println("Khong hợp lệ");
        }
}
}