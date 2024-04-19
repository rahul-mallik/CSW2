package CSW2ASS_2_pt1.Q4;

public class Student implements Comparable<Student> {
    String name;
    int rn;
    double totalMark;

    public Student(String name, int rn, double totalMark) {
        this.name = name;
        this.rn = rn;
        this.totalMark = totalMark;
    }

//    public Student() {}

    @Override
    public String toString() {
        return "Student{" +
                "\n name= " + name +
                "\n rn= " + rn +
                "\n totalMark=" + totalMark +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(this.rn,o.rn);
    }

    public static void main(String[] args) {
        Student[] s1 = new Student[3];
        s1[0] = new Student("Raool",224151,45);
        s1[1] = new Student("omaan", 545214, 67);
        s1[2] =  new Student("moana",45781,99);

    }
}
