import java.util.ArrayList;
import java.util.List;

public class Student {
  int rating;
  private String name;
  public static int count;
  public static double allRating;
  public static double aveRating;

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    Student student1 = new Student("Petro");
    student1.setRating(15);

    Student student2 = new Student("Volodymyr");
    student2.setRating(30);

    Student student3 = new Student("Kateryna");
    student3.setRating(28);

    students.add(student1);
    students.add(student2);
    students.add(student3);

    System.out.print("The average rating of all students: ");
    System.out.printf("%.2f", allRating / count);
    student3.changeRating(25);
    System.out.println();
    System.out.print("The average rating of all students after changing rating of student " + student3.name + ": ");
    System.out.printf("%.2f", allRating / count);
  }

  public Student() {
    count++;
  }

  // TODO implement Student class according to the instructions provided in the README.md file

  public Student(String name) {
    this.name = name;
    count++;
  }

    //TODO initialize name

  public static double getAvgRating() {
    if (count > 0) {
      aveRating = allRating / count;
      return aveRating;
    }
    return aveRating;
  }

    // TODO return average rating of all students

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

    // TODO set student's name

  public int getRating() {
    return rating;
  }

  public int setRating(int rating) {
    this.rating = rating;
    allRating += this.rating;
    return rating;
  }

    // TODO initialize rating;

  public boolean betterStudent(Student student) {
    return this.rating > student.rating;
  }

    // TODO return the result of comparing this.student's rating with the student's rating

  public void changeRating(int rating) {
    allRating -= this.rating;
    this.rating = setRating(rating);
  }

    // TODO change this student's rating and average rating of all students

  public static void removeStudent(Student student) {
    count = 0;
    student.rating = 0;
    allRating = 0;
    aveRating = 0;
  }

    // TODO remove student

  @Override
  public String toString() {
    return name + rating;
  }

  // TODO return String with name and rating of this student

}
