package Day2;

public class Main {
    public static void main(String[] args) {
        Bike b1 = new Bike("Bullet", "Classic350", "Royal Enfield", "Matt Black", "February 14", 12345);
        b1.pressBrake();
        b1.releaseBrake();
        b1.accelerate(100);
        b1.turnOnSideLight();

    }
}
