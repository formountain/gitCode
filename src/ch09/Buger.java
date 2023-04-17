package ch09;

public class Buger {
    public static void main(String[] args){
        hamBuger[] hamBugers = new hamBuger[3];
        hamBugers[0] = new hamBuger();
        hamBugers[1] = new cheeseBuger();
        hamBugers[2] = new todnBuger();

        System.out.println("주문하신 메뉴를 만듭니다.");
        System.out.println("---------------------");
        for(hamBuger hambuger : hamBugers){
            hambuger.cook();
            System.out.println("-------------------");
        }
        System.out.println("메뉴 준비가 완료되었습니다.");
    }
    static class hamBuger{
        public String name;
        public String[] menu = {"양상추", "패티", "피클"};
        public String[] newMenu = new String[4];

        public hamBuger(){
            this("그냥");
        }
        public hamBuger(String name) {
            this.name = name;
        }

        public void cook(){
            System.out.println(this.name+" 햄버거를 제작합니다.");
            for(String a: menu){
                System.out.println(a);
            }
        }

    }
    static class cheeseBuger extends hamBuger{
        public int time = 0;
        public cheeseBuger() {
            super("치즈");
        }

        public void cook(){
            for(String a : super.menu){
                super.newMenu[this.time] = a;
                System.out.println(super.newMenu[this.time]);
            }
            super.newMenu[this.time+1] = super.name;
            System.out.println(super.newMenu[this.time+1]);

        }

    }
    static class todnBuger extends hamBuger{

        public int time;
        public todnBuger() {
            super("새우");
        }
        public void cook(){
            for(String a : super.menu){
                super.newMenu[this.time] = a;
                System.out.println(super.newMenu[this.time]);
            }
            super.newMenu[this.time+1] = super.name;
            System.out.println(super.newMenu[this.time+1]);

        }
    }
}
