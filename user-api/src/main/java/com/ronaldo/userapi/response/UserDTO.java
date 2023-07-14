package com.ronaldo.userapi.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
	
	@NotBlank(message = "Nome é obrigatorio!")
	private String nome;
	@NotBlank(message = "CPF é obrigatorio!")
	private String cpf;
	private String endereco;
	@NotBlank(message = "E-mail é obrigatorio!")
	private String email;
	private String telefone;
	private LocalDateTime dataCadastro;
	
}