public class CoreTemperature {
    public static void main(String[] rags)
    {
        double G=6.6743e-11;//gravitational constant
        double sigma=5.6703e-8;//stefan-Boltzmann constant
        double mSun =1.9885e30;//mass of the sun in kilogram
        double rSun=6.9634e8; //radius of the sun in meter
        double lSun=3.828e26;// luminosity of the sun
        double coreTemp=Math.pow((3.0/64.0)*Math.PI*G*sigma*Math.pow(mSun,2)/(rSun*lSun),0.25);
        System.out.println("Core temperature of the sun:"+coreTemp+"K");

    }
}