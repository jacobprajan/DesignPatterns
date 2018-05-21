package com.dev;

import java.util.Base64;


public class Bse64EncodedMessage implements Message {

	private Message msg;

	public Bse64EncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		// Be wary of charset! This is platform dependent
		return Base64.getEncoder().encodeToString(msg.getContent().getBytes());
	}
	
}
