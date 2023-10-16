package com.exp.tracker.dto;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@Getter
@Setter
public class LoginRequest {
	private String email;
	private String password;
}