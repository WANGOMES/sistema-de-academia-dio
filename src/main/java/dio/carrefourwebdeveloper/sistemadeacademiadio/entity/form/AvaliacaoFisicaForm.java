package dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AvaliacaoFisicaForm {

    private Long idAluno;

    private double peso;

    private double altura;
    
}