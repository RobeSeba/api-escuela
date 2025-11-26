package tareas_personales.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tareas_personales.entitys.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
