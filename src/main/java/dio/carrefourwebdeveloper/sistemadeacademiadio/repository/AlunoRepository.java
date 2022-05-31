package dio.carrefourwebdeveloper.sistemadeacademiadio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

    
}
