import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Enter Last Name: ");
      String last = input.nextLine();
      System.out.print("Enter First Name: ");
      String first = input.nextLine();
      System.out.print("Enter Year of Employment: ");
      int year = input.nextInt();
      
      UserAccount user = new UserAccount(last, first, year);
      System.out.println(user);
      
      
      Scanner input1 = new Scanner(System.in);
      
      System.out.print("Enter Last Name: ");
      String last1 = input1.nextLine();
      System.out.print("Enter First Name: ");
      String first1 = input1.nextLine();
      System.out.print("Enter Year of Employment: ");
      int year1 = input1.nextInt();
        
      DefaultDriver person = new DefaultDriver(last1, first1, year1);
      System.out.print(person);           
      person.verify(); 
    }
}
