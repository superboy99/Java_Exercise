//package Study.Class.Test7;
//
//abstract class Animal{
//	public String name;
//	public String color;
//	public String type;
//
//	protected Animal(){
//	}
//	protected Animal(String name, String color, String type) {
//		this.name = name;
//		this.color = color;
//		this.type = type;
//	}
//	public abstract void sound();
//	public abstract void eat();
//
//}
//interface Swim {
//	abstract void swim();
//}
//
//class Frog extends Animal{
//	public Frog(String name, String color, String type)
//	{
//		super(name, color, type);
//	}
//	@Override
//	public void sound()
//	{
//		System.out.println(name + "， 呱~呱！");
//	}
//	@Override
//	public void eat()
//	{
//		System.out.println(name + ", 我已经吃饱了");
//	}
//}
//
//class Rubbish extends Animal implements {
//	public Rubbish(String name, String color, String type)
//	{
//		super(name, color, type);
//	}
//
//	@Override
//	public void sound()
//	{
//		System.out.println(name + "...");
//	}
//	@Override
//	public void eat()
//	{
//		System.out.println(name + ", 我已经吃了");
//	}
//
//	@Override
//	public void swim()
//	{
//		System.out.println(name + ", 是" + type +  "， 我会游泳");
//	}
//
//}
//public class Test {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Frog frog = new Frog("青蛙", "绿色", "非哺乳动物");
//		Rubbish rubbish = new Rubbish("兔子", "白色，灰色", "哺乳动物");
//		frog.sound();
//		frog.eat();
//		rubbish.sound();
//		rubbish.eat();
//		rubbish.swim();
//	}
//}
