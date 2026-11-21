class Student {
    int rollno;
    String name;
    int marks;
}

public class obj {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.rollno = 1;
        s1.name = "Ilakkya";
        s1.marks = 90;

        Student s2 = new Student();
        s2.rollno = 2;
        s2.name = "Ram";
        s2.marks = 85;

        Student s3 = new Student();
        s3.rollno = 3;
        s3.name = "Sam";
        s3.marks = 95;

        Student[] studs = new Student[3];

        studs[0] = s1;
        studs[1] = s2;
        studs[2] = s3;

        for(int i = 0; i < studs.length; i++) {
            System.out.println(
                studs[i].rollno + ". " +
                studs[i].name + " :" +
                studs[i].marks
            );
        }
    }
}