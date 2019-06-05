package com.gupao.ticket.thread;

import com.gupao.ticket.BuyTicketImpl;
import com.gupao.ticket.Person;
import com.gupao.ticket.Ticket;

public class Thread_2 extends BuyTicketImpl implements Runnable {


    @Override
    public void run() {

        Thread_2 thread_2 = new Thread_2();

        Person person = new Person();

        person.setUserNo("3");

        Ticket ticket = thread_2.buyTiket(person);

        System.out.println(ticket.toString());
    }


    public static void main(String [] args){

        Thread_2  thread = new Thread_2();

        thread.run();

    }
}
