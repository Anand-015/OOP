import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<String> mammals=new Vector<>();
        mammals.add("dog");
        mammals.add("hourse");
        mammals.add(2,"cat");
        System.out.println("Vector:"+mammals);
        Vector<String> animals=new Vector<>();
        animals.add("crocodile");
        animals.addAll(mammals);
        System.out.println("new vector:"+animals);
        String element=animals.get(2);
        System.out.println("the 2nd index element is "+element);
        String Element=animals.remove(1);
        System.out.println("the remove element is "+Element);
        System.out.println(animals);

    }
    
}
