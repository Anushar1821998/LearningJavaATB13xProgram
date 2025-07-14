package ex_17_OOPs;

public class Lab168_Cats {
    public static void main(String[] args) {
        cat c1 = new cat();
        new cat();
        cat c2;

        //c2.running();
        c1.running();
        new cat().running();
    }

}

class cat
{
    String name;

    void running()
    {
        System.out.println("cat runs");
    }
}
