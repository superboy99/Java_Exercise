package Study;
/*
 	Java程序中最基本的组成单位是类
 	类的定义格式：
 		public class 类名 {

 		}
 	这里我定义为Test1类
 */
public class Test2 {
/*
 	这里是main方法
 	main方法是程序的入口方法，代码的执行是从main方法开始的
 */
	public static void main(String[] args) {
		// 输出语句  字符串常量
		System.out.println("Hello world");
		System.out.println("-----------");

		//整数常量
		System.out.println(666);
		System.out.print(-88);
		System.out.print("\n--------\n");

		//小数常量
		System.out.println(13.14);
		System.out.println(-5.32);
		System.out.print("-----------\n");

		//字符常量
		System.out.print('A');
		System.out.print('0');
		System.out.print('我'	);
		System.out.print("\n----------\n");

		//布尔常量
		System.out.println(true);
		System.out.print(false);
		System.out.print("\n----------\n");
		//空常量  不能直接输出的

		//定义变量
		int a = 10;
		//输出变量
		System.out.print(a + "\n");

		//修改变量
		a = 20;
		System.out.print(a + "\n");

		//定义byte类型的变量
		byte b = 10;
		System.out.println(b);

		//定义short类型的变量
		short s = 100;
		System.out.println(s);

		//定义double类型的变量
		double d = 13.14;
		System.out.println(d);

		//定义char类型的变量
		char c = 'a';
		System.out.println(c);

		//定义boolean类型的变量
		boolean bb = true;
		System.out.println(bb);

		//定义long类型的变量
		long l = 1000000000000L;
		System.out.println(l);

		//定义float类型变量
		float f = 13.14F;
		System.out.print(f);

	}

}
