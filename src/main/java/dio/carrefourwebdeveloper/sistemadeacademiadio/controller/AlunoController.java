package dio.carrefourwebdeveloper.sistemadeacademiadio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;
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
    @GetMapping
    public Aluno get(@RequestBody Long id){
        return service.get(id);
    }

    @PostMapping
    public Aluno update(@RequestBody Long id, AlunoUpdateForm form){
        return service.update(id, form);
    }

    @PostMapping
    public void delete(@RequestBody Long id){
        service.delete(id);
    }

}