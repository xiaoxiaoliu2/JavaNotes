

/*
数据类型
运算符
流程控制
数组，面向对象


流程控制：顺序结构，分支结构(if...else, switch-case)，循环结构(for, while, do...while)
1、分支结构(if...else, switch-case)
1.1分支结构_if...else
	if(){}
	if(){}else{}
	if(){}else if(){}else if(){}else{}

1.2分支结构_switch-case
switch(表达式){
	case 常量1:
		System.out.println();  //执行语句
		//break;
	case 常量2:
		System.out.println();
	case 常量3:
		System.out.println();
	...	
	default:
		System.out.println();
}
	--根据switch表达式中的值，一次匹配各个case中的常量，一旦匹配成功，则进入相应case结构中，调用其执行语句
	--当掉用完执行语句后，仍然继续向下执行其他case结构中的执行语句，直到遇到break关键字或此switch-case结构末尾结束为止
	--break可以用在switch-case结构中，表示一旦执行到此关键字，就跳出switch-case结构
	--switch结构中的表达式只能是6中数据类型：byte, short, char, int, 枚举类型, String类型
	--case之后只能声明常量，不能声明范围
	--default相当于else

说明：
1、凡是可以使用switch-case的结构，都可以转换为if-else。反之不成立
2、我们写分支结构时，当发现既可以使用switch-case，同时switch中表达式的取值情况不太多，
又可以使用if-else时，优先选择使用switch-case。因为switch-case执行效率稍高



2、循环结构(for, while, do...while)：初始化条件，循环条件（布尔型），循环体，迭代条件
2.1循环结构_for循环
for(1⃣️初始化条件;2⃣️循环条件;4⃣️迭代条件){
	3⃣️循环体
}
1⃣️-2⃣️3⃣️4⃣️-2⃣️3⃣️4⃣️-2⃣️3⃣️4⃣️-2⃣️3⃣️4⃣️


2.2循环结构_while循环
初始化条件
while(循环条件){
	循环体;
	迭代条件;    //不能丢了，一旦丢了，可能导致死循环
}

for循环和while循环是可以相互转换的
for循环和while循环的初始化条件部分的作用范围不同


2.3环结构_do...while循环
初始化条件
do{
	循环体;
	迭代条件;
}while(循环条件);

至少会执行一次循环体

说明
	不在循环条件部分限制次数的结构for(;;)或while(true)
	结束循环两种方式
		在循环条件部分返回false
		在循环体中，执行break


//********************************************************************************************
3、流程控制_循环结构—_嵌套循环
将一个循环结构A声明在另一个循环结构B的循环体中，就构成了嵌套循环
外层循环
内层循环



*/
import java.util.Scanner;

public class ProcessControl {

