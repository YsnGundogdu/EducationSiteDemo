public class StudentManager {
    public void addCourse(Student student, Course course) {
        System.out.println("Öğrenci İsmi: " + student.getFirstName() + " " + course.getName() + " eğitimini kurslarına ekledi.");
    }


    public void doneHomework(Student student, Course course) {
        System.out.println(student.getFirstName() + " isimli öğrenci " + course.getName() + " kursunun ödevlerini tamamladı.");
    }
}
