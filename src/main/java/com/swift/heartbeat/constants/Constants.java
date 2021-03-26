package com.swift.heartbeat.constants;

public enum Constants {

	SENDER_BIC("SENDER_BIC"),
	RECEIVER_BIC("RECEIVER_BIC"),
	ELAPSED_TIME("ELAPSED_TIME"),
	MON_START_TIME("MON_START_TIME"),
	MON_END_TIME("MON_END_TIME"),
	TUES_START_TIME("TUES_START_TIME"),
	TUES_END_TIME("TUES_END_TIME"),
	WED_START_TIME("WED_START_TIME"),
	WED_END_TIME("WED_END_TIME"),
	THUR_START_TIME("THUR_START_TIME"),
	THUR_END_TIME("THUR_END_TIME"),
	FRI_START_TIME("FRI_START_TIME"),
	FRI_END_TIME("FRI_END_TIME"),
	SAT_START_TIME("SAT_START_TIME"),
	SAT_END_TIME("SAT_END_TIME"),
	SUN_START_TIME("SUN_START_TIME"),
	SUN_END_TIME("SUN_END_TIME"),
	NEW("NEW"),
	COMPLETED("COMPLETED"),
	SMTP_HOST("SMTP_HOST"),
	SMTP_PORT("SMTP_PORT"),
	SMTP_AUTH("SMTP_AUTH"),
	SMTP_STARTTLS_ENABLE("SMTP_STARTTLS_ENABLE"),
	SMTP_SENDER("SMTP_SENDER"),
	SMTP_SENDER_PASSWORD("SMTP_SENDER_PASSWORD"),
	RECIPIENT("RECIPIENT"),
	SUCCESS("SUCCESS"),
	FAILURE("FAILURE"),
	EMAIL_SUBJECT("EMAIL_SUBJECT"),
	EMAIL_BODY("EMAIL_BODY"), 
	HOUSEKEEPING_TERM_IN_DAYS("HOUSEKEEPING_TERM_IN_DAYS"),
	NO_RUN("NO_RUN");
	
	private String value;
	
	Constants(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

}
