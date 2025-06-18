package FinancialForecaster;

public class Forecaster {
  static double rate = 20.0;
  static public double FutureValue(double presentValue, int years){
    if(years<=0) return presentValue;
    return FutureValue(presentValue, years-1)*(1+rate/100);
  }
  public static void main(String[] args) {
    double currentValue = 1500.0;
    System.out.println("Value of "+currentValue+" in 5 years: "+FutureValue(currentValue, 5));
  }
}
