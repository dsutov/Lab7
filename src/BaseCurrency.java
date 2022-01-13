public interface BaseCurrency {
    void setUSD(double value);
    double getUSD();

    void euroToUSD(double value);
    double usdToEuro();

    void gbpToUSD(double value);
    double usdToGBP();

    void yuanToUSD(double value);
    double usdToYuan();
}
