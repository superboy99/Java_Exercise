package Study.Jiekou;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/10 5:39 下午
 */

//定义一个人的抽象类
abstract class Person{
    private String name;
    private int age;
    public Person(){
    }

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
}

//定义一个讲英语的接口
interface SpeakEnglish{
    public abstract void speak();
}

//定义一个运动员的抽象类
abstract class Player extends Person{
    public Player(){
    }

    public Player(String name,int age){
        super(name,age);
    }

    public abstract void study();
}

//定义一个教练的抽象类
abstract class Coach extends Person{
    public Coach(){
    }

    public Coach(String name,int age){
        super(name,age);
    }

    public abstract void teach();
}


//具体的篮球运动员类
class BasketBallPlay extends Player implements SpeakEnglish{
    public BasketBallPlay(){}
    public BasketBallPlay(String name,int age){
        super(name,age);
    }

    @Override
    public void study(){
        System.out.println("篮球运动员打篮球");
    }

    @Override
    public void eat(){
        System.out.println("篮球运动员吃篮球饭");
    }

    @Override
    public void speak(){
        System.out.println("篮球运动员讲英语");
    }
}

//具体的乒乓球运动员类
class PpPlayer extends Player implements SpeakEnglish{
    public PpPlayer(){
    }

    public PpPlayer(String name,int age){
        super();
    }
    @Override
    public void study(){
        System.out.println("乒乓球运动员学乒乓球");
    }

    @Override
    public void eat(){
        System.out.println("乒乓球运动员吃乒乓球饭");
    }

    @Override
    public void speak(){
        System.out.println("乒乓球运动员讲英语");
    }
}

//具体的篮球教练类
class BasketBallCoach extends Coach implements SpeakEnglish{
    public BasketBallCoach(){
    }

    public BasketBallCoach (String name, int age){
        super(name,age);
    }

    @Override
    public void teach(){
        System.out.println("篮球教练教篮球");
    }

    @Override
    public void eat(){
        System.out.println("篮球教练吃篮球饭");
    }

    @Override
    public void speak(){
        System.out.println("篮球教练讲英语");
    }
}

class PpCoach extends Coach implements SpeakEnglish{
    public PpCoach(){
    }

    public PpCoach(String name,int age){
        super(name,age);
    }

    @Override
    public void teach(){
        System.out.println("乒乓球教练教乒乓球");
    }

    @Override
    public void eat(){
        System.out.println("乒乓球教练吃乒乓球饭");
    }

    @Override
    public void speak(){
        System.out.println("乒乓球教练讲英语");
    }
}

public class Sport_Coach2 {
    public static void main(String[] args) {
        BasketBallPlay bbp = new BasketBallPlay();
        bbp.setName("王丑鬼1");
        bbp.setAge(20);
        bbp.study();
        bbp.eat();
        bbp.speak();
        System.out.println("----------");

        PpPlayer ppp = new PpPlayer();
        ppp.setName("王丑鬼2");
        ppp.setAge(20);
        ppp.study();
        ppp.eat();
        ppp.speak();
        System.out.println("----------");

        BasketBallCoach bbc = new BasketBallCoach();
        bbc.setName("王丑鬼3");
        bbc.setAge(20);
        bbc.teach();
        bbc.eat();
        bbc.speak();
        System.out.println("----------");

        PpCoach ppc = new PpCoach();
        ppc.setName("王丑鬼4");
        ppc.setAge(20);
        ppc.teach();
        ppc.eat();
        ppc.speak();
    }
}
