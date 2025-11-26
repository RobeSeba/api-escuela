package tareas_personales.servicies;

import org.springframework.stereotype.Service;
import tareas_personales.entitys.Usuario;
import tareas_personales.repositories.UsuarioRepository;

import java.util.List;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository= usuarioRepository;
    }

    public List<Usuario> listarUsuario(){
        return  usuarioRepository.findAll();
    }
}
