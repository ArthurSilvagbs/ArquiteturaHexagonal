package com.teste.ArqHexagonal.adapters.outbound.repository.produto;

import com.teste.ArqHexagonal.adapters.outbound.entities.JpaProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface JpaProdutoRepository extends JpaRepository<JpaProdutoEntity, UUID> {
   Optional<JpaProdutoEntity> findByNome(String nome);
}
