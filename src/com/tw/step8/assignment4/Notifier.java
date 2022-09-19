package com.tw.step8.assignment4;

public class Notifier {
	private final Recipients[] recipients;
	public Notifier(Recipients[] recipients) {
		this.recipients = recipients;
	}

	public boolean notify(Integer lotID, LotStatus status) {
		for (Recipients recipient : this.recipients) {
			recipient.notifyRecipient(lotID, status);
		}

		return true;
	}
}
