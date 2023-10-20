public class User_Authenication{
    String User_Name;
    String Password;

    public void UserRegister(String UN,String Pass)
    {
        System.out.println("Registering User" );
        User_Name = UN;
        Password = Pass;
    }

    public void ManageUser()
    {
        System.out.println("1:Delete Account");
        System.out.println("2:Change UserName");
        System.out.println("3:Change Password");
    }
}
