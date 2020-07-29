import com.sun.xml.internal.ws.api.model.wsdl.editable.EditableWSDLModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Micgogi
 * on 5/2/2020  3:55 PM
 * Rahul Gogyani
 */
public class TEst45 {


    public static void main(String[] args) {
        int a[] = {1,1,1};
        int b[] = {1,2,3};
        int x[] = new int[a.length+2];
        for (int i = 0; i <a.length ; i++) {
            x[a[i]]++;
            x[b[i]+1]--;
        }
        System.out.println(Arrays.toString(x));
        for (int i = 0; i <x.length-1; i++) {
            x[i+1]+=x[i];
        }
        System.out.println(Arrays.toString(x));
        Employee employee1 = new Employee("Ankita",120000);
        Employee employee2 = new Employee("Rahul",10000);
        Employee employee3 = new Employee("ddd",1233);
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        List<Employee>list1=list.stream().filter(employee -> employee.sal>1300).sorted().collect(Collectors.toList());
        System.out.println(list1.get(0).name+" "+list1.get(0).sal);
        System.out.println(list1.get(1).name+" "+list1.get(1).sal);
    }


}
class Employee implements Comparable<Employee>{
    String name;
    int sal;
    public Employee(String name, int sal){
        this.name = name;
        this.sal = sal;
    }

    @Override
    public int compareTo(Employee o) {
        return o.sal-this.sal;
    }
}
