package me.dio.academia.digital.entity.form;

import javax.validation.constraints.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "O Id precisa ser positivo.")
  private Long alunoId;

  @NotNull(message = "Complete corretamente o campo.")
  @Positive(message = "O peso '${validatedValue}' precisa ser positivo.")
  private double peso;

  @NotNull(message = "Complete corretamente o campo.")
  @Positive(message = "'${validatedValue}' precisa ser positivo.")
  @DecimalMin(value = "150", message = "A altura '${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;
}
