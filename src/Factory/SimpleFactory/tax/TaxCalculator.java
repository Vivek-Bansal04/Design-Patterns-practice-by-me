package Factory.SimpleFactory.tax;

import Factory.SimpleFactory.tax.algorithm.TaxAlgorithm;

public class TaxCalculator {
    public static Double calculateTax(TaxRegime regime,SalaryDetails details){
//        //#1
//        // so this code is not maintainable as whenever there is new regime we have to open this class
//        //so violates many principle SRP/OC
//        switch (regime){
//            case OLD:
//                return 0.4 * details.getBasePay() + 0.3 * details.getHra();
//            case NEW:
//                return 0.4 * details.getBasePay() + 0.3 * details.getHra() + 0.2 * details.getLta();
//
//        }
//        throw new RuntimeException("Invalid Regime");

        //#2
        return TaxCalculatorFactory
                .getTaxAlgorithm(regime)
                .calculate(details);
    }
}
