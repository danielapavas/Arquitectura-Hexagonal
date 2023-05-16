package apitiendavideo_hexagonal.apitiendavideo.puertos.secundarios;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import apitiendavideo_hexagonal.apitiendavideo.modelos.Pais;

@Repository
public interface IPaisRepositorio extends JpaRepository<Pais, Long> {

    @Query("SELECT p FROM Pais p WHERE p.pais LIKE '%' || ?1 || '%'")
    List<Pais> buscar(String nombre);

}