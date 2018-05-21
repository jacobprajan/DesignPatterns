package com.dev;

import org.apache.commons.text.StringEscapeUtils;

// Decorator. Implements Component interface

public class HtmlEncodedMessage implements Message {

	private Message msg;
	
	public HtmlEncodedMessage(Message msg) {
		this.msg = msg;
	}

	@Override
	public String getContent() {
		return StringEscapeUtils.escapeHtml4(msg.getContent());
	}

	
	
}
