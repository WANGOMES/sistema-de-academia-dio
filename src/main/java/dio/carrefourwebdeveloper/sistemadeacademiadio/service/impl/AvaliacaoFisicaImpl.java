package dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaUpdateForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.repository.AlunoRepository;
import dio.carrefourwebdeveloper.sistemadeacademiadio.repository.AvaliacaoFisicaRepository;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.IAvaliacaoFisicaService;

public class AvaliacaoFisicaImpl implements IAvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        Aluno aluno = alunoRepository.getReferenceById(id);
        return repository.getReferenceById(id);
        /*
        *  verificar código
        *
        */
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm form) {
        // TODO Auto-generated method stub
        return null;
    }
    
}