import java.util.* ;
public class BasicOpeation{
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        // to add element in the list 
        list.add (1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        //Get operation
        int element = list.get(1);
        System.out.println(element);

        //to remove element 
        list.remove(2);
        System.out.println(list);

        //set operation
        list.set(2,89);
        System.out.println(list);

        //use of conatains
        System.out.println(list.contains(90));
        System.out.println(list.contains(89));

        //add => insert element at specific position
        list.add(2,9);
        System.out.println(list);
    }
}
