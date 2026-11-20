package com.teste.ArqHexagonal.domain.produto.dto;

import java.math.BigDecimal;

public record ProdutoCreateDTO(
   String nome,
   String descricao,
   BigDecimal valor
) {
}