	public static void main(String args[]){
		//********************************************************************************************
		//流程控制_分支结构
		//流程控制_分支结构_if...else结构

/*
		int heartBeats = 79;
		if (heartBeats < 60 || heartBeats > 100){
			System.out.println("需要做进一步检查");
		}
		System.out.println("检查结束");	


		int age = 23;
		if (age < 18){
			System.out.println("你还可以看动画片");
		}else{
			System.out.println("你可以看成人电影了");
		}


		if (age < 0) {
			System.out.println("您输入的数据非法");
		}else if (age < 18) {
			System.out.println("青少年时期");
		}else if (age < 35) {
			System.out.println("青壮年时期");
		}else if (age < 60) {
			System.out.println("中年时期");
		}else if (age < 120) {
			System.out.println("老年时期");
		}else{
			System.out.println("您是要成仙啊～～");
		}



		
		// 从键盘输入岳小鹏的期末成绩，并加以判断
		// 成绩为100分时，奖励一辆BMW；
		// 成绩为(80，99]时，奖励一台iphone x5 max；
		// 当成绩为(60，80]时，奖励一个iPad；
		// 其它时，什么奖励也没有。

		Scanner scan = new Scanner(System.in);	//Scanner的实例化

		System.out.println("请输入岳小鹏期末成绩：（0-100）");
		int score = scan.nextInt();

		if(score == 100){
			System.out.println("奖励一辆BMW");
		}else if(score > 80 && score <= 99){
			System.out.println("奖励一台iphone xs max");
		}else if(score > 60 && score <= 80){
			System.out.println("奖励一个iPad");
		}else{
			System.out.println("什么奖励也没有");
		}


		
		由键盘输入三个整数分别存入变量num1, num2, num3，对它们进行排序(使用if...else)，
		并且从小到大输出
		
		Scanner scanner = new Scanner(System.in);	//scanner实例化，

		System.out.println("请输入第一个整数：");
		int num1 = scanner.nextInt();
		System.out.println("请输入第二个整数：");
		int num2 = scanner.nextInt();
		System.out.println("请输入第三个整数：");
		int num3 = scanner.nextInt();

		if(num1 >= num2){
			if(num3 >= num1){
				System.out.println(num2 + "," + num1 + "," + num3);
			}else if(num3 <= num2){
				System.out.println(num3 + "," + num2 + "," + num1);
			}else{
				System.out.println(num2 + "," + num3 + "," + num1);
			}
		}else{
			if(num3 >= num2){
				System.out.println(num1 + "," + num2 + "," + num3);
			}else if(num3 <= num1){
				System.out.println(num3 + "," + num1 + "," + num2);
			}else{
				System.out.println(num1 + "," + num3 + "," + num2); 
			}
		}


		if(num1 >= num2){
			if(num3 >= num1)
				System.out.println(num2 + "," + num1 + "," + num3);
			else if(num3 <= num2)
				System.out.println(num3 + "," + num2 + "," + num1);
			else
				System.out.println(num2 + "," + num3 + "," + num1);
			
		}else{
			if(num3 >= num2)
				System.out.println(num1 + "," + num2 + "," + num3);
			else if(num3 <= num1)
				System.out.println(num3 + "," + num1 + "," + num2);
			else
				System.out.println(num1 + "," + num3 + "," + num2); 
		}
		
		//	课后练习：获取一个两位数的随机整数：[10 - 99]，获取区间[a,b]内随机数double的公式-->  Math.random() * (b-a+1) + a
		int value = (int)(Math.random() * 90 + 10);	//  [0.0,1.0) --> [0.0,90.0) --> [10.0,100.0) --> [10,99]
		System.out.println(value);

		// 课后练习：对男方的要求是
		// 高：身高180cm以上，富：财富1千万以上，帅：是
		// 如果这三个条件同时满足，则：“我一定要嫁给他！！！”
		// 如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
		// 如果三个条件都不满足，则：“不嫁！”
		
		System.out.println("请输入你的身高：（cm）");
		int height = scan.nextInt();
		System.out.println("请输入你的财富：（千万）");
		double wealth = scan.nextDouble();
		System.out.println("请输入你是否帅：（true/false）");
		boolean isHandsome = scan.nextBoolean();
		
		if(height >= 180 || wealth >= 1 || isHandsome) {
			System.out.println("我一定要嫁给他！！！");
		}else if(height >= 180 && wealth >= 1 && isHandsome){
			System.out.println("嫁吧，比上不足，比下有余。");
		}else{
			System.out.println("不嫁！");
		}

		//********************************************************************************************

		//流程控制_分支结构_switch-case结构
		int number = 1;
		switch(number){
		
		case 0:
			System.out.println("zero");
			break;
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;

		default:
			System.out.println("other");

		}



		String season = "summer";
		switch(season){
		
		case "spring":
			System.out.println("zero");
			break;
		case "summer":
			System.out.println("one");
			break;
		case "autumn":
			System.out.println("two");
			break;
		case "winter":
			System.out.println("three");
			break;

		default:
			System.out.println("other");

		}


		//练习：从键盘上输入2019年的“month"和”day“，通过程序输出日期为2019年的第几天
		System.out.println("请输入2019年的month：");
		int month = scan.nextInt();
		System.out.println("请输入2019年的day：");
		int day = scan.nextInt();

		//定义一个变量来保存总天数
		int sumDays = 1;
		switch(month){
		case 12:
			sumDays += 30;
		case 11:
			sumDays += 31;
		case 10:
			sumDays += 30;
		case 9:
			sumDays += 31;
		case 8:
			sumDays += 31;
		case 7:
			sumDays += 30;
		case 6:
			sumDays += 31;
		case 5:
			sumDays += 30;
		case 4:
			sumDays += 31;
		case 3:
			sumDays += 28;
		case 2:
			sumDays += 31;
		case 1:
			sumDays += day;

		}




		// 练习：从键盘分别输入年、月、日，判断这一天是当年的第几天，
		// 注：判断一年是否是闰年的标准；
		// 1）可以被4整除，但不能被100整除，
		// 或2）可以被400整除
		
		System.out.println("请输入year：");
		int year1 = scan.nextInt();
		System.out.println("请输入month：");
		int month1 = scan.nextInt();
		System.out.println("请输入day：");
		int day1 = scan.nextInt();

		//定义一个变量来保存总天数
		int sumDays1 = 1;
		switch(month1){
		case 12:
			sumDays1 += 30;
		case 11:
			sumDays1 += 31;
		case 10:
			sumDays1 += 30;
		case 9:
			sumDays1 += 31;
		case 8:
			sumDays1 += 31;
		case 7:
			sumDays1 += 30;
		case 6:
			sumDays1 += 31;
		case 5:
			sumDays1 += 30;
		case 4:
			sumDays1 += 31;
		case 3:
			// sumDays1 += 28;
			if((year1 % 4 ==0 && year1 % 100 != 0) || year1 % 400 ==0){  //判断year是否是闰年
				sumDays1 += 29;
			}else{
				sumDays1 += 28;
			}
		case 2:
			sumDays1 += 31;
		case 1:
			sumDays1 += day1;
		}

		System.out.println(year1 + "年" + month1 + "月" + day1 + "日是当年的第" + sumDays1 + "天");




		//********************************************************************************************
		//流程控制_循环结构
		//流程控制_循环结构_for循环
		//例题
		for(int i = 1; i <= 5; i++){
			System.out.println("Hello World!");	//输出五遍Hello World!
		}

		//例题
		int num = 1;
		for(System.out.print('a'); num <= 3; System.out.print('c'), num++){
			System.out.print('b');	//输出结果：abcbcbc
		}

		//例题：遍历100以内的偶数，输出所有偶数之和，输出偶数的个数
		int sum = 0;	//记录所有偶数的和
		int count = 0;
		for(int i = 1; i <= 100; i++){
			if(i % 2 == 0){
				System.out.println(i);
				sum += i;
				count++;
			}
			// System.out.println(i);
		}

		System.out.println("总和为：" + sum);   
		System.out.println("个数为：" + count);


		//例题
		// 编写程序从1循环到150，并在每行打印一个值，
		// 另外在每个3的倍数行上打印出"foo"，
		// 	在每个5的倍数行上打印“biz"，
		//
		for(int i = 1; i <= 150; i++){
			System.out.print(i + " ");
			if(i % 3 == 0){
				System.out.print("foo ");
			}
			if(i % 5 == 0){
				System.out.print("biz ");
			}
			if(i % 7 == 0){
				System.out.print("biz ");
			}
			System.out.println();
		}

		//例题
		// 输入两个正整数m和n，求其最大公约数和最小公倍数
		// 比如：12和20的最大公约数是4，最小公倍数是60。
		// 	说明：break关键字的使用 
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入第一个正整数：");
		int m = scan.nextInt();

		System.out.println("请输入第二个正整数：");
		int n = scan.nextInt();
		//获取最大公约数
		//1、获取两个数中的较小值	
		int min = (m >= n)? n : m;
		//2、遍历
		for(int i = min; i >= 1; i--){
			if(m % i == 0 && n % i == 0){
				System.out.println("最大公约数为：" + i);
				break;	//一旦在循环中执行到break，就跳出循环
			}
		}
		//获取最大公约数
		//1、获取两个数中的较大值	
		int max = (m >= n)? m : n;
		//2、遍历
		for(int i = max; i >= 1; i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("最大公倍数为：" + i);
				break;	//一旦在循环中执行到break，就跳出循环
			}
		}


		//********************************************************************************************
		//流程控制_循环结构
		//流程控制_循环结构_while循环
		int i = 1;
		while(i <= 100){
			if(i % 2 ==0){
				System.out.println(i);
			}
			i++;
		}
		System.out.println(i);

		//流程控制_循环结构
		//流程控制_循环结构_do-while循环

		//遍历100以内的偶数
		int num = 1;
		int sum = 0;
		int count = 0;
		do{
			if(num % 2 == 0){
				System.out.println(num);
				sum += num;
				count++;
			}
			num++;
		}while(num <= 100);

		System.out.println("总和为：" + sum);
		System.out.println("个数为：" + sum);



		//例题：从键盘输入个数不确定的整数，并判断读入的整数和负数的个数，输入为0时结束程序
		Scanner scan = new Scanner(System.in);
		int positiveNumber = 0;
		int negativeNumber = 0;

		while(true){						//确定不了循环要执行多少次用while(true)，或for(;;)
			int number = scan.nextInt();

			//判断number的正负情况
			if(number>0){
				positiveNumber++;
			}else if(number < 0){
				negativeNumber++;
			}else{
				break;
			}
		}

		System.out.println("输入的整数的个数为" + positiveNumber);
		System.out.println("输入的负数的个数为" + negativeNumber);

*/


		//********************************************************************************************
		//流程控制_循环结构
		//流程控制_循环结构_嵌套循环

		//System.out.println("******");
		// for(int h = 1; h <= 6; h++){
		// 	System.out.print('*');
		// }

		// System.out.println();

		/*
		******
		******
		******
		******
		******
		******
		*/


		// for(int j = 1; j <= 6; j++){
		// 	for(int k = 1; k <= 6; k++){
		// 		System.out.print('*');
		// 	}System.out.println();
		// }


		/*
		*
		**
		***
		****
		*****
		******
		*/


		// for(int k = 1; k <= 6; k++){
		// 	for(int j = 1; j <= k; j++){
		// 	System.out.print('*');
		// 	}
		// System.out.println();
		// }


		// for(int e = 6; e <= 6; e--){
		// 	for(int f = 1; f <= e; f++){
		// 	System.out.print('*');
		// 	}
		// System.out.println();
		// }

		/*
		******
		*****
		****
		***
		**
		*
		*/
		// for(int e = 1; e <= 6; e++){
		// 	for(int f = 1; f <= 7 - e; f++){
		// 	System.out.print('*');
		// 	}
		// System.out.println();
		



		/*
		     *
		    * *
		   * * *
		  * * * *
		 * * * * *
		* * * * * *
		 * * * * * 
		  * * * *  
		   * * *
		    * *
		     *

		*/
		//上半部分
		for (int i = 0; i < 5; i++){
			for(int j = 0; j < 4 - i; j++){
				System.out.print(" ");
			}
					
			for(int k = 0; k < i + 1; k++){
				System.out.print("* ");
			}
			System.out.println();
		}
		//下半部分

		for (int i = 0; i < 4; i++){
			for(int j = 0; j < i + 1; j++){
				System.out.print(" ");
			}
					
			for(int k = 0; k < 4 - i; k++){
				System.out.print("* ");
			}
			System.out.println();
		}



		// for(int h = 1; h <= 9; h++){
		// 	for(int n = 1; n <= h; n++){
		// 	System.out.print(n);
		// 	}
		// System.out.println();
		// }


		//********************************************************************************************
		//100以内所有的质数：质数只能被1和他本身整除的自然数，从2开始
		for(int i = 2; i <= 100; i++){
			boolean isFlag = true;    //标识i是否被j除尽，一旦除尽，修改其值
			// for(int j = 2; j < i; j++){	
			for(int j = 2; j < Math.sqrt(i); j++){	//优化二：对本身是指数的自然数是有效的
				if(i % j == 0){
					isFlag = false;
					break;	//优化一：只对本身非质数的自然数是有效的
				}
			}

			if(isFlag == true){
				System.out.println(i);
			}
			// //重置isFlag
			// isFlag = true;

		}
			System.out.println();
			

		//100以内所有质数方法二
		label: for(int i = 2; i <= 100; i++){
			for(int j = 2; j <= Math.sqrt(i); j++){
				if(i % j == 0){
					continue label;
				}
			}
			System.out.println(i);

		}
			System.out.println();













		//********************************************************************************************
		//break和continue关键字的使用
		for(int i = 1; i <= 10; i++){
			if(i % 4 == 0){
				break;    //123，结束当前整个循环，循环结束，默认跳出包裹此关键字的最近的一层循环
				// continue;	//123567910，结束当次循环，进行下次循环
				// System.out.println("今晚吃什么？")	//报错，关键字break和continue后面不能声明语句
			}
			System.out.print(i);
		}
		System.out.println();	//换行
		//********************************************************************************************
		//break和continue关键字的使用

		label: for(int i = 1; i <= 4; i++){
			for(int j = 1; j <= 10; j++){
				if(j % 4 == 0){
					// break;    //默认跳出包裹此关键字的最近的一层循环
					// continue;	//默认跳出包裹此关键字的最近的一层循环
					// break label;	//结束指定标识的一层循环结构
					continue label;	// 结束指定标识的一层循环结构当次循环
				}
				System.out.print(j);
			}
			System.out.println();
		}

























	}
	
}












