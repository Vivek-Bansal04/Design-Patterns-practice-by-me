package Factory.SimpleFactory.tax.algorithm;

import Factory.SimpleFactory.tax.SalaryDetails;

//STEP 2 CREATE CONCRETE CLASSES
public class OldTaxAlgorithm implements TaxAlgorithm{
    @Override
    public Double calculate(SalaryDetails details) {
        return 0.4 * details.getBasePay() + 0.3 * details.getHra();
    }
}
