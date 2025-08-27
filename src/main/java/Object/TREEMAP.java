package Object;

import java.util.TreeMap;

public abstract class TREEMAP implements Comparable<TREEMAP>{
private String firstname;
private String lastname;

public TREEMAP(String firstname, String lastname){
    this.firstname = firstname;
    this.lastname = lastname;
}

public String getFirstname(){
    return firstname;
}
public void setFirstname(){
    this.firstname = firstname;
}

    public String getLastname(){
        return lastname;
    }
    public void setLastname(){
        this.lastname = lastname;
    }
    
    public int compareTo(TREEMAP treemap){
    return treemap.getFirstname().compareTo(firstname);
    }

    
    public String toString()
    {
        return "Person{" + "firstName= " + firstname + '\'' + ", lastName=" + lastname + '\'' + "}";  
    }

    TreeMap map = new TreeMap<TreeMap, String>();

//map.put(new TREEMAP("AA", "BB"), "aa");

    
}
