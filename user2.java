import java.util.Scanner;
class user2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number:");
        int num=sc.nextInt();
        if(num>=-9&&num<=9)
        {
            System.out.println("it is a single digit");
        }
        else
        {
            System.out.println("it is not a single digit number");
        }
        sc.close();
    }
}