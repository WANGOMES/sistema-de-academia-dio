package dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class AlunoForm {

    private String nome;

    private String cpf;
    
    private String bairro;
    
    private LocalDate dataDeNascimento;

}