
package Sorting;


public class ISSStudent implements Comparable <ISSStudent>{
    private String name;
    private String address;
    private int id;
    
    ISSStudent(String n, String a, int i){
        name = n;
        address = a;
        id = i;
    }
    
    public String toString(){
        return "Name: \t\t" + name + "\nAddress: \t\t" + address + "\nID: \t\t" + id;
    }
    
    public int getID(){
        return id;
    }
    
    public String getName(){
        return name;
    }
    
    public int compareTo(ISSStudent o){
        /*this version uses name as the sorting and comparing field,
        * vs. student id in the other version
        */
        return name.compareTo(o.name);
    }
}
