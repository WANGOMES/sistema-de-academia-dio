package dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl;

import java.util.List;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AlunoForm;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoForm form);

    void delete(Long id);


    
}