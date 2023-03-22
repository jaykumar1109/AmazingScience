import java.util.Scanner;
public class PlaneSpeedCalculator {
    public static void main(String[] aregs) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the distance travelled by the plane");
        double distance = input.nextDouble();
        System.out.println("Enter the angle between the plane's initial and final position in degrees");
        double angle = input.nextDouble();
        //convert angle from degrees to radians
        double angleRadians = Math.toRadians(angle);
        //Calculate the speed of the plane
        double speed = distance / Math.cos(angleRadians);
        System.out.println("The speed of the plane is:" + speed + "Km/h");
        input.close();
    }
}

