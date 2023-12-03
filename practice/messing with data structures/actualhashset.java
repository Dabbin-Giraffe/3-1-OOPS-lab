import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;
import java.util.List;

public class actualhashset {
    public static void main(String args[]){
        Set<String> names = new HashSet<>();
        names.add("Potato");
        names.add("allam");
        names.add("idk");
        names.add("Potasdasdto");
        names.add("dom doms");
        names.add("skibidi skiidi");

        names.remove("idk");
        // Remember order is not same at all very imp
        // System.out.println(names);

        //removing at index, not regular index but special indices that we give
        System.out.println(names.size());
        System.out.println(names.isEmpty());
        System.out.println(names.contains("idk"));
        // names.clear(); //clears everything, empties the set
        for(String name:names){
            System.out.println(name);
        }
        //iterator
        Iterator<String> it = names.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //removing dupes from a list by converting into set
        List<Integer> numlist = new ArrayList<>();
        numlist.add(1);
        numlist.add(1);
        numlist.add(2);
        numlist.add(3);
        numlist.add(3);
        //removing dupes
        Set<Integer> numset = new HashSet<>();
        numset.addAll(numlist);
        System.out.println(numset);

        //other implmentation,tree set
        //all the methods are same. Only thing is that the order is maintained
        System.out.println(names.hashCode());
    }
}
