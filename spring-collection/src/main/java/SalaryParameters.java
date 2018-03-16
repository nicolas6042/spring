/**
 * @author mbaranowicz
 */
public class SalaryParameters {

    private final double baseSalary;
    private final double regulatedBonus;
    private final double chefBonus;
    private final double functionAddSalary;

    public SalaryParameters(double baseSalary, double regulatedBonus, double chefBonus, double functionAddSalary) {
        this.baseSalary = baseSalary;
        this.regulatedBonus = regulatedBonus;
        this.chefBonus = chefBonus;
        this.functionAddSalary = functionAddSalary;
    }

    @Override
    public String toString() {
        return "SalaryParameters{" +
                "baseSalary=" + baseSalary +
                ", regulatedBonus=" + regulatedBonus +
                ", chefBonus=" + chefBonus +
                ", functionAddSalary=" + functionAddSalary +
                '}';
    }
}
