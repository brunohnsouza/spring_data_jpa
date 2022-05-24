package me.dio.academia.digital.entity.form;

import lombok.*;
import javax.validation.constraints.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

  @NotNull(message = "Complete corretamente o campo.")
  @Positive(message = "O Id precisa ser positivo.")
  private Long alunoId;
}
