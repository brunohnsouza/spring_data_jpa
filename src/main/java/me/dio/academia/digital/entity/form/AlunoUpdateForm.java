package me.dio.academia.digital.entity.form;

import java.time.LocalDate;
import javax.validation.constraints.*;
import org.hibernate.validator.constraints.br.CPF;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoUpdateForm {

  @NotEmpty(message = "Complete corretamente o campo.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotEmpty(message = "Complete corretamente o campo.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa ter no mínimo {min} e no máximo {max} caracteres.")
  private String bairro;

  @NotNull(message = "Complete corretamente o campo.")
  @Past(message = "A Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
