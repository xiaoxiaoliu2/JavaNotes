

/*
运算符是一种特殊的符号，用来表示数据的运算、赋值和比较：算术运算符，赋值运算符，比较运算符/关系运算符，逻辑运算符，位运算符，三元运算符

>算术运算符：+ - * / % ++ --正负号，加减乘除，取模/余数，加加(前/后)，减减(前/后)，字符串连接
	1)前++，先自增1，后运算
	2)后++，先运算，后自增1
>赋值运算符：= += -= *= /= %=
>比较运算符/关系运算符:== != < > <= >=，结果是布尔型，判断，true, false
>逻辑运算符：& && | || ! ^， 通常用短路与&&，短路或||， （仅适用于布尔类型变量）
	1)&逻辑与，&&短路与：a&b a&&b  a, b都为true，输出true
		相同点1: &和&&的运算结果相同
		相同点2: 当符号左边是true时，二者都会执行符号右边的运算
		不同点：当符号左边是false时，&继续执行符号右边的运算，&&不再执行符号右边的运算
	2)|逻辑或，||短路或：a|b a||b  a, b有一个位true，输出true
		相同点1: |和||的运算结果相同
		相同点2: 当符号左边是false时，二者都会执行右边的运算
		不同点：当符号左边是true时，|继续执行符号右边的运算，||不再执行符号右边的运算
	3)!逻辑非：!a    非a，输出true
	4)^逻辑异或：a^b    a, b两个不同，输出true

>位运算符：<<, >>, >>>, &, |, ^, ~，左移，右移，无符号右移，与，或，异或，取反，（操作的是数值）
	1)位运算符操作的都是整形数据
	2)<<：在一定范围内，每向左移1位，相当于*2
	  >>：在一定范围内，每向右移1位，相当于/2
	  最高效方式计算2*8：2<<3或8<<1
>三元运算符：三个变量，(条件表达式)？表达式1:表达式2
	条件表达式的结果为布尔型
	根据条件表达式真或假，决定执行表达式1，还是表达式2
	如果表达式为true，则执行表达式1
	如果表达式为false，则执行表达式2
	三元运算符可以嵌套使用
	凡是可以使用三元运算符的地方都可以改写成if-else（流程控制语句），反之不成立
	优先选用三元运算符，因为简洁，效率高
>


希望变量实现+1操作：num = num +1; num += 1; num++



*/


public class Operator {

