package apitiendavideo_hexagonal.apitiendavideo.puertos.primarios;

import java.util.List;

import apitiendavideo_hexagonal.apitiendavideo.modelos.Pais;

public interface IPaisServicio {

    List<Pais> listar();

    Pais obtener(long id);

    List<Pais> buscar(String nombre);

    Pais guardar(Pais pais);

    boolean eliminar(long id);

}
