package com.designpatterns.application.controller;

import com.designpatterns.application.mapper.input.UsuarioRequest;
import com.designpatterns.application.mapper.output.UsuarioResponse;
import com.designpatterns.core.usuario.UsuarioService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping("usuario")
    public UsuarioResponse cadastraUsuario(@RequestBody UsuarioRequest request) {
        return usuarioService.createUser(request.converteUsuario()).converteResponse();
    }
}
