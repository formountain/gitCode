package ch08;

import ch08.Camera.Camera;
import ch08.Camera.FactoryCam;
import ch08.Camera.SpeedCam;
import ch08.detector.Detectable;
import ch08.detector.FireDetector;
import ch08.reporter.NomalReporter;
import ch08.reporter.VideoRepoter;

public class _02_Interface {
    public static void main(String[] args){

        VideoRepoter videoRepoter = new VideoRepoter();
//        videoRepoter.report();
        NomalReporter nomalReporter = new NomalReporter();
        FireDetector fireDetector = new FireDetector();

        FactoryCam factoryCam = new FactoryCam();
        factoryCam.setDetector(fireDetector);
        factoryCam.setReporter(nomalReporter);
        factoryCam.detect();
        factoryCam.report();


    }
}
