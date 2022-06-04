
package school.management.system;

import java.util.ArrayList;


public class Subject {
    private String Name;
    ArrayList<Teacher> teacher_array= new ArrayList();
    ArrayList<Student> student_array= new ArrayList();

    
    
    

    public void setName(String Name , ArrayList<Teacher> teacher_array ,ArrayList<Student> student_array) {
        this.Name = Name;
        this.teacher_array = teacher_array;
        this.student_array = student_array;
    }
 
    
    
    public void setTeacher_array(ArrayList<Teacher> teacher_array) {
        this.teacher_array = teacher_array;
    }

    public void setStudent_array(ArrayList<Student> student_array) {
        this.student_array = student_array;
    }

    public String getName() {
        return Name;
    }

    public ArrayList<Teacher> getTeacher_array() {
        return teacher_array;
    }

    public ArrayList<Student> getStudent_array() {
        return student_array;
    }

    @Override
    public String toString() {
        return "Subject{" + "Name=" + Name + ", teacher_array=" + teacher_array + ", student_array=" + student_array + '}';
    }

    


    
}
