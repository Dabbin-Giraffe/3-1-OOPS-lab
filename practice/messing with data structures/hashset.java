import java.util.HashSet;
import java.util.Iterator;
public class hashset {
    public static void main(String args[]){
        HashSet<Integer> set = new HashSet<>();
        //Same as array list
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        set.add(1); //ignores this cause everything needs to be unique

        //searching : we use contains
        if(set.contains(8)){
            System.out.println("Potato 1");
        }else{
            System.out.println("doesnt exists");
        }

        //Deleting in set
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We deleted one so this");
        }
        //Printing size
        System.out.println("Size is : "+set.size());

        //Prining all the elements
        System.out.println("all elements : "+set);

        // lets look at iterator, we gotta import first
        Iterator it = set.iterator();
        
        // Iterator has two methods, hasNext and next
        while(it.hasNext()){
        System.out.println("sup : "+it.next());
        }
        // important, once we go to the end we somehow gotta reset the iterator else it will be stuck at last element ugh
        //This while doesnt print anything unsurprising
        while(it.hasNext()){
        System.out.println("all elements : "+it.next());
        break;
        }
        
    }
}
