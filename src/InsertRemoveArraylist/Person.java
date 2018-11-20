
package InsertRemoveArraylist;

public class Person implements Comparable{
    private String name, gender;
    private int age;
    
    public Person(String nm, int ag, String g){
        name = nm;
        age = ag;
        gender = g;
    }
    public Person(String nm, int ag){
        name = nm;
        age = ag;
    }
    
    public String getName(){
        return name;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setAge(int a){
        age = a;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + '}';
    }

    @Override
    public int compareTo(Object o) {
        String other = ((Person)o).getName();
        return name.compareTo(other);
    }
}
