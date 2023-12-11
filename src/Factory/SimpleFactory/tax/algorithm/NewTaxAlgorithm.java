package Factory.SimpleFactory.tax.algorithm;

import Factory.SimpleFactory.tax.SalaryDetails;

public class NewTaxAlgorithm implements TaxAlgorithm{
    @Override
    public Double calculate(SalaryDetails details) {
        return 0.4 * details.getBasePay() + 0.3 * details.getHra() + 0.2 * details.getLta();
    }
}
