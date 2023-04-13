package ch08.Camera;

public class SpeedCam extends Camera{

    public void showMainFeature(){
        System.out.println("속도 측정, 과속 단속");
    }
    public void detect(){
        System.out.println("화재를 감지합니다.");
    }

    public void report(){
        System.out.println("화재 신고를 진행합니다.");
    }
}
