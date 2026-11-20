package com.teste.ArqHexagonal.application.service;

import com.teste.ArqHexagonal.application.usecases.ProdutoUseCases;
import com.teste.ArqHexagonal.domain.produto.Produto;
import com.teste.ArqHexagonal.domain.produto.ProdutoRepository;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoCreateDTO;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoResponseDTO;
import org.springframework.stereotype.Service;

public class ProdutoService implements ProdutoUseCases {

   private final ProdutoRepository repository;

   public ProdutoService(ProdutoRepository repository) {
      this.repository = repository;
   }

   @Override
   public ProdutoResponseDTO cadastrarProduto(ProdutoCreateDTO dto) {
      return null;
   }
}
