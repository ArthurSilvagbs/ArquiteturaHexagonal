package com.teste.ArqHexagonal.application.service;

import com.teste.ArqHexagonal.application.usecases.ProdutoUseCases;
import com.teste.ArqHexagonal.domain.produto.Produto;
import com.teste.ArqHexagonal.domain.produto.ProdutoRepository;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoCreateDTO;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoResponseDTO;
import com.teste.ArqHexagonal.utils.mapper.ProdutoMapper;
import org.springframework.stereotype.Service;

public class ProdutoService implements ProdutoUseCases {

   private final ProdutoRepository repository;
   private final ProdutoMapper mapper;

   public ProdutoService(ProdutoRepository repository, ProdutoMapper mapper) {
      this.repository = repository;
      this.mapper = mapper;
   }

   @Override
   public ProdutoResponseDTO cadastrarProduto(ProdutoCreateDTO dto) {
      Produto produto = mapper.mapearDtoParaProduto(dto);
      return mapper.mapearDtoParaResponse(repository.salvar(produto));
   }
}
