/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author edith
 */
public class User {
    
    // Attributes
    private String username;
    private String password; // changed to private
    private String firstName;
    private String lastName;
    
    
    // Constructors
    
    // User() -0 Parameters
    public User()
    {
        username = "username";// for testing purposing we give a value
        password = "passw0rd";
        firstName ="name";
        lastName ="surname";
    }
    
    // User(Everything) - 4 Parameters
    public User(String userNameIn, String passwordIn, String firstNameIn, String lastNameIn)
    {
        username = userNameIn;// the values are the values of the variables given to the constructor
        password = passwordIn;
        firstName =firstNameIn;
        lastName =lastNameIn;
    }
    
    // Methods
    
    // Getters and Setters   (  ctrl + space bar)
    
    // ***** username
    
    // getter username
    public String getUsername() {
        return username;
    }
    // setter username
    public void setUsername(String username) {
        this.username = username;
    }
    
    // *****  password
    
    //getter password
    public String getPassword()
    {
        return password;
    }
    //setter password
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    // ******* firstName
    // getter firstName
    public String getFirstName()
    {
        return firstName;
    }
    // setter firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    //  *****      lastName
    // getter lastName
    public String getLastName()
    {
        return lastName;
    }
    // setter lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    
    // 
}
