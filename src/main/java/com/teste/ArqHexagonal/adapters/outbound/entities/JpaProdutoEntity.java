package com.teste.ArqHexagonal.adapters.outbound.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class JpaProdutoEntity {

   @Id
   @GeneratedValue(strategy = GenerationType.UUID)
   private UUID id;

   @Setter
   @Column(name = "nome", nullable = false)
   private String nome;

   @Setter
   private String descricao;
   private BigDecimal preco;

   public JpaProdutoEntity(String nome, String descricao, BigDecimal preco) {
      this.nome = nome;
      this.descricao = descricao;
      this.preco = preco;
   }
}
