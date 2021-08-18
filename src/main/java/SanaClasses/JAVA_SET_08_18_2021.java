package SanaClasses;

import java.util.HashSet;
import java.util.Iterator;

public class JAVA_SET_08_18_2021 {
/**
 *
 * JAVA SETS...
 * Today we are talking about Java Sets.
 * Sets do not allow duplicate values.
 * DEFINITION
 * Java set is an interface which extends collection. set can not contain duplicate elements. Java Set allows at most one null value. Set interface contains only methods inherited from Collection.
 **/

public static void main(String[] args) {
    HashSet<String> mySet = new HashSet<String>();
    HashSet<String> mySet2 = new HashSet<String>();


    mySet.add("English1");
    mySet.add("English2");
    mySet.add("English3");
    mySet.add("Math1");
    mySet.add("Math2");
    mySet.add("Math3");
    mySet.add("Science1");
    mySet.add("Science2");
    mySet.add("Science3");
    mySet2.add("History");
    mySet2.add("Biology");
    System.out.println(mySet);
//
//    mySet2.addAll(mySet);
//    System.out.println(mySet2);
//
//    mySet.remove("Math1");
//    System.out.println(mySet);


//    System.out.println("Is the subject Available in mySet? ");
//    if (mySet.contains("English1")){
//        System.out.println("Yes, the Subject is there" );
//    } else {
//        System.out.println("No,The subject is not available in mySet");
//    }
    Iterator itr = mySet.iterator();
    while (itr.hasNext()){
        System.out.println(itr.next());
    }
}
}
