package ch09.Coffee;

public class CoffeByNumber {

    public int waitingNumber;
    public CoffeByNumber() {
        System.out.println("대기표를 뽑아주세요");
    }

    public CoffeByNumber(int waitingNumber) {
        this.waitingNumber = waitingNumber;
    }
    public void ready(){
        System.out.println("커피 준비 완료 : " + waitingNumber);
    }
}
