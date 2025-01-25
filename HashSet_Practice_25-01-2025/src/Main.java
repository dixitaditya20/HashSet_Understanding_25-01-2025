import java.util.HashSet;
import java.util.Iterator;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Creating a HashSet Start
        // Time Complexity of HashSet is O(1) for add
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("if");
        hashSet.add("working");
        hashSet.add("then it is a");
        hashSet.add("HashSet");

        System.out.println("Original HashSet -> " + hashSet);
        //Creating a HashSet End

        //Size of HashSet Start
        System.out.println("Size of HashSet -> " + hashSet.size());
        //Size of HashSet End

        //Search the Element in HashSet Start
        // Time Complexity of HashSet is O(1) for search
        System.out.println(hashSet.contains("HashSet")); // If available then return true
        //Search the Element in HashSet End

        //Remove the Element in HashSet Start
        // Time Complexity of HashSet is O(1) for remove
        hashSet.remove("HashSet");
        System.out.println("After Removing the Element -> " + hashSet);
        //Remove the Element in HashSet End

        //Iterating the HashSet Start
        for (String element : hashSet) {
            System.out.println("advanced for loop Iteration -> " + element);
        }

        Iterator<String> it = hashSet.iterator();
        while (it.hasNext()) {
            System.out.println("Iteration using hasNext and next -> " + it.next());
        }
        //Iterating the HashSet End
    }
}