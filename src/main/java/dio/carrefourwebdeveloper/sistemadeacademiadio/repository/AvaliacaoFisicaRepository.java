package dio.carrefourwebdeveloper.sistemadeacademiadio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dio.carrefourwebdeveloper.sistemadeacademiadio.entity.AvaliacaoFisica;

@Repository
public interface AvaliacaoFisicaRepository extends JpaRepository<AvaliacaoFisica, Long>{
    
}