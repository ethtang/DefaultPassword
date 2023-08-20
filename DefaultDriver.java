import java.util.Scanner;

public class DefaultDriver
{
  Scanner input = new Scanner(System.in);
  
  private String lastName;
  private String firstName;
  private String userName;
  private String password;
  private int year;

  public DefaultDriver(String userLastName, String userFirstName, int userYear)
  {
    lastName = userLastName;
    firstName = userFirstName;
    year = userYear;
  }

  public String getUsername()
  {
      userName = firstName.substring(0, 1) + lastName;
      return userName;
  }

  public String getPassword()
  {
    if (firstName.length() >= 3 && lastName.length() >= 3)
    {
        password = (firstName.substring(0, 3) + year + lastName.substring(lastName.length()-3, lastName.length())).toLowerCase();
        return password;
    }
    else if (firstName.length() < 3 && lastName.length() >= 3)
    {
        password = (firstName + year + lastName.substring(lastName.length()-3, lastName.length())).toLowerCase();
        return password;
    }
    else if (firstName.length() >= 3 && lastName.length() < 3)
    {
        password = (firstName.substring(0, 3) + year + lastName).toLowerCase();
        return password;
    }
    else
        return firstName + year + lastName;
  }
  
  public String toString()
  {
      return "Username: " + getUsername() + "\nPassword: " + getPassword() + "\n";
  }
  
  int x = 0;
  
  public void verify()
  {
      System.out.print("Enter username: ");
      String user = input.nextLine();
        
      System.out.print("Enter password: ");
      String pass = input.nextLine();
                
      if (user.equals(userName) && pass.equals(password))
      {
          System.out.println("Would you like to change your password?");
          String reply = input.nextLine();
          if (reply.equals("Yes"))
          {
              System.out.print("Enter new password: ");
              password = input.nextLine();
              System.out.print("Password set");
          }
          else
              System.out.print("Logging out");
      }
      else
      {
          for (int i = 1; i <= 2; i++)
          {
              x += 1;
              
              System.out.println("Try again");
              
              System.out.print("Enter username: ");
              String user1 = input.nextLine();
        
              System.out.print("Enter password: ");
              String pass1 = input.nextLine();
              
              if (user1.equals(userName) && pass1.equals(password))
              {
                  System.out.println("Would you like to change your password?");
                  String reply = input.nextLine();
                  if (reply.equals("Yes"))
                  {
                      System.out.print("Enter new password: ");
                      password = input.nextLine();
                      x = 9;
                      break;
                  }
                  else
                  {
                      x = 5;
                      break;
                  }
              }
          }
          if (x == 2)
              System.out.println("Account locked");
          else if (x == 5)
              System.out.print("Logging out");
          else
              System.out.print("Password set");
      }
  }
}
