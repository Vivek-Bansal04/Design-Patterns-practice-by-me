package Factory.SimpleFactory.tax;

import Factory.SimpleFactory.tax.algorithm.NewTaxAlgorithm;
import Factory.SimpleFactory.tax.algorithm.OldTaxAlgorithm;
import Factory.SimpleFactory.tax.algorithm.TaxAlgorithm;

//Step 3
public class TaxCalculatorFactory {
    public static TaxAlgorithm getTaxAlgorithm(TaxRegime regime){
        switch (regime){
            case OLD:
                return new OldTaxAlgorithm();
            case NEW:
                return new NewTaxAlgorithm();
        }
        throw new RuntimeException("Invalid Regime");
    }
}
