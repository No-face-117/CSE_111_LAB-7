// CSE-111 LAB - 7 TASK - 1     []
// T-6 BBA Student class

public class BBAStudent extends Student{
    public BBAStudent(){
        super();
    }

    public BBAStudent(String nk_0){
        super.name = nk_0;
    }

    public void details(){
        System.out.println("Name : " + name + " Department: BBA");
    }
    
}