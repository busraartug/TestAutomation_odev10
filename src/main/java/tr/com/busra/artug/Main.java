package tr.com.busra.artug;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new ArrayList<>();
        myCollection.add(1);
        myCollection.add(3);
        myCollection.add(3);
        myCollection.add(5);
        myCollection.add(6);



        System.out.println(CollectionFinder.findAny(myCollection, 4));

    }
}
