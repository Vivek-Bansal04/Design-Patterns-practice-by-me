package Factory.SimpleFactory.tax.algorithm;

import Factory.SimpleFactory.tax.SalaryDetails;
import Factory.SimpleFactory.tax.TaxRegime;

//#2
//First we tried to do it using taxcalculator class but as it breaks many principle we created this interface
// which solves this prob

//sTEP 1 CREATE INTERFACE
public interface TaxAlgorithm {
    Double calculate(SalaryDetails details);
}
