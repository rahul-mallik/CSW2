package CSW2ASS1.Q5;
class Main{
    public static void main(String[] args) {
        College c1 = new College("ITER","Bhubaneswar");
        College c2 = new College("IIT Bhubaneswar","Bhubaneswar");

        Student s1 = new Student(2241013086L, "Rajesh ", c1);
        Student s2 = new Student(2312312122L, "Himesh", c2);

        s1.displayStudentInfo();
        s2.displayStudentInfo();
    }
}
class College {
    private String collegeName;
    private String collegeLoc;
     College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }
    String getCollegeName(){
        return collegeName;
    }

    String getCollegeLoc(){
        return collegeLoc;
    }
}


class Student{
    private long studentId;
    private String studentName;
    private College college;

    Student(long studentId,String studentName,College college){
        this.studentId=studentId;
        this.studentName=studentName;
        this.college = college;
    }

    void displayStudentInfo(){
        System.out.println("Details of Student:" +
                "\n Name: " + studentName +
                "\n ID:" + studentId +
                "\n College Name: " + college.getCollegeName()+
                "\n College Location: "+ college.getCollegeLoc());
    }
}

/*
    Output
        Details of Student:
         Name: Rajesh
         ID:2241013086
         College Name: ITER
         College Location: Bhubaneswar
        Details of Student:
         Name: Himesh
         ID:2312312122
         College Name: IIT Bhubaneswar
         College Location: Bhubaneswar
 */