import java.util.Scanner;

public class MinecraftCircle {
    public static void main(String[] args) {
        final int y = 3;
        Scanner k = new Scanner(System.in);
        System.out.println("Please enter the radius of the desired circle:");
        double radius = k.nextInt();
        k.nextLine();
        double step = Math.atan(1/radius);
        for (double t = 0; t < 2*Math.PI; t+= step) {

            double x = radius*(Math.round((Math.cos(t))*100.0))/100.0;
            double z = radius*(Math.round((Math.sin(t))*100.0))/100.0;
            System.out.println("fill ~"+x+" ~0 ~"+z+" ~"+x+" ~"+y+" ~"+z+" oak_log");
        }
    }
}
