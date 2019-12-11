package com.gupao.review;
import com.gupao.review.base.Test_Thread;
/**
 * 线程状态
 * new - ready -running-waiting
 *
 *  running -blocked
 *  blocked -running
 *
 *  terminated
 *
 *  waiting -blocked
 *  blocked -waiting
 *
 *  waiting -running
 *  running -waiting
 *
 * @author jingyangTan
 * @version $Id$
 * @since 2019/12/10
 */
public class ThreadStatus {

	 public static  void main(String args[]) throws InterruptedException {
	 	  Thread thread = new Test_Thread();
	 	  int i=10;
	 	  while (i<=10&&i>0){
            while (i%4==0){
	            System.out.println("sleep begin :i="+i);
	            Thread.sleep(10);
	            System.out.println("sleep end :i="+i);

	            System.out.println("start begin :i="+i);
	            thread.start();
	            System.out.println("start end :i="+i);

	            if(i%5==0){
		            System.out.println("wait begin :i="+i);
		            thread.wait(10);
		            System.out.println("wait end :i="+i);
	            }
	            i--;
            }
		      System.out.println("running:i="+i);
            thread.run();
            i--;

	      }

	 }



}
