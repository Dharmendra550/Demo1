package com.pack.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import com.pack.demo.DemoBean;
@Component
public class MyRunner implements CommandLineRunner 
{
@Autowired
ApplicationContext ctx;
	@Override
	public void run(String... args) throws Exception
	{
	DemoBean demo=ctx.getBean("demoBean",DemoBean.class);
	System.out.println("sayHello()");

	}

}
