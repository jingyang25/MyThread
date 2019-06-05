package com.gupao.ticket.thread;

import com.gupao.ticket.BuyTicket;
import com.gupao.ticket.Person;

import java.util.HashMap;
import java.util.Map;

public class Thread_1  extends Thread{

    Map<String, BuyTicket> ticketMap = new HashMap<>();

    @Override
    public void run() {

        Person person = new Person();

        person.setUserNo("2");

        System.out.println(person.toString());


    }




    public static void main(String [] args){

        //ERROR: JDWP Unable to get JNI 1.2 environment, jvm->GetEnv() return code = -2
        //JDWP exit error AGENT_ERROR_NO_JNI_ENV(183):  [util.c:840]
        Thread_1 thread = new Thread_1();

        thread.start();



    }


}
