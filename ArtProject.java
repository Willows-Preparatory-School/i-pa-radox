public class ArtProject {
    public static void main(String[] args){
        flatt(6);
        heartbeat(2);
        flatt(2);
        System.out.println("♡");
        System.out.print("\n\nyou failed, the patient has died >:)");
    }

    public static void heartbeat(int num){
        for(int i=0;i<num;i++){
            downSpikey(1,1);
            downSpikey(1,1);
            upSpikey(1,1);
        }
    }
    public static void upSpikey(int flatsHehe, int spikesOhNo){
        for(int i=0;i<spikesOhNo;i++){
            System.out.print("٨");
            for (int j = 0; j < flatsHehe; j++) {
                System.out.print("ـ");
            }
        }
    }
    public static void downSpikey(int flatsHehe,int downSpikes){
        for(int i=0;i<downSpikes;i++){
            System.out.print("ﮩ");
            for (int j = 0; j < flatsHehe; j++) {
                System.out.print("ـ");
            }
        }
    }
    public static void flatt(int flatsHehe){
        for (int j = 0; j < flatsHehe; j++) {
            System.out.print("ـ");
        }
    }
}
