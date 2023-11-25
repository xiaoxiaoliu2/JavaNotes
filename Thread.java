/* 
1、程序、进程和线程的区别
程序program，为完成特定任务，用某种语言编写的‘一组指令的集合’，即一段静态的代码。
进程process，程序的一次执行过程，或是正在内存中运行的应用程序，程序是静态的，进程是动态的。
            进程作为操作系统调度和分配资源的最小单位
线程thread：进程可进一步细化为线程，是程序内部的一条执行路径。
            线程作为CPU调度和执行的最小单位

并行parallel：两个或多个事件在同一时刻发生，有多条指令在多个CPU上同时执行，多核CPU
并发concurrency：多个事件在同一个时间段内发生，在一段时间内，多条指令在单个CPU上快速轮换、交替执行，单核CPU

2、线程创建方式_创建一个类继承thread
创建一个继承于thread类的子类
重写thread类的run()     ---> 将此线程要执行的操作声明在此方法体中
创建当前thread的子类的对象
通过对象调用start()

*/

//创建一个分线程1，用于遍历100以内的偶数
public class EvenNumberTest {


}

class PrintNumber extends Thread{
    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run();
    }
}

















