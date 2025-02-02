class Parent{
    public String Name = "Hitler";
    void parentDetails(){
        System.out.println("parents name is "+ Name);
    }
}
class Child extends Parent{
    String Son = "Jean Marie";
    void childDetails(){
        System.out.println("Sons full name is "+super.Name+". "+Son);
    }
}
public class Demo11 {
    public static void main(String[] args) {        
        Parent pobj = new Parent();
        pobj.parentDetails();
        Child cobj = new Child();
        cobj.childDetails();
    }
}