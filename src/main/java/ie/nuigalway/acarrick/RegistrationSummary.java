
public class RegistrationSummary {
  //TODO use actual accessor methods - go back and write those in part A

  public void RegistrationSummary(){

  }

  public void printCourse(CourseProgramme course){
    System.out.println("\nCourse: " + course.courseName);
    printCourseModules(course);
    //printStudents(course); //is necessary? Check requirements.
  }


  public void printCourseModules(CourseProgramme course){
    System.out.println("Modules:");
    for(Module m : course.modules){
      System.out.println("- " + m.name);
    }
  }


  public void printStudents(CourseProgramme course){
    System.out.println("Students:");
    for(Student s : course.enrolledStudents){
      System.out.println("- " + s.name + " ("+ s.getUsername() + ")");
    }
  }


  public void printStudent(Student student){
    System.out.println("\nStudent: " + student.name + " (" + student.getUsername() + ")");
    System.out.println("Course: " + student.course.courseName);
    String modules = "";
    for(Module m : student.modules){
      modules = modules + m.name +", ";
    }
    System.out.println("Modules: " + modules);
  }


}
