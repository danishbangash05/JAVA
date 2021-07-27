public class TVControl {
    public static void main(String args[]){
        TVOnOff();
        IncreaseVolume();
        DecreaseVolume();
    }
    public static void TVOnOff(){
        boolean isTVon = true;
        if (isTVon){
            System.out.println("Turn On TV");
            System.out.println("TV turned on");
        }
        else if (isTVon){
            System.out.println("Turn off Light");
            System.out.println("Tv turned off");
        }

    }
    public static void IncreaseVolume(){
        System.out.println("Increase Volume using + Sign");
        System.out.println("Volume Increasing");
    }
    public static void DecreaseVolume(){
        System.out.println("Decrease Volume using - Sign");
        System.out.println("Volume Decreasing");
    }
}
