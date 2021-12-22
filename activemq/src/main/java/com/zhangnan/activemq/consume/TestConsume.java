package com.zhangnan.activemq.consume;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
public class TestConsume {

	@JmsListener(destination = "zhangnan",containerFactory = "jmsListenerContainerQueue")
	// SendTo 会将此方法返回的数据, 写入到 OutQueue 中去.
	@SendTo("123")
	public String handleMessage(String name) {
		System.out.println("成功接受Name" + name);
		return "成功接受Name" + name;
	}

}
