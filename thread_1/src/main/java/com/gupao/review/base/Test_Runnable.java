package com.gupao.review.base;
/**
 * Runable 接口
 * @author jingyangTan
 * @version $Id$
 * @since 2019/12/10
 */
public class Test_Runnable implements Runnable {


	@Override
	public void run() {
		System.out.println("Test_Runnable");

/*
		new Thread(new Test_Runnable()).start();
*/
		System.out.println("Test_Runnable end");

	}

	public static void main(String agrs[]){
/*
		new Thread(new Test_Runnable()).start();
*/

        new Test_Runnable().run();
	}
}
