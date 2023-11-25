


public class 转义符 {

	public static void main(String args[]){


		System.out.println("北京\t天津\t上海");		// \t：制表位，实现对齐的功能
		System.out.println("jack\nsmith\nmary");		// \n：换行符
		System.out.println("/Users/lyg/Desktop/cs/java");		// \\：一个\
		System.out.println("老韩说：“要好好学习”");		// \"：一个“
		System.out.println("好好学习\r天天向上");		// \r：回车，回到该行位置0

		System.out.println("书名\t作者\t价格\t销量\n三国\t罗贯中\t120\t1000");	

		//作业1:编写hello.world程序
		System.out.println("Hello, world!");

		//作业2:将个人的基本信息（姓名、性别、籍贯、住址）打印到控制台上输出。各条信息分别占一行
		System.out.println("姓名\t性别\t籍贯\t住址\nLIU\t女\t江苏\t江苏");

		//作业3:JDK、JRE、JVM关系：Java开发工具包，Java运行环境，Java虚拟机，JDK=JRE（JVM+Java核心类库）+Java开发工具


	}
}