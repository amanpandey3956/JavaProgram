import java.util.TreeSet;

class Student implements Comparable<Student> {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return "id " + id + " name " + name;
    }

    public int compareTo(Student c) {
        return (this.name).compareTo(c.name);
    }
}

public class testnew4 {
    public static void main(String[] args) {
        Student c1 = new Student(2, "B");
        Student c2 = new Student(1, "A");
        Student c3 = new Student(5, "E");

        TreeSet<Student> t = new TreeSet<>();
        t.add(c1);
        t.add(c2);
        t.add(c3);
        for (Student ob : t) {
            System.out.println(ob);
            System.out.println(ob.id +" "+ ob.name);
        }
    }
}