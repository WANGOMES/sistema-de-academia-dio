package dio.carrefourwebdeveloper.sistemadeacademiadio.service;

import java.util.List;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AlunoForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AlunoUpdateForm;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll();

    Aluno update(Long id, AlunoUpdateForm form);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicas(long id);

    // public List<Aluno> findAlunosPorBairro(String bairro);
        
}