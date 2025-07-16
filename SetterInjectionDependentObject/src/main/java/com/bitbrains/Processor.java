package com.bitbrains;

import org.springframework.stereotype.Component;

@Component
public class Processor {
	public String getProcessorInfo() {
		return "AMD Processor";
	}
}
