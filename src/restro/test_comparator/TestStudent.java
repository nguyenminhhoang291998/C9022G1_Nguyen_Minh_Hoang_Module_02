package restro.test_comparator;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TestStudent{
    public static void main(String[] args) {
        Student s1 = new Student(3,"Anh");
        Student s2 = new Student(2,"Tai");
        Student s3 = new Student(1,"An");
        Student s4 = new Student(4,"Quan");
//        Set<Student> arrayList= new
        Set<Student> arrayList = new TreeSet<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        //StudentComparator studentComparator = new StudentComparator();
        //Collections.sort(arrayList,studentComparator );
        System.out.println(arrayList);

    }



}
