package com.javaproject.agendadortarefas.infrastructure.security;

import com.javaproject.agendadortarefas.business.dto.UsuarioDTO;
import com.javaproject.agendadortarefas.infrastructure.client.UsuarioClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl  {

    @Autowired
    private UsuarioClient client;

    public UserDetails carregaDadosDeUsuario(String email, String token) {

        UsuarioDTO usuarioDTO = client.buscarUsuarioPorEmail(email,token);

        return User
                .withUsername(usuarioDTO.getEmail())
                .password(usuarioDTO.getSenha())
                .build();
    }
}


