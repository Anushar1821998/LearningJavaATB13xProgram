package ex_21_OOPs_Encapsulation;

public class Lab189_Ecap_Demo {
    public static void main(String[] args) {
        VWOLogin v = new VWOLogin("Anusha", "pwd123!");
        String u = v.Username;
        String p = v.Password;

        String p2 = v.Password = "PWD1234!";
        System.out.println(u);
        System.out.println(p2);

        GoodVWOLogin g = new GoodVWOLogin("Anu","power123");
        //using g object username and passwords are not accessible

        System.out.println("Original Username and password");
        String u1 = g.getPassword();
        String p1 = g.getUsername();

        System.out.println(u1);
        System.out.println(p1);

        System.out.println("After setting different username and password");
         g.setUsername("Anshaa");
         g.setPassword("Hjuyj", false);

        String u_new = g.getUsername();
        String p_new = g.getPassword();

        System.out.println(u_new);
        System.out.println(p_new);

    }

}

class VWOLogin
{
    String Username;
    String Password;

    public VWOLogin(String username, String password) {
        Username = username;
        Password = password;
    }
}

class GoodVWOLogin
{

    private String Username;
    private String Password;

    public GoodVWOLogin(String username, String password) {
        Username = username;
        Password = password;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password, boolean IsAdmin) {
        if(IsAdmin)
        {
            Password = password;
        }
        else
        {
            System.out.println("Only Admin can set the password");
        }

    }
}
