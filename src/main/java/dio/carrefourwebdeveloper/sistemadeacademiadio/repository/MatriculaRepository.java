package dio.carrefourwebdeveloper.sistemadeacademiadio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Matricula;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long>{

    Matricula findByAlunoId(Long id_aluno);
    
}