// package temperory;
import java.util.Scanner;
public class temp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int zeroesCount = 0;

        // int sizeOfArray = in.nextInt();


        // int[] arr = new int[sizeOfArray];

        // for(int i=0;i<sizeOfArray;i++){
        //     arr[i] = in.nextInt();
        // }
        // for(int i=arr.length -1 ;i>=0;i--){
        //     if(arr[i]==9){
        //         arr[i]=0;
        //         zeroesCount++;
        //     }else{
        //         arr[i] = arr[i]+1;
        //         break;
        //     }
        // }

        // if(zeroesCount == arr.length) {
        //     System.out.print("1");
        // }
        // for(int i:arr){
        //     System.out.print(i);
        // }
        Employee empi = new Employee("Aman Prasad", 1246, "Full stack");
        empi.displayEmployeeData();
        in.close();
    }

}
class Employee {
    String name;
    int id;
    String department;

    Employee(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
    }

    void displayEmployeeData() {
        System.out.println("Name: " + this.name);
        System.out.println("ID: " + this.id);
        System.out.println("Department: " + this.department);
    }
}
