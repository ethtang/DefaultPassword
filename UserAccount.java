public class UserAccount
{
  private String lastName;
  private String firstName;
  private String userName;
  private String password;
  private int year;

  public UserAccount(String userLastName, String userFirstName, int userYear)
  {
    lastName = userLastName;
    firstName = userFirstName;
    year = userYear;
  }

  public String getUsername()
  {
    return firstName.substring(0, 1) + lastName;
  }

  public String getPassword()
  {
    if (firstName.length() >= 3 && lastName.length() >= 3)
        return firstName.substring(0, 3) + year + lastName.substring(lastName.length()-3, lastName.length());
    else if (firstName.length() < 3 && lastName.length() >= 3)
        return firstName + year + lastName.substring(lastName.length()-3, lastName.length());
    else if (firstName.length() >= 3 && lastName.length() < 3)
        return firstName.substring(0, 3) + year + lastName;
    else
        return firstName + year + lastName;
  }
  
  public String toString()
  {
      return "Username: " + getUsername() + "\nPassword: " + getPassword().toLowerCase() + "\n";
  }
}
