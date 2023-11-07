public class Hourglass {
    public static int wait = 12;
    public static void print_hourglass(int size) throws InterruptedException {
        System.out.print("  |");
        for(int i=0;i<size*2-5;i++){ // printing top of hourglass
            System.out.print("\"");
        }
        System.out.println("|");
        Thread.sleep(wait);
        for(int i=0;i<(size/2 + 1);i++){ // printing the top half of hourglass
            int colons = size - i*2;
            for(int j=0;j<i*2;j++){ // printing spaces before chars
                System.out.print(" ");
            }
            System.out.print("\\");
            for(int j=0;j<colons;j++){ // printing colons, a space after only if it isn't the last
                System.out.print(":");
                if(j<colons-1){
                    System.out.print(" ");
                }
            }
            System.out.println("/");
            Thread.sleep(wait);
        }
        for(int i=(size/2);i>-1;i--){ // essentially the same thing as the top half
            int colons = size - i*2;  // except the slashes are inverted and the loop is flipped
            for(int j=0;j<i*2;j++){
                System.out.print(" ");
            }
            System.out.print("/");
            for(int j=0;j<colons;j++){
                System.out.print(":");
                if(j<colons-1){
                    System.out.print(" ");
                }
            }
            System.out.println("\\");
            Thread.sleep(wait);
        }
        System.out.print("  |"); // print the bottom of the hourglass
        for(int i=0;i<size*2-5;i++){
            System.out.print("\"");
        }
        System.out.println("|");
    }
    public static void main(String[] args) throws InterruptedException {
        print_hourglass(9);
    }
}
