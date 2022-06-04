
package school.management.system;


public class Student {
   private int id;
   private String level;
   private String name;

    public Student() {
    }

    public Student(int id, String level, String name) {
        this.id = id;
        this.level = level;
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getLevel() {
        return level;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", level=" + level + ", name=" + name + '}';
    }
   
   
}
