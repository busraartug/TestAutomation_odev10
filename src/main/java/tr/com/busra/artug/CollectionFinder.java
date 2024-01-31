package tr.com.busra.artug;

import java.util.List;

public class CollectionFinder {
    public static Integer findAny(List<Integer> collection, Integer searchFor) {
        return collection.stream()
                .filter(eachElement -> eachElement.equals(searchFor))
                .findFirst()
                .orElse(-1);
    }
}


