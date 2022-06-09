package dio.carrefourwebdeveloper.sistemadeacademiadio.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaUpdateForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl.AvaliacaoFisicaServiceImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@Valid @RequestBody AvaliacaoFisicaForm form){
        return service.create(form);
    }

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public AvaliacaoFisica get(@PathVariable Long id){
        return service.get(id);
    }

    @PutMapping("/{id}")
    public AvaliacaoFisica update(@PathVariable Long id, @Valid @RequestBody AvaliacaoFisicaUpdateForm form){
        return service.update(id, form);
    }
    
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        service.delete(id);
    }
       
}