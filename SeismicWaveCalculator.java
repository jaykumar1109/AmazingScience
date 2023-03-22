import java.util.Scanner;
public class SeismicWaveCalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter thee magnitude of the earth");
        double magnitude = scanner.nextDouble();
        double pWaveVelocity = 6.0;// in kilometers per second
        double sWaveVelocity = 3.5;//in kilometers per second
        double depth = 10.0;
        double pWaveTime = calculatePWaveTime(depth, pWaveVelocity);
        double sWaveTime = calculateSWaveTime(depth, sWaveVelocity);
        double arrivalTime = calculateArrivalTime(pWaveTime, sWaveTime);
        System.out.println("The arrival time of the seismic wave is" + arrivalTime + "second after the earthquake.");
        scanner.close();
    }
    private static double calculatePWaveTime(double depth, double pWaveVelocity)
    {
       return depth/pWaveVelocity;

    }
    private static double calculateSWaveTime(double depth,double sWaveVelocity)
    {
        return depth/sWaveVelocity;

    }
    private static double calculateArrivalTime(double pWaveTime, double sWaveTime)
    {
        return Math.sqrt(Math.pow(pWaveTime, 2) + Math.pow(sWaveTime, 2));


    }

}
