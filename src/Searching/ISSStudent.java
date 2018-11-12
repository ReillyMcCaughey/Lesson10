
package Searching;

public class ISSStudent implements Comparable /*<ISSStudent>*/{
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
    
    public int compareTo(Object o){
        if (this.id > ((ISSStudent)o).getID())
            return 1;
        else if (this.id < ((ISSStudent)o).getID())
            return -1;
        else
            return 0;
    }
}
