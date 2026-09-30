public class Var {
    int a = 5;  // instance variable
    static int c = 67;
    void display(){
        int b = 7; // local variable, must be initialized
        System.out.println(b);
        System.out.println(a);
    }
    public static void main(String[] arg){
        Var obj = new Var();
        obj.display();
        System.out.println(Var.c);
    }
}
