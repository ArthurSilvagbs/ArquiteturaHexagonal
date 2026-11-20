package com.teste.ArqHexagonal.domain.produto.dto;

import java.math.BigDecimal;
import java.util.UUID;

public record ProdutoResponseDTO(
   UUID id,
   String nome,
   String descricao,
   BigDecimal valor
) {
}
