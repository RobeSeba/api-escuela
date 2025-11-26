package tareas_personales.servicies;

import org.springframework.stereotype.Service;
import tareas_personales.entitys.Usuario;
import tareas_personales.repositories.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository= usuarioRepository;
    }

    public List<Usuario> ListUsersActives(){
        return  usuarioRepository.findByActiveTrue();
    }

    public Optional<Usuario> getUser(Integer id){
        return usuarioRepository.findById(id);
    }

    public void saveUser(Usuario usuario){
        usuarioRepository.save(usuario);
    }

    public void eliminar(Integer id ){
        Optional<Usuario> usuarioOptional = usuarioRepository.findById(id);

        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            usuario.setActive(false);
            usuarioRepository.save(usuario);
        }
    }

}
