package ex_20_OOPs_Polymorphism.methodoveridding;

public class Lab190_Methodoverrding_Automation {
    public static void main(String[] args) {
    CommonToAll c1 = new CommonToAll();
    c1.OpenBrowser();

    CommonToAll c2 = new ChromeBrowser();
    c2.OpenBrowser();

    CommonToAll c3 = new FirefoxBrowser();
    c3.OpenBrowser();
    }
}

class CommonToAll
{
    void OpenBrowser()
    {
        System.out.println("Opening Default Browser");
    }
}

class ChromeBrowser extends CommonToAll
{
    @Override
    void OpenBrowser()
    {
        System.out.println("Opening Chrome Browser");
    }
}

class FirefoxBrowser extends CommonToAll
{
    @Override
    void OpenBrowser() {
        System.out.println("Opening Firefox Browser");
    }
}