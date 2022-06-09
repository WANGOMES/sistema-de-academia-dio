package dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O Id do aluno precisa ser um valor positivo.")
    private Long idAluno;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "O peso do aluno precisa ser um valor positivo.")
    private double peso;

    @NotNull(message = "Preencha o campo corretamente.")
    @Positive(message = "A altura aluno precisa ser um valor positivo.")
    private double altura;
    
}