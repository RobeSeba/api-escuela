package tareas_personales.controllers;

import org.springframework.web.bind.annotation.*;
import tareas_personales.entitys.Usuario;
import tareas_personales.servicies.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UsuarioController {

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService ) {
        this.usuarioService = usuarioService;
    }

    @GetMapping()
    public List<Usuario> ListUsers(){
        return usuarioService.ListUsersActives();
    }

    @PostMapping()
    public void saveUser(@RequestBody Usuario usuario){
        usuarioService.saveUser(usuario);
    }
}
