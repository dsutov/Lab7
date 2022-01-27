public class CurrencyConverter implements BaseCurrency {
    private double usd = 0.0;

    @Override
    public double getUSD() {
        return usd;
    }

    @Override
    public void setUSD(double value) {
        usd = value;
    }

    @Override
    public void euroToUSD(double value) {
        usd = value * 1.14;
    }

    @Override
    public double usdToEuro() {
        return usd / 1.14;
    }

    @Override
    public void gbpToUSD(double value) {
        usd = value * 1.37;
    }

    @Override
    public double usdToGBP() {
        return usd / 1.367;
    }


    @Override
    public void yuanToUSD(double value) {
        usd = value * 0.157;
    }

    @Override
    public double usdToYuan() {
        return usd / 0.157;
    }

    public static void main(String[] args) {
        CurrencyConverter c = new CurrencyConverter();

        c.euroToUSD(50);
        System.out.println("The value in USD is: " + c.getUSD());
        c.setUSD(1000);
        System.out.println("The value in Euro is: " + c.usdToEuro());

        c.gbpToUSD(50);
        System.out.println("The value in USD is: " + c.getUSD());
        c.setUSD(1000);
        System.out.println("The value in GBP is: " + c.usdToGBP());

        c.yuanToUSD(50);
        System.out.println("The value in USD is: " + c.getUSD());
        c.setUSD(1000);
        System.out.println("The value in Yuan is: " + c.usdToYuan());
    }
}

