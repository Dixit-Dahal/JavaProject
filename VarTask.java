public class VarTask {
    String MyName = "Dixit";
    static String CollegeName = "Softwarica";
    
    void display(){
        String FriendName = "Anil";

        System.out.println(MyName);
        System.out.println(FriendName);
        
    }

    public static void main(){
        VarTask obj = new VarTask();
        obj.display();
        System.out.println(VarTask.CollegeName);
    }
}
