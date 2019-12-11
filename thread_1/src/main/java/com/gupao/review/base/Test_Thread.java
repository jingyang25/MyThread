package com.gupao.review.base;
/**
 * Thread 是Runnable 接口的实现
 * @author jingyangTan
 * @version $Id$
 * @since 2019/12/10
 */
public class Test_Thread extends Thread{

	@Override
	public void  run(){
		System.out.println("Test run begin");
		/*super.run();*/
		System.out.println("Test run end");

	}

	public static void main(String agrs[]){
	   new Test_Thread().start();
	   new Thread(new Test_Thread()).start();
	}
}
