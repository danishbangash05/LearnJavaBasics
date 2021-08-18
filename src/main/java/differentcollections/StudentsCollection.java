package differentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentsCollection {
    public static void main(String[] args) {

        ArrayList<String> studentList = new ArrayList<>();
//        System.out.println("Length of an Array List is : " + studentList.size());
        studentList.add(0,"Danish");
        studentList.add(1, "Hamza");
        studentList.add(2,"Khairul");
        studentList.add(3,"Jadid");
        studentList.add(4,"Faizul");
        studentList.add(5,"Rafid");
        studentList.add(6,"Noman");
        studentList.add(7,"Kibria");
        studentList.add(8,"Kanta");
        studentList.add(9,"Rezia");
        studentList.add(10,"Amna");
        System.out.println("Length of an Array List is : " + studentList.size());
        ArrayList<String> nameWith6Characters = new ArrayList<>();

//        for (int i = 0; i < studentList.size(); i++) {
//            int len = studentList.get(i).length();
//            if (len == 5) {
////                System.out.println(len);
//                nameWith6Characters.add(studentList.get(i));
////            System.out.println("Total names with 6 characters are as follow : " + studentList.size());
////                System.out.println(nameWith6Characters);
//            }
////        System.out.println("Total names with 6 characters are as follow : " + nameWith6Characters);
//        }
//        System.out.println(nameWith6Characters);

//        for (int i = 0; i < studentList.size(); i++) {
//            int len = studentList.get(i).length();
//            if (len != 5) {
//                nameWith6Characters.add(studentList.get(i));
////                System.out.println(nameWith6Characters);
//
//            }
//        }
        for (int i = 0; i < studentList.size(); i++) {
            int len = studentList.get(i).length();
            if (len != 5) {
                studentList.remove(studentList);

//                System.out.println(nameWith6Characters);
            }
            else {
                System.out.println(studentList.get(i));
            }
        }
//        Iterator<String> itr = new studentList.iterator();
//        int len = studentList.get(itr).length();
//        while (itr.hasNext()){
//            String i = itr.next();
//            if (i != 6){
//
//            }
//        }

//          System.out.println(studentList);
//        System.out.println();
    }
}
