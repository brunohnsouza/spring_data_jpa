package me.dio.academia.digital.entity.form;

import javax.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaUpdateForm {

  @NotNull(message = "Complete corretamente o campo.")
  @Positive(message = "O peso '${validatedValue}' precisa ser positivo.")
  private double peso;

  @NotNull(message = "Complete corretamente o campo.")
  @Positive(message = "'${validatedValue}' precisa ser positivo.")
  @DecimalMin(value = "150", message = "A altura '${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;
}
