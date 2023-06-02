import java.util.ArrayList;
import java.util.List;

class Duck{
    private String name;
    Duck(String name)
    {
        this.name=name;
    }
    public String getName()
    {
        return name;
    }
    public String setName(String name)
    {
        return name;
    }
}

public class Main {
    public static void main(String[] args){
    List<Duck> duckList=new ArrayList<>();
    Duck duck=new Duck("babo");
    Duck duck1=new Duck("Quack");

        duckList.add(duck);
        duckList.add(duck1);

    duckList.add(duck);
    String name=duckList.get(0).getName();
    System.out.println(name);    // printing added vfirst name of ducklist; output:babo
    for(Duck  duckName: duckList)// iterating each name of duckList output:babo,Quack,babo
    {
        System.out.println(duckName.getName());
    }



    }
}