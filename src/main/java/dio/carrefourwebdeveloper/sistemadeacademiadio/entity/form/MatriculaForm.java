package dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {
    
    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id do aluno precisa ser um valor positivo.")
    private Long idAluno;

}