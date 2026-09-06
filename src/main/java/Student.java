import java.util.Objects;

public class Student {
    private String name;
    private int age;
    public String ID;
    public Student(String name, int age, String ID){
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", ID='" + ID + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && Objects.equals(getName(), student.getName()) && Objects.equals(getID(), student.getID());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getID());
    }
}
