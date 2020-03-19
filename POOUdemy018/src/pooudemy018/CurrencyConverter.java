package pooudemy018;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double valorComIOF(double dollar, double reais){
        
        return dollar * reais * (1.0 + IOF);
    }

   
   

}
