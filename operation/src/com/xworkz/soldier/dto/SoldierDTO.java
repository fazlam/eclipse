package com.xworkz.soldier.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO{
	@NonNull
	@NotBlank
	@Size(min = 3,max = 20,message="Name must be >3 and <20")
	private String name;
	@Min(0)
	@Max(10000)
	private int id;
	@NonNull
	@NotBlank
	@Size(min = 5,max = 30,message="Name must be >5 and <30")
	private String rank;
	@NonNull
	@NotBlank
	@Size(min = 6,max = 40,message="Name must be >6 and <40")
	private String batallion;
	@NonNull
	@NotBlank
	@Size(min = 5,max = 20,message="Name must be >5 and <20")
	private String contry;

}
