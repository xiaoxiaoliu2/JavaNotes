
/*
***************
public class helloworld表示helloworld是一个类，是一个公有的类
public static void main(String[] args) 表示一个主方法，即程序入口
shift+tab整体向前移，tab整体向后移

命名规则
	包名：所有字母小写，helloworld
	类名、接口名：首字母大写，HelloWorld
	变量名、方法名：第一个单词首字母小写，后面单词首字母大写：helloWorld
	常量名：所有字母大写，字母间用下划线：HELLO_WORLD

*******************************变量
变量按数据类型分类：字符串string，整型int，浮点型float，布尔型boolean
--基本数据类型primitive type：数值型（整数类型byte/short/int/long，浮点类型float/double），字符型char，布尔型boolean
	整数类型：byte（1个字节=8bit）, short（2个字节=2^16个数），int（4个字节=2^32个数），long（8个字节）
	浮点型：float单精度（占用4字节存储空间）, double双精度（占用8字节存储空间）
	7种基本数据类型之间的运算规则（不包含布尔型）
		自动类型提升：容量小的数据类型自动提升为容量大的数据类型，（表示数的范围更大）
		强制类型转换：强制将容量大的数据类型转换为小的数据类型，需使用强制符()，可能导致精度损失
	编码情况
		整型常量默认类型为int型：1就是int型
		浮点型常量默认类型为double型，floaat f1 = 12.3f
--引用数据类型reference type：类class(字符串string)，接口interface，数组({})
	String字符串，属于引用数据类型，用“”表示
 		可以和8种基本数据类型做连接运算：+
 		运算结果仍然是string类型
变量在类中声明的位置：成员变量，局部变量

*************************************二进制
计算机中不同进制的使用说明
对于整数，有四种表示方式：
> 二进制binary：0, 1(满2进1，0b或0B开头)；
	0b0 0b1 
	/0b10 0b11 
	/0b100 0b110 0b111 
	/0b1000 0b1100 0b1110 0b1111 
	/0b10000 0b11000 ob11100 0b11110 0b11111 
	/0b1000000.....

> 八进制octal：0-7(满8进1，以数字0开头表示)；
	00 01 02 03 04 05 06 07 
	/010 011 012 013 014 015 016 017 
	/020 021 022 023 024 025 026 027 
	/030 031 032 033 034 035 036 037
	/040 041 042 043 044 045 046 047
	/050 051 ....
> 十进制decimal：0-9(满10进1)； 
	0 1 2 3 4 5 6 7 8 9 
	/10 11 12 13 14 15 16 17 18 19 
	/20 21 22 23 24 25 26 27 28 29...

> 十六进制hex：0-9及A-F(满16进1，以0x或0X开头表示，不区分大小写)；
	0x0 0x1 0x2 0x3 0x4 0x5 0x6 0x7 0x8 0x9 0xA 0xB 0xC 0xD 0xE 0xF
	/0x10 0x11 0x12 0x13 0x14 0x15 0x16 0x17 0x18 0x19 0x1A 0x1B 0x1C 0x1D 0x1E 0x1F
	/0x20 0x21 0x22 0x23 0x24 0x25 0x26 0x27 0x28 0x29 0x2A 0x2B 0x2C 0x2D 0x2E 0x2F
	/0x30 0x31 0x32 0x33 0x34 0x35 0x36 0x37 0x38 0x39 0x3A 0x3B 0x3C 0x3D 0x3E 0x3F
	/.....


计算机底层都以补码的方式来存储数据
Java整数常量默认是int类型，当用二进制定义整数时，其第32位是符号位，当是long类型时，二进制默认占64位，第64位是符号位
二进制的整数有如下三种形式
原码，
反码（除符号位外，各个位取反），
补码（反码+1）

*/


public class DataType {

