public class TwoRectangles {

    final static int WIDTH = 7;
    final static int HEIGHT = 4;
    public static void main(String[] args){
        for(int i=0;i<HEIGHT;i++){
            for(int j=0;j<WIDTH;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<HEIGHT;i++){
            for(int j=0;j<WIDTH;j++){
                System.out.print(" ");
            }
            for(int j=0;j<WIDTH;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
