public class First_oop{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Dev");
        System.out.println(s1.name);
        s1.setRoll(12);
        System.out.println(s1.roll);
        Student s2 = new Student();
        s2.setName("Akash");
        System.out.println(s2.name);
        s2.setRoll(15);
        System.out.println(s2.roll);

            
    }
}

class Student{
    String name ;
    int roll ;
    void setName(String newName){
        name=newName;   
    }
    void setRoll(int newRoll){
        roll = newRoll;
        
    }

}
