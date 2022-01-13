public interface BaseCurrency {
    double USD_VALUE =  1.1467941;

    void setUsd();
    double getUsd(double value);

    void euroToUSD();
    double usdToEuro(double value);

    /*void gbpToUSD(double value);
    double usdToGBP();

    void yuanToUSD(double value);
    double usdToYUAN();*/
}
