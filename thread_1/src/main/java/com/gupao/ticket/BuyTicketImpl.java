package com.gupao.ticket;


public class BuyTicketImpl implements BuyTicket {
    @Override
    public Ticket buyTiket(Person person) {

        Ticket ticket = new Ticket();
        ticket.setUserNo(person.getUserNo());
        return ticket;
    }
}
