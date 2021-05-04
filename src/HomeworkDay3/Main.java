package HomeworkDay3;

public class Main {
    public static void main(String[] args) {
    InstructorManager instructorManager = new InstructorManager();
    StudentManager studentManager = new StudentManager();

    Instructor instructor = new Instructor();
    instructor.firstName = "Engin";
    instructor.lastName = "Demiroğ";
    instructor.course = "Java";
    instructorManager.add();

    Student student = new Student();
    student.firstName = "Mahmut";
    student.lastName = "Yeşilal";
    student.email = "mahmuttyesilal@gmail.com";
    student.password = "123321";
    studentManager.getCourse();

    UserManager userManager = new UserManager();
    userManager.email = "mahmuttyesilal@gmail.com";
    userManager.password = "1111111.";
    userManager.update(student);

    }
}