	public static void main(String[] args){
		System.out.println("Hello, world！");  //println先打印，后换行

		//变量_基本数据类型
		int myAge = 12;    //定义
		System.out.println(myAge);   //使用

		int myNumber;    //变量的声明
		myNumber = 1001;    //变量的赋值
		System.out.println(myNumber);

		//1、变量_基本数据类型_整数类型：byte, short, int, long：通常定义整型用int；long以‘l’或‘L’结尾
		short s1 = 128;
		int i1 = 1234;
		long l1 = 888888999999L;
		System.out.println(l1);

		//2、变量_基本数据类型_浮点型：float, double：通常用double型；float以‘f’或‘F’结尾
		double d1 = 888.888;
		float f1 = 88.9F;
		System.out.println(d1+1);
		System.out.println(f1+1);


		//3、变量_基本数据类型_字符型char：‘’单引号内部一个字符叫字符型，‘’内部多个字符叫字符串，标识方式可以是单一一个字母数字，转义字符，或者Unicode
		char c1 = 'a';    // char c2 = 'ab'  //不可以这样写，编译不通过，有两个字符了
		System.out.println(c1);

		char c2 = '\n';    //换行符
		char c5 = '\t';	//制表符
		System.out.print("hello" + c2);
		System.out.println("world");
		System.out.print("hello" + c5);
		System.out.println("world");

		char c6 = '\u0050';		//直接用Unicode表示字符型常量
		System.out.println(c6);

		//4、变量_基本数据类型_布尔型：bollean，只能取true, false，用于条件判断，循环结构中
		boolean bl1 = true;
		System.out.println(bl1);

		boolean isMarried = true;
		if(isMarried){
			System.out.println("married\n已婚");
		}else{
			System.out.println("single\n未婚");
		}


		//变量_基本数据类型_7种数据类型之间运算_自动类型提升：byte、char、 short ->int ->long ->float ->double，byte,char,short三种类型变量运算时结果为int型
		byte b2 = 2;
		char c3 = 'a';	//97
		short s2 = 123;
		int i2 = 129;
		long l2 = 8899;
		double d2 = s2;
		
		long l3 = b2 + i2;
		float f2 = b2 + i2;
		int i8 = c3 + i2;
		int i9 = c3 + s2;
		int i10 = c3 + b2;

		System.out.println(l3);
		System.out.println(f2);
		System.out.println(i8);
		System.out.println(i9);
		System.out.println(i10);


		//变量_基本数据类型_7种数据类型之间运算_强制类型转换：
		double d3 = 12.9;    //double降为int
		int i11 = (int)d3;	
		System.out.println(i11);

		long l4 = 123;    //long降为short
		short s3 = (short)l4;	
		System.out.println(s3);

		int i12 = 128;    //int降为byte
		byte b3 = (byte)i12;	
		System.out.println(b3);

		//变量_引用数据类型_字符串String
		int number = 1001;
		String numberStr = "学号：";
		boolean b1 = true;
		String info = numberStr + number;	// +：连接运算
		String info1 = info + '\t' + b1;// +：连接运算
		System.out.println(info);
		System.out.println(info1);

		//变量运算练习
		char c = 'a';	//97  A: 65
		int num = 10;
		String str = "hello";
		System.out.println(c + num + str);    //107hello
		System.out.println((c + num) + str);  //107hello
		System.out.println(c + str+ num);  //ahello10
		System.out.println(c + (num + str));  //a10hello
		System.out.println(str + num + c);  //hello10a

		System.out.println("*	*");    // *	*：''是字符型char()，分清char型做运算还是连接，""是字符串
		System.out.println('*' + '\t' + '*');  // 93
		System.out.println('*' + "\t" + '*');  // *	*
		System.out.println('*' + '\t' + "*");  // 51*
		System.out.println('*' + ('\t' + "*"));  // *	*

		//********************
		//计算机中不同进制的使用说明
		int num1 = 0b110;	//二进制
		int num2 = 0127;	//八进制
		int num3 = 110;	//十进制
		int num4 = 0x110A;	//十六进制
		System.out.println("num1 = " + num1);
		System.out.println("num2 = " + num2);
		System.out.println("num3 = " + num3);
		System.out.println("num4 = " + num4);






		//******************


	}

}





















