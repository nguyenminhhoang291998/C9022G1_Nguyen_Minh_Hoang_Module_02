package ss10_arraylist.bai_tap.linked_list;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;

            public Student() {
            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student s1 = new Student(1,"Hoang");
        Student s2 = new Student(2,"Nhan");
        Student s3 = new Student(3,"Tai");
        Student s4 = new Student(4,"Quan");
        myLinkedList.addFirst(s1);
        myLinkedList.addFirst(s2);
        myLinkedList.addLast(s1);
        myLinkedList.add(1,s4);


        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        MyLinkedList<Student> cloneLinkedList = myLinkedList.clone();

        for (int i = 0; i < cloneLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println(myLinkedList.constrains(s3));
        System.out.println(myLinkedList.indexOf(s4));
        System.out.println(myLinkedList.remove(s3));
    }
}
