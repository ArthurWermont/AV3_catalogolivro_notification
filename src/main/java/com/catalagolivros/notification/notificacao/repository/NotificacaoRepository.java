package com.catalogo.notificacao.repository;

import com.catalogo.notificacao.model.Notificacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface NotificacaoRepository extends JpaRepository<Notificacao, Long> {

    List<Notificacao> findByUsuarioId(Long usuarioId);

    List<Notificacao> findByStatus(String status);

    List<Notificacao> findByUsuarioIdAndTipoAndDataCriacaoAfter(
        Long usuarioId, 
        String tipo, 
        LocalDateTime dataCriacao
    );
}
