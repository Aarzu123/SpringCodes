package com.jpmc.kafka;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgController 
{
	
	private final MsgProducer producer;

	public MsgController(MsgProducer producer)
	{
		this.producer=producer;
	}
		
	@PostMapping("/publish")
	public void writemessagetoTopic(@RequestParam("message") String message)
	{
		this.producer.writeMessage(message);
	}
}