	public static void main(String args[]){
		//************************************************************
		//运算符_算数运算符_除 /
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		int result2 = num1 / num2 * num2;
		double result3 = num1 / num2;
		double result4 = num1 / num2 + 0.0;
		double result5 = num1 / (num2 + 0.0);
		double result6 = (double)num1 / num2;
		System.out.println(result1);	// 2
		System.out.println(result2);	// 10
		System.out.println(result3);	// 2.0
		System.out.println(result4);	// 2.0
		System.out.println(result5);	// 2.4
		System.out.println(result6);	// 2.4


		//运算符_算数运算符_余%：结果的符号与被除数的符号相同；开发中，经常使用%来判断能否被除尽的情况
		int m1 = 12;
		int n1 = 5;
		int m2 = -12;
		int n2 = 5;
		int m3 = 12;
		int n3 = -5;
		int m4 = -12;
		int n4 = -5;

		System.out.println("m1 % n1 = " + m1 % n1);	// 2
		System.out.println("m2 % n2 = " + m2 % n2);	// -2
		System.out.println("m3 % n3 = " + m3 % n3);	// 2
		System.out.println("m4 % n4 = " + m4 % n4);	// -2

		//运算符_算数运算符_前++，后++
		int a1 = 10;
		int b1 = ++a1;	//前++，先自增1，后运算 a1=10+1, b1=a1
		System.out.println("a1 = " + a1 + ",b1 = " + b1);	// a1 = 11,b1 = 11
		int a2 = 10;
		int b2 = a2++;	//后++，先运算，后自增1 b2=a2, a2=10+1
		System.out.println("a2 = " + a2 + ",b2 = " + b2); 	// a2 = 11,b2 = 10
    	
    	//自增1不会改变本身变量数据类型
		short s1 = 10;
		s1++;	// s1 = (short)(s1 + 1);
		System.out.println(s1);

		//运算符_算数运算符_前--，后--

		//练习：数字187，个位数，十位数，百位数
		int num = 187;
		int bai = num / 100;
		int shi = num % 100/ 10;	// int shi = num/10;
		int ge = num % 10;
		System.out.println("百位为：" + bai);
		System.out.println("十位为：" + shi);
		System.out.println("个位为：" + ge);

		//************************************************************************
		//运算符_赋值运算符：= += -= *= /= %=

		int i1 = 10;
		int j1 = 10;

		int i2, j2;
		i2 = j2 = 10;

		int i3 = 10, j3 = 20;

		int num3 = 10;
		int num4 = 12;
		num3 += 2;	// num3 = num3 + 2
		num4 %= 5;	// num4 = num4 % 5
		System.out.println(num3);
		System.out.println(num4);

		short s2 = 10;
		s2 += 2;	// 可以编译成功，不会改变变量本身的数据类型，但是不能写成s2 = s2 + 2
		System.out.println(s2);

		//练习题
		int m5 = 2;
		int n5 = 3;
		n5 *= m5++;    // n5 = n5 * m5++    n5=3*2, m5=2+1
		System.out.println("m5 = " + m5);
		System.out.println("n5 = " + n5);

		int n6 = 10;
		n6 += (n6++) + (++n6);	// n6 = n6 + (n6++) + (++n6)   10+10+12
		System.out.println(n6);


		//运算符_比较运算符：== != < > <= >=， System.out.println(a == b); 输出布尔型，true/false

		//运算符_逻辑运算符：&逻辑与 |逻辑或 !逻辑非 &&短路与 ||短路或 ^逻辑异或， 仅适用于布尔类型变量
		boolean b5 = true;
		b5 = false;
		int num5 = 10;
		if(b5 & (num5++ >0)){
		System.out.println("我在北京");
		}else{
			System.out.println("我在南京");
		}
		System.out.println("num5 = " + num5);


		boolean b6 = true;
		b6 = false;
		int num6 = 10;
		if(b6 && (num6++ >0)){
		System.out.println("我在北京");
		}else{
			System.out.println("我在南京");
		}
		System.out.println("num6 = " + num6);


		//运算符_位运算符（了解）

		//二进制向左移两位，2^4+2^6+2^0, -->  2^6+2^4+2^2
		int i = 21;
		System.out.println("i << 2：" + (i << 2));	// 二进制左移两位，*2^2
		System.out.println("i << 3：" + (i << 2));	// 二进制左移三位，*2^3


		//练习，交换两个变量的值
		
		int num7 = 10;
		int num8 = 20;
		System.out.println("num7 = " + num7 + ", num8 = " + num8);
		//方法一 推荐
		int temp = num7;	//定义临时变量
		num7 = num8;
		num8 = temp;

		//方法二：使用位运算符
		// (m^n)^n=m=k^n
		// num1 = num1 ^ num2;
		// num2 = num1 ^ num2;
		// num1 = num1 ^ num1; 

		//*********************************************************************************
		//运算符_三元运算符，三个变量，(条件表达式)？表达式1:表达式2
		int m7 = 12;
		int n7 = 5;
		int max = (m7 > n7)? m7 : n7;
		System.out.println(max);

		String maxStr = (m7 > n7)? "m7大" : "n7大";
		System.out.println(maxStr);


		String maxStr2 = (m7 > n7)? "m7大" : ((m7 == n7)? "m7和n7相等" : "n7大");
		System.out.println(maxStr2);

		//三个数中最大值
		int n8 = 12;
		int n9 = 30;
		int n10 = -43;
		//方法一 推荐
		int max1 = (n8 > n9)? n8 : n9;
		int max2 = (max1 > n10)? max1 : n10;
		System.out.println("三个数中的最大值为：" + max2);

		//方法二 不建议
		String maxStr3 = (n8 > n9)? ((n8 > n10)?"n8大" : "n10大") : ((n9 > n10)?"n9大" : "n10大");
		System.out.println(maxStr3);

		//方法一 不建议
		int max3 = (((n8 > n9)? n8 : n9) > n10)? ((n8 > n9)? n8 : n9) : n10;
		System.out.println("三个数中的最大值为：" + max3);


		if(m7 > n7){
			System.out.println("m7大");

		}else{
			System.out.println("n7大");

		}


	}
}



































