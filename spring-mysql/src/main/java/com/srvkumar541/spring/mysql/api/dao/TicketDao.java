package com.srvkumar541.spring.mysql.api.dao;

import org.springframework.data.repository.CrudRepository;

import com.srvkumar541.spring.mysql.api.model.Ticket;

public interface TicketDao extends CrudRepository<Ticket,Integer> {

}
