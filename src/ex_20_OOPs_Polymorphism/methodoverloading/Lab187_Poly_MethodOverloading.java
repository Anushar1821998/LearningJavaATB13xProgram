package ex_20_OOPs_Polymorphism.methodoverloading;

public class Lab187_Poly_MethodOverloading {
    public static void main(String[] args) {
    MathOperation m = new MathOperation();
    int r1 = m.add(1,2);
    int r2 = m.add(3,4,5);
    double r3 = m.add(34.56,78.56);
    String r4 = m.add("Anu" , "sha");

        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4
        );


    }
}

class MathOperation
{
    int add(int a, int b){
        return a+b;
    }

    int add(int a,int b, int c){
        return a+b+c;
    }

    double add(double a, double b) {
        return a + b;
    }

    String add(String a, String b) {
        return a + b;
    }
}
