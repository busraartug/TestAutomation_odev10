package tr.com.busra.artug;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        //Generic bir alan içeren sınıf ve bu alanı yazdıran bir metot için;

        Generic<Integer> iObj = new Generic<Integer>(15);
        System.out.println(iObj.getObject());
        Generic<String> sObj
                = new Generic<String>("GeeksForGeeks");
        System.out.println(sObj.getObject());

        //Bir koleksiyonu ve bulunacak bir öğeyi kabul eden bir metod yazın. Metod, eğer böyle bir öğe yoksa
        //-1 değerini, öğe varsa öğeyi döndürmelidir.


        ArrayList<Integer> myCollection = new ArrayList<>();
        myCollection.add(1);
        myCollection.add(3);
        myCollection.add(3);
        myCollection.add(5);
        myCollection.add(6);



        System.out.println(CollectionFinder.findAny(myCollection, 4));

    }
}
