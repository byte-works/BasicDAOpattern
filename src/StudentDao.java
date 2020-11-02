/*
Data Access Object Interface
This interface defines the standard operations to be performed on a model object(s).
In this implementation, model object is Student.java
*/


import java.util.List;

public interface StudentDao {
  
  public List<Student> getAllStudents();
  public Student getStudent(int id);
  public void updateStudent(Student student);
  public void deleteStudent(Student student);
  
}
