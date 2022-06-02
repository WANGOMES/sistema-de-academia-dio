package dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Matricula;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.MatriculaForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.repository.AlunoRepository;
import dio.carrefourwebdeveloper.sistemadeacademiadio.repository.MatriculaRepository;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.IMatriculaService;

@Service
public class MatriculaServiceImpl implements IMatriculaService{

    @Autowired
    private MatriculaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Aluno aluno = alunoRepository.findById(form.getIdAluno()).get();
        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);
        return repository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
        
    }
    
}