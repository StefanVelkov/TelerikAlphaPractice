/*
You are given a data structure of employee information,
 which includes the employee's unique id,
 his importance value and his direct subordinates' id.

 For example, employee 1 is the leader of employee 2,
 and employee 2 is the leader of employee 3.
 They have importance value 15, 10 and 5,
 respectively. Then employee 1 has a data structure like [1, 15, [2]],
 and employee 2 has [2, 10, [3]],
 and employee 3 has [3, 5, []].
    Note that although employee 3 is also a subordinate of employee 1.

Example :
Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1
Output: 11
Explanation:
Employee 1 has importance value 5,
 and he has two direct subordinates: employee 2 and employee 3.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class EmployeeImportance {

// EmployeeImportance info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
}

    class Solution {

    public Map<Integer,Employee> transform (List<Employee>employees){

        Map<Integer,Employee> map = new HashMap<>();

        for (Employee employee:employees) {
            map.put(employee.id,employee);
        }
        return map;
    }

        public int getImportance(List<Employee> employees, int id) {

            Map<Integer,Employee> map =transform(employees);

            Stack<Integer> stack = new Stack<>();
            stack.push(id);

            int totalImportance = 0 ;

            while (!stack.empty()){

                int nextId= stack.pop();

                totalImportance+=map.get(nextId).importance;

                for (int sId : map.get(nextId).subordinates ) {
                    stack.push(sId);
                }
            }
            return totalImportance ;
        }
    }
    public static void main(String[] args) {
    }
}
