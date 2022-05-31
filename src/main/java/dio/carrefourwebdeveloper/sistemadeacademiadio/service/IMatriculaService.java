package dio.carrefourwebdeveloper.sistemadeacademiadio.service;

import java.util.List;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Matricula;
import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.form.MatriculaForm;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete(Long id);

}