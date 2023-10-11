public class Roadtrip {
    public static void main(String[] args) {
        System.out.println("Her tour is " + roadTrip(11)*10 + " miles.");

        System.out.println("Distance from Gwangju (16,21) to Busan (4,21) = " + distance(16,21,4,21));
        System.out.println("Distance from Seoul (15,6) to Gangeung (5,5) = " + distance(15,6,5,5));
        System.out.println("Distance from the Pohang (2,16) to Yeosu (12,24) = " + distance(2,16,12,24));
    }
    public static double roadTrip(double diameter){
        return Math.PI * diameter;
    }
    public static double distance(int x1, int y1, int x2, int y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2)) * 10;
    }
}
