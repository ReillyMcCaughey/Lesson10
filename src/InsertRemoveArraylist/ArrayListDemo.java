package InsertRemoveArraylist;

import java.util.ArrayList;


public class ArrayListDemo {

    public static void main(String[] args) {
        ArrayList<String> x = new ArrayList();
        ArrayList<Person> y = new ArrayList();
        
        x.add("Apple");
        x.add("Pear");
        x.add("Banana");
        
        y.add(new Person("Smith, Joe", 45));
        y.add(new Person("Andrews, Amy", 22));
        y.add(new Person("Simpson, Homer", 48));
        
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
        
        for(Person p:y){
            System.out.println(p.getName());
        }
        
        System.out.println("Remove Pear from x");
        x.remove(1);
     
        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
        System.out.println("Inserting new Person between 1 and 2");
        
        y.add(2, new Person("Gimble, Barney", 32));
        
        for(Person p:y){
            System.out.println(p.getName());
        }
        
        System.out.println("Edit Amy Andrew's age");
        Person temp = y.get(1);
        temp.setAge(67);
        y.set(1, temp);
        
        for(Person p:y){
            System.out.println(p.getName() + "\t" + p.getAge());
        }
    }
    
}
