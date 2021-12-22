package com.zhangnan.activemq.producer;

import com.zhangnan.activemq.api.ActivemqApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Test {

	@Resource
	private ActivemqApi activemqApi;

	@RequestMapping("/test")
	public String test() {
		activemqApi.sendStringQueue("zhangnan", "1");
		return "ok";
	}
}
