package com.teste.ArqHexagonal.adapters.inbound.controller.produto;

import com.teste.ArqHexagonal.application.usecases.ProdutoUseCases;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoCreateDTO;
import com.teste.ArqHexagonal.domain.produto.dto.ProdutoResponseDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/produto")
@RequiredArgsConstructor
public class ProdutoController {

    private final ProdutoUseCases useCases;

    @PostMapping
    public ResponseEntity<ProdutoResponseDTO> cadastrarProduto(@RequestBody ProdutoCreateDTO dto) {
        ProdutoResponseDTO response = useCases.cadastrarProduto(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

}
