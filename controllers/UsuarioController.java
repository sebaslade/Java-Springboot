package com.cursojava.curso.controllers;

import com.cursojava.curso.models.Usuario;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController {
    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id){
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Sebastián");
        usuario.setApellido("Laos");
        usuario.setTelefono("999999");
        usuario.setEmail("sebastianlaos2b@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario")
    public List<Usuario> getUsuario(@PathVariable Long id){
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Sebastián");
        usuario.setApellido("Laos");
        usuario.setTelefono("999999");
        usuario.setEmail("sebastianlaos2b@gmail.com");

        Usuario usuario2 = new Usuario();
        usuario2.setId(id);
        usuario2.setNombre("Matias");
        usuario2.setApellido("Delgado");
        usuario2.setTelefono("999999");
        usuario2.setEmail("matiasdelgado@gmail.com");

        Usuario usuario3 = new Usuario();
        usuario3.setId(id);
        usuario3.setNombre("Sebastián");
        usuario3.setApellido("Laos");
        usuario3.setTelefono("999999");
        usuario3.setEmail("sebastianlaos2b@gmail.com");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);

        return usuarios;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Sebastián");
        usuario.setApellido("Laos");
        usuario.setTelefono("999999");
        usuario.setEmail("sebastianlaos2b@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario2")
    public Usuario eliminar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Sebastián");
        usuario.setApellido("Laos");
        usuario.setTelefono("999999");
        usuario.setEmail("sebastianlaos2b@gmail.com");
        return usuario;
    }

    @RequestMapping(value = "usuario3")
    public Usuario buscar(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Sebastián");
        usuario.setApellido("Laos");
        usuario.setTelefono("999999");
        usuario.setEmail("sebastianlaos2b@gmail.com");
        return usuario;
    }
}
