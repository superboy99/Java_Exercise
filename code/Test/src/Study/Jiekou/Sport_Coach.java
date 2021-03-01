//package Study.Jiekou;
//
///**
// * @author superboy
// * @version 1.0
// * @date 2021/1/10 4:28 下午
// * 我们现在有乒乓球运动员和篮球运动员，乒乓球教练和篮球教练。
// * 为了出国交流，跟乒乓球相关的人员都需要学习英语。
// * 请用所学知识分析，这个案例中有哪些具体类，哪些抽象类，哪些接口，并用代码实现。
// */
//
////定义一个说英语的接口
//interface SpeachEnglish{
//    public abstract void speak();
//}
//
////定义一个人的抽象类
//abstract class Person{
//    private String name;
//    private int age;
//
//    //无参构造方法
//    public Person(){
//
//    }
//
//    public Person(String name, int age){
//        this.name = name;
//        this.age = age;
//    }
//
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public abstract void eat();
//
//}
//
////定义一个抽象教练类
//abstract class Coach extends Person{
//    public Coach() {
//    }
//
//    public Coach(String name, int age){
//        super(name,age);
//    }
//    public abstract void teach();
//}
//
////定义抽象的运动员类
//abstract class Player extends Person{
//    public Player(){
//    }
//
//    public Player(String name, int age){
//        super(name,age);
//    }
//    public abstract void study();
//}
//
////篮球教练的具体类
//class BasketballCoach extends Coach implements SpeachEnglish{
//    public BasketballCoach(){
//    }
//
//    public BasketballCoach(String name,int age){
//        super(name,age);
//    }
//
//    @Override
//    public void teach(){
//        System.out.println("篮球教练教篮球");
//    }
//
//    @Override
//    public void eat(){
//        System.out.println("篮球教练吃篮球饭");
//    }
//
//    @Override
//    public void speak(){
//        System.out.println("篮球教练说英语");
//    }
//}
//
////乒乓球教练具体类
//class PpCoach extends Coach implements SpeachEnglish {
//    public PpCoach(){
//    }
//    public PpCoach(String name,int age){
//        super(name,age);
//    }
//
//    @Override
//    public void teach(){
//        System.out.println("乒乓球教练教乒乓球");
//    }
//    @Override
//    public void eat(){
//        System.out.println("乒乓球教练吃乒乓球饭");
//    }
//    @Override
//    public void speak(){
//        System.out.println("乒乓球教练说英语");
//    }
//}
//
////篮球运动员具体类
//class BasketBallPlayer extends Player implements SpeachEnglish{
//    public BasketBallPlayer(){}
//
//    public BasketBallPlayer(String name, int age){
//        super(name,age);
//    }
//    @Override
//    public void study(){
//        System.out.println("篮球运动员学篮球");
//    }
//
//    @Override
//    public void eat(){
//        System.out.println("篮球运动员吃篮球饭");
//    }
//
//    @Override
//    public void speak(){
//        System.out.println("篮球运动员说英语");
//    }
//}
//
////乒乓球运动员具体类
//class PpPlayer extends Player implements SpeachEnglish{
//    public PpPlayer(){
//
//    }
//
//    public  PpPlayer(String name,int age){
//        super(name,age);
//    }
//
//    @Override
//    public void study(){
//        System.out.println("乒乓球运动员学乒乓球");
//    }
//
//    @Override
//    public void eat(){
//        System.out.println("乒乓球运动员吃乒乓球饭");
//    }
//
//    @Override
//    public void speak(){
//        System.out.println("乒乓球运动员说英语");
//    }
//}
//
////测试类
//public class Sport_Coach {
//    public static void main(String[] args) {
//        PpPlayer ppp = new PpPlayer();
//        ppp.setName("superboy");
//        ppp.setAge(20);
//        ppp.eat();
//        ppp.study();
//        ppp.speak();
//        System.out.println("---------");
//
//        BasketBallPlayer bbp = new BasketBallPlayer();
//        bbp.setName("superboy");
//        bbp.setAge(20);
//        bbp.eat();
//        bbp.study();
//        bbp.speak();
//        System.out.println("---------");
//
//        BasketballCoach bbc = new BasketballCoach();
//        bbc.setName("1");
//        bbc.setAge(20);
//        bbc.eat();
//        bbc.speak();
//        bbc.teach();
//        System.out.println("----------");
//
//        PpCoach ppc = new PpCoach();
//        ppc.setName("王美丽");
//        ppc.setAge(20);
//        ppc.teach();
//        ppc.eat();
//        ppc.speak();
//    }
//}
