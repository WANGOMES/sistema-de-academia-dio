package dio.carrefourwebdeveloper.sistemadeacademiadio.service.impl;

import java.util.List;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaForm;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();
    
    AvaliacaoFisica update(Long id, AvaliacaoFisicaForm form);

    void delete(Long id);
}