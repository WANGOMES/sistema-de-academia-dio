package dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaUpdateForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.repository.AlunoRepository;
import dio.carrefourwebdeveloper.sistemadeacademiadio.repository.AvaliacaoFisicaRepository;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.IAvaliacaoFisicaService;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService{

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getIdAluno()).get();
        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return repository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return repository.findById(id).get();
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return repository.findAll();
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());
        return repository.save(avaliacaoFisica);
    }
    
}