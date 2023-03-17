class Solution {
    public double[] convertTemperature(double celsius) {
     
        
        double Temperature[]=new double[2];
      double  Kelvin=celsius + 273.15;
        double fahrenheiet=celsius*1.80 + 32.00;
        
        // System.out.println(Kelvin+","+fahrenheiet);
        // return Kelvin+fahrenheiet;
         Temperature[0] = Kelvin;
        Temperature[1] = fahrenheiet;
        return Temperature;
    }
}