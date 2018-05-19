package com.dev;

public abstract class MessageCreator {

	// Factory method
	public abstract Message createMessage();

	public Message getMessage() {

		Message msg = createMessage();

		// Abstract creator will perform some additional operations and then return to
		// client
		// But additional operations are not mandatory

		msg.addMessage();
		msg.addDefaultHeaders();
		msg.encrypt();

		return msg;
	}

}
