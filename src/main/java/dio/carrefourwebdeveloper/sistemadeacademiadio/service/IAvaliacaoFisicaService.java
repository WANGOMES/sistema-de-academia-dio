package dio.carrefourwebdeveloper.sistemadeacademiadio.service;

import java.util.List;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaForm;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.AvaliacaoFisicaUpdateForm;

public interface IAvaliacaoFisicaService {

    AvaliacaoFisica create(AvaliacaoFisicaForm form);

    AvaliacaoFisica get(Long id);

    List<AvaliacaoFisica> getAll();
    
    AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm form);

    void delete(Long id);
}