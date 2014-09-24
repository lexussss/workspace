package introtocs.devprocess;

public class User {

  private String name;
 
  /**
   * Constructs a new User
   * @param n the users name
   */
  public User(String n) {
	  name = n;
  }

  /**
   * Gets the users name
   * @return the users name
   */
  public String getName() {
	  return name;
  }

}