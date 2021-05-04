package HomeworkDay3;

public class StudentManager extends Instructor{

    public void inProgress(Student student){
        System.out.println(student.getStudentId() + "Numaralı öğrenci " + student.getProgress() + " kursu üzerinde çalışmaktadır.");
    }
}