//********************************************************************************************
/*
从键盘获取不同类型的变量，需要使用Scanner类
具体实现步骤：
1、导包：import java.util.Scanner;
2、Scanner的实例化：Scanner scan = new Scanner(System.in)
3、调用Scanner类的相关方法，来获取制定类型的变量
注意：需要根据相应的方法，来输入制定类型的值，如果输入的数据类型与要求的类型不匹配时，会报异常，InputMisMatchExcept
*/


class ScannerTest{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);	//Scanner的实例化

		int num = scan.nextInt();
		System.out.println(num);

		//调用Scanner类的相关方法
		System.out.println("请输入你的姓名：");
		String name = scan.next();
		System.out.println(name);

		System.out.println("请输入你的体重：");
		double weight = scan.nextDouble();
		System.out.println(weight);

		System.out.println("你是否相中我了呢？(true/false)");
		boolean isLove = scan.nextBoolean();
		System.out.println(isLove);

		//对于char型的获取，Scanner没有提供相关的方法，只能获取一个字符串
		System.out.println("请输入你的性别：（男/女）");
		String gender = scan.next();
		char genderChar = gender.charAt(0);
		System.out.println(genderChar);




		//********************************************************************************************
		//九九乘法表
		for(int i = 1; i <= 9; i++){
			for(int j = 1; j <= i; j++){
				System.out.print(i + "*" + j + "=" + (i * j) + " ");
			}
			System.out.println();
	
		}












	}
}


























