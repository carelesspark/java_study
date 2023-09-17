package com.java.basic;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// @Getter
// @Setter
// @NoArgsConstructor
 @AllArgsConstructor

// @RequiredArgsConstructor
 @ToString
// @EqualsAndHashCode

//@Data
// @RequiredArgsConstructor, @Getter, @Setter, @ToString, @EqualsAndHashCode


 @Builder
public class Member {
	private String id;
	private String pwd;
	
	@Builder.Default
	private int age = 10;
	private final String ADDR;
	
	@NonNull
	private String hobby;
}
