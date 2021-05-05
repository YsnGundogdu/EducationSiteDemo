public class InstructorManager {
    public void addCourse(User user, Course course){
        System.out.println("Eğitmen : " + user.getFirstName() + " " + course.getName() + " eğitimini ekledi.");
    }
    public void addHomework(Instructor instructor, Course course){
        System.out.println("Eğitmen : " + instructor.getFirstName() + " " + course.getName() + " kursuna yeni bir ödev ekledi.");
    }
}
