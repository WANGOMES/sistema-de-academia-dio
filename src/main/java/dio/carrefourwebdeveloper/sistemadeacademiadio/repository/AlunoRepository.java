package dio.carrefourwebdeveloper.sistemadeacademiadio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long>{

    @Query(value = "SELECT a.nome FROM tb_alunos a WHERE a.bairro = :bairro ", nativeQuery = true)
    List<Aluno> findByAlunosPorBairro(String bairro);
    
}
