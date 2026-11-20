package com.teste.ArqHexagonal.application.usecases;

import com.teste.ArqHexagonal.domain.produto.Produto;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoCreateDTO;

public interface ProdutoUseCases {
   Produto cadastrarProduto(ProdutoCreateDTO dto);
}
