package com.teampl.stmngsys.DTO;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserLoginDTO {

	@NotBlank
	public String id;

	@NotBlank
	public String password;

}
