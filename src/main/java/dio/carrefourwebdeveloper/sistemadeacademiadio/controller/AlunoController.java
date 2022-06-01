package dio.carrefourwebdeveloper.sistemadeacademiadio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AlunoForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AlunoUpdateForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl.AlunoServiceImpl;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    
    @Autowired
    private AlunoServiceImpl service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
        return service.create(form);
    }
    @GetMapping("/{id}")
    public Aluno get(@PathVariable Long id){
        return service.get(id);
    }

    @PutMapping("/{id}")
    public Aluno update(@RequestBody Long id, AlunoUpdateForm form){
        return service.update(id, form);
    }

    @DeleteMapping("/{id}")
    public void delete(@RequestBody Long id){
        service.delete(id);
    }
    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicas(@PathVariable Long id){
        return service.getAllAvaliacaoFisicas(id);
    }

    @GetMapping("/avaliacoes/{id}/count")
    public Integer getCountAvaliacoesFisicas(@PathVariable Long id){
        List<AvaliacaoFisica> avaliacoes = getAllAvaliacaoFisicas(id);
        return avaliacoes.size();
    }

}