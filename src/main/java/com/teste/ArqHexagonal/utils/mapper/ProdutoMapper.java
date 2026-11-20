package com.teste.ArqHexagonal.utils.mapper;

import com.teste.ArqHexagonal.adapters.outbound.entities.JpaProdutoEntity;
import com.teste.ArqHexagonal.domain.produto.Produto;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoCreateDTO;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoResponseDTO;
import org.springframework.stereotype.Component;

@Component
public class ProdutoMapper {

   public Produto mapearEntidadeParaProduto(JpaProdutoEntity entity) {
      return new Produto(
         entity.getId(),
         entity.getNome(),
         entity.getDescricao(),
         entity.getPreco()
      );
   }

   public JpaProdutoEntity mapearProdutoParaEntidade(Produto produto) {
      return new JpaProdutoEntity(
         produto.getNome(),
         produto.getDescricao(),
         produto.getPreco()
      );
   }

   public Produto mapearDtoParaProduto(ProdutoCreateDTO dto) {
      return new Produto(
         dto.nome(),
         dto.descricao(),
         dto.valor()
      );
   }

   public ProdutoResponseDTO mapearDtoParaResponse(Produto produto) {
      return new ProdutoResponseDTO(
         produto.getId(),
         produto.getNome(),
         produto.getDescricao(),
         produto.getPreco()
      );
   }
}
