public class CountDown {
    public static void main(String[] args){
        int sum=0;
        for(int i=100;i>0;i--){
            sum+=i;
            System.out.println(i);
            System.out.println(sum);
        }
    }
}
