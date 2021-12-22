package com.zhangnan.activemq.api;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.jms.ConnectionFactory;

@Component
public class ActivemqApi {

	@Resource
	private JmsTemplate jmsTemplate;

	@Resource
	private JmsMessagingTemplate jmsMessagingTemplate;

	public Boolean sendStringQueue(String destination, String msg) {
		try {
			ActiveMQQueue queue = new ActiveMQQueue(destination);
			jmsMessagingTemplate.convertAndSend(queue, msg);
		} catch (Exception e) {
			// log...
			return false;
		}
		return true;
	}
}
