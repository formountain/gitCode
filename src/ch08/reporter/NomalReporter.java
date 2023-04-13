package ch08.reporter;

public class NomalReporter implements Reportable{
    @Override
    public void report() {
        System.out.println("신고를 진행합니다.");
    }
}
