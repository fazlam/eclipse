package com.xworkz.curd.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@AllArgsConstructor
@RequiredArgsConstructor
@NoArgsConstructor
@ToString
public class TerroristDTO extends AbstractAuditDTO{
	@NonNull
	@NotNull(message="Terroriste name can not be valid")
	@Size(min = 3,max = 20,message="Terroriste name is invalide")
	private String name;
	@NonNull
	@Min(value=20)
	@Max(value=50)
	private int age;
	@NonNull
	@NotNull(message="country name is not valid")
	@Size(min = 5,max = 30,message="country length is invalide")
	private String country;
	@NonNull
	@NotNull(message = "organisation name is invalid")
	@Size(min = 5,max = 50,message="organisation is not invalid")
	private String organisation;
	private boolean alive;
	private boolean prison;

}
