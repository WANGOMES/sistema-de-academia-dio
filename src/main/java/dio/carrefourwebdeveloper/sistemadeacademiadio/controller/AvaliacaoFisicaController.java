package dio.carrefourwebdeveloper.sistemadeacademiadio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl.AvaliacaoFisicaImpl;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaImpl service;

    @GetMapping
    public List<AvaliacaoFisica> getAll(){
        return service.getAll();
    }
    @GetMapping
    public AvaliacaoFisica get(Long id){
        return service.get(id);
    }
    
}