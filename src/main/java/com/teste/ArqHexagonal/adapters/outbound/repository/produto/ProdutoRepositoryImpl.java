package com.teste.ArqHexagonal.adapters.outbound.repository.produto;

import com.teste.ArqHexagonal.adapters.outbound.entities.JpaProdutoEntity;
import com.teste.ArqHexagonal.domain.produto.Produto;
import com.teste.ArqHexagonal.domain.produto.ProdutoRepository;
import com.teste.ArqHexagonal.utils.mapper.ProdutoMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
@RequiredArgsConstructor
public class ProdutoRepositoryImpl implements ProdutoRepository {

   private final JpaProdutoRepository repository;
   private final ProdutoMapper mapper;

   @Override
   public Produto salvar(Produto produto) {
      JpaProdutoEntity entity = mapper.mapearProdutoParaEntidade(produto);

      return mapper.mapearEntidadeParaProduto(repository.save(entity));
   }

   //criar metodo de atualizar dados

   @Override
   public Produto buscarProdutoPorId(UUID id) {
      return null;
   }

   @Override
   public void deletarProdutoPorId(UUID id) {

   }
}
