import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class tempii {
    public static void main(String[] args) {
        Comparator<person> agecum = new Comparator<person>(){
            public int compare(person i,person ii){
                if (i.age == ii.age) {
                    return i.name.compareTo(ii.name);
                }
                return i.age.compareTo(ii.age);
            }
        };

        ArrayList<person> arr = new ArrayList<>();

        
        arr.add(new person("Aman", 20));
        arr.add(new person("Arjun", 22));
        arr.add((new person("Chopra", 2)));
        arr.add(new person("Bman", 20));
        for(person i:arr){
            i.display();
        }
        
        Collections.sort(arr,agecum);

        for(person i:arr){
            i.display();
        }
    }
}

class person{
    String name;
    Integer age;

    person(String name,int age){
        this.name = name;
        this.age = age;
    }

    public void display(){
        System.out.println(this.name+ " " + this.age);
    }
}
