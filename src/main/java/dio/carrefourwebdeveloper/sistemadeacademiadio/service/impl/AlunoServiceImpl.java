package dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Service;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AlunoForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AlunoUpdateForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.repository.AlunoRepository;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.IAlunoService;

@Service
public class AlunoServiceImpl implements IAlunoService{

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento())

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return repository.getReferenceById(id);
    }

    @Override
    public List<Aluno> getAll() {
        return repository.findAll();
        
    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento())
        return repository.save(aluno);
    }

    @Override
    public void delete(Long id) {
        Aluno aluno = new Aluno();
        aluno = get(id);
        repository.delete(aluno);
    }
}
