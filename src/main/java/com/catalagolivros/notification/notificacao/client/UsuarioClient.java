package com.catalogo.notificacao.client;

import com.catalogo.notificacao.dto.UsuarioDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "usuario-service-notif", url = "${usuario.service.url:http://localhost:8081}")
public interface UsuarioClient {

    @GetMapping("/usuarios/{id}")
    UsuarioDTO buscarPorId(@PathVariable Long id);
}
