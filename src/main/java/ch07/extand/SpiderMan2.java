package ch07.extand;

public class SpiderMan2 extends Person{
    Spider spider = new Spider();
    boolean isSpider;

    public void fireWeb(){
        if(isSpider){
            spider.fireWeb();
        } else {
            System.out.println("Person은 거미줄 발사 불가");
        }
    }
}
