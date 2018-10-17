import org.joda.time.DateTime;
import org.junit.Test;
//import org.junit.Before;
//import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;


public class RegistrationSummaryTest{

  @Test
  public void testPrintCourses(){
    RegistrationSummary regSum = new RegistrationSummary();
    CourseProgramme cp1 = new CourseProgramme("CS&IT", new DateTime(), new DateTime());
    CourseProgramme cp2 = new CourseProgramme("ECE", new DateTime(), new DateTime());

    Module m1 = new Module("Software Engineering III", "CT417");
    Module m2 = new Module("Artificial Intelligence", "CT421");
    Module m3 = new Module("Modern Information Management", "CT422");

    cp1.addModule(m1);
    cp2.addModule(m1);
    cp1.addModule(m2);
    cp2.addModule(m3);

    System.out.println("\n\nCourses:");
    regSum.printCourse(cp1);
    regSum.printCourse(cp2);
  }

  @Test
  public void testPrintStudents(){
    RegistrationSummary regSum = new RegistrationSummary();
    CourseProgramme course = new CourseProgramme("CS&IT", new DateTime(), new DateTime());

    Module m1 = new Module("Software Engineering III", "CT417");
    Module m2 = new Module("Artificial Intelligence", "CT421");
    Module m3 = new Module("Modern Information Management", "CT422");

    course.addModule(m1);
    course.addModule(m2);
    course.addModule(m3);

    Student s1 = new Student("John Smith", 21, new DateTime(), course);
    Student s2 = new Student("Alice Smith", 28, new DateTime(), course);
    Student s3 = new Student("Charlie Potts", 35, new DateTime(), course);
    Student s4 = new Student("Sarah Bennet", 25, new DateTime(), course);

    s1.addModule(m1);
    s1.addModule(m2);
    s2.addModule(m3);
    s3.addModule(m1);
    s4.addModule(m2);
    s4.addModule(m3);

    System.out.println("\n\nStudents:");
    regSum.printStudent(s1);
    regSum.printStudent(s2);
    regSum.printStudent(s3);
    regSum.printStudent(s4);
  }

}
