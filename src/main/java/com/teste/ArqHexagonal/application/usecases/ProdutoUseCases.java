package com.teste.ArqHexagonal.application.usecases;

import com.teste.ArqHexagonal.domain.produto.Produto;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoCreateDTO;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoResponseDTO;

public interface ProdutoUseCases {
   ProdutoResponseDTO cadastrarProduto(ProdutoCreateDTO dto);
}
