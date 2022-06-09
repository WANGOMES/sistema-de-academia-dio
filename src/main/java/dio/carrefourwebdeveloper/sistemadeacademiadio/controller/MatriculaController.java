package dio.carrefourwebdeveloper.sistemadeacademiadio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Matricula;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.MatriculaForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl.MatriculaServiceImpl;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form){
        return service.create(form);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

    @GetMapping("/{id}")
    public Matricula get(@PathVariable Long id){
        return service.get(id);
    }

    @GetMapping
    public List<Matricula> getAll(){
        return service.getAll();
    }
    
}