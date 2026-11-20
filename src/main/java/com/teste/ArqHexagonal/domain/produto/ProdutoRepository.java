package com.teste.ArqHexagonal.domain.produto;

import java.util.UUID;

public interface ProdutoRepository {
   Produto salvar(Produto produto);
   Produto buscarProdutoPorId(UUID id);
   void deletarProdutoPorId(UUID id);
}
