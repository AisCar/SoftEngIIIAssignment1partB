
public class RegistrationSummary {

  public void RegistrationSummary(){

  }

  public void printCourse(CourseProgramme course){
    System.out.println("\nCourse: " + course.getName());
    printCourseModules(course);
    //printStudents(course); //is necessary? Check requirements.
  }


  public void printCourseModules(CourseProgramme course){
    System.out.println("Modules:");
    for(Module m : course.getModules()){
      System.out.println("- " + m.getName());
    }
  }


  public void printStudents(CourseProgramme course){
    System.out.println("Students:");
    for(Student s : course.getStudents()){
      System.out.println("- " + s.getName() + " ("+ s.getUsername() + ")");
    }
  }


  public void printStudent(Student student){
    System.out.println("\nStudent: " + student.getName() + " (" + student.getUsername() + ")");
    System.out.println("Course: " + student.getCourse().getName());
    String modules = "";
    for(Module m : student.getModules()){
      modules = modules + m.getName() +", ";
    }
    System.out.println("Modules: " + modules);
  }


}
