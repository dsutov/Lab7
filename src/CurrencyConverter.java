public class CurrencyConverter implements BaseCurrency {

    private static double usd = 0.0;

    @Override
    public void setUsd() {

    }

    @Override
    public double getUsd(double value) {
        return usd;
    }

    @Override
    public void euroToUSD() {
        
    }

    @Override
    public double usdToEuro(double value) {
        return usd /USD_VALUE;
    }

    /*public void euroToUSD(double value) {
        usd = value * USD_VALUE;*/

    /*public double usdToEuro() {
        return usd / USD_VALUE;*/


    public static void main(String[] args) {
        CurrencyConverter cv = new CurrencyConverter();
        cv.euroToUSD();
        System.out.println(usd);
        cv.usdToEuro(10);

    }
}

