import java.util.HashMap;
import java.util.Map;

/**
 * @author mbaranowicz
 */
public class HasMapTest {
    public static void main(String []args){


        Employee worker1 = new Employee("Jennifer", "Nowak", "12345678901");
        Employee worker2 = new Employee("Sarah", "Taylor", "12345612345");
        Employee worker3 = new Employee("Laura", "Pinelli", "12345698765");
        Employee worker4 = new Employee("Laura", "Pinelli", "12345045678");

        SalaryParameters params1 = new SalaryParameters(5000.0, 3000.0, 0.0, 0.0);
        SalaryParameters params2 = new SalaryParameters(4000.0, 2000.0, 1000.0, 0.0);
        SalaryParameters params3 = new SalaryParameters(4500.0, 3500.0, 0.0, 0.0);
        SalaryParameters params4 = new SalaryParameters(11000.0, 0.0, 2000.0, 1000.0);

        Map<Employee,SalaryParameters> paymentParameters = new HashMap<>();

        paymentParameters.put(worker1,params1);
        paymentParameters.put(worker2,params2);
        paymentParameters.put(worker3,params3);
        paymentParameters.put(worker4,params4);


        for (Map.Entry<Employee,SalaryParameters> entry:paymentParameters.entrySet()) {
            System.out.println("Key " + entry.getKey() + " Value " + entry.getValue());
        }
    }
}
