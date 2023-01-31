package com.xworkz.laser.component;

import org.springframework.stereotype.Component;

@Component
public class SpecialComponent {
	public SpecialComponent() {
		System.out.println("Created:" + this.getClass().getName());
	}

}
