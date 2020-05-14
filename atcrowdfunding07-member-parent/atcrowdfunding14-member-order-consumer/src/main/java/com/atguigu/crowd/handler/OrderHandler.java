package com.atguigu.crowd.handler;


import com.atguigu.crowd.service.api.MySQLRemoteService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class OrderHandler {
	
	@Autowired
	private MySQLRemoteService mySQLRemoteService;
	
	private Logger logger = LoggerFactory.getLogger(OrderHandler.class);

}
