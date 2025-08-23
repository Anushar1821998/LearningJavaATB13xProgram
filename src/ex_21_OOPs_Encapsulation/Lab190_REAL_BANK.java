package ex_21_OOPs_Encapsulation;

public class Lab190_REAL_BANK {
    public static void main(String[] args) {
        ICICI_Bank i =  new ICICI_Bank("Anusha",2000000);
        System.out.println("Initial balance with username");
        String n = i.getName();
        long b = i.getBalance();
        System.out.println("Name is:" + n);
        System.out.println("Initial Balance is:" + b);

        System.out.println("After adding the amount via Cashier");
        i.setBalance(600000, true);
        System.out.println("Your new balance amount is: " + i.getBalance());

    }
}

class ICICI_Bank
{
    private String Name;
    private long Balance;

    public ICICI_Bank(String name, long balance) {
        Name = name;
        Balance = balance;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getBalance() {
        return Balance;
    }

    public void setBalance(long balance, boolean Cashier) {
        if(Cashier)
        {
            Balance += balance;
        }
        else
        {
            System.out.println("Amount cannot be deposited at bank. Go to Cashier desk");
        }

    }
}
