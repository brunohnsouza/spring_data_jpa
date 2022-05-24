package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AlunoForm {

  @NotEmpty(message = "Complete corretamente o campo.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotEmpty(message = "Complete corretamente o campo.")
  @CPF(message = "O CPF '${validatedValue}' é inválido!")
  private String cpf;

  @NotEmpty(message = "Complete corretamente o campo.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter no mínimo {min} e no máximo {max} caracteres.")
  private String bairro;

  @NotNull(message = "Complete corretamente o campo.")
  @Past(message = "A Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
