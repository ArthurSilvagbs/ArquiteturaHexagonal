package com.teste.ArqHexagonal.domain.produto;

import java.math.BigDecimal;
import java.util.UUID;

public class Produto {

   private UUID id;
   private String nome;
   private String descricao;
   private BigDecimal preco;

   public Produto(UUID id, String nome, String descricao, BigDecimal preco) {
      this.nome = nome;
      this.descricao = descricao;
      this.preco = preco;
      this.id = id;
   }

   public Produto(String nome, String descricao, BigDecimal preco) {
      this.nome = nome;
      this.descricao = descricao;
      this.preco = preco;
   }

   public Produto() {}

   public UUID getId() {
      return id;
   }

   public String getNome() {
      return nome;
   }

   public void setNome(String nome) {
      this.nome = nome;
   }

   public String getDescricao() {
      return descricao;
   }

   public void setDescricao(String descricao) {
      this.descricao = descricao;
   }

   public BigDecimal getPreco() {
      return preco;
   }

   public void setPreco(BigDecimal preco) {
      this.preco = preco;
   }
}
