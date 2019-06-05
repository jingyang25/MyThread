package com.gupao.ticket.thread;

import com.gupao.ticket.BuyTicketImpl;
import com.gupao.ticket.Person;
import com.gupao.ticket.Ticket;

import java.util.concurrent.Callable;

public class Thread_3  extends BuyTicketImpl implements Callable<String> {
    @Override
    public String call() throws Exception {

        Thread_3 thread_3 = new Thread_3();

        Person person = new Person();
        person.setUserNo("4");

        Ticket ticket = thread_3.buyTiket(person);
        System.out.println(ticket.toString());
        return ticket.toString();

    }


}
