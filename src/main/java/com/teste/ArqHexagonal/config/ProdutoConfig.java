package com.teste.ArqHexagonal.config;

import com.teste.ArqHexagonal.application.service.ProdutoService;
import com.teste.ArqHexagonal.application.usecases.ProdutoUseCases;
import com.teste.ArqHexagonal.domain.produto.ProdutoRepository;
import com.teste.ArqHexagonal.utils.mapper.ProdutoMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProdutoConfig {

    @Bean
    public ProdutoUseCases produtoUseCases(ProdutoRepository repository, ProdutoMapper mapper) {
        return new ProdutoService(repository, mapper);
    }
}
