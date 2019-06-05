package com.gupao.ticket;

public class SuperSellTickets implements Runnable {

    private static int ticket =100;
    @Override
    public void run() {

        if(ticket>0){

            synchronized (this){
                while (ticket>0){
                    ticket--;
                    System.out.println("售出一张票，余票："+ticket);
                }

                if("0".equals(ticket)){
                    System.out.println("票已售完，当前时间："+System.currentTimeMillis());
                }
            }
        }
    }


    public static void main(String [] args){

        SuperSellTickets superSellTickets = new SuperSellTickets();

        SuperSellTickets superSellTickets2 = new SuperSellTickets();

        superSellTickets.run();

        superSellTickets2.run();
    }
}
