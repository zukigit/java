import java.util.*;

public class DeleteCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(Set.of(2,23,123,21,323,1));
        
        DeleteHere.delete(set);
    }
}

class DeleteHere {

    static void delete(Collection<Integer> collection) {
        Iterator<Integer> iterator = collection.iterator();

        while(iterator.hasNext()) {
            iterator.next();
            iterator.remove();
            System.out.println("i left " + collection);
        }
    }
}