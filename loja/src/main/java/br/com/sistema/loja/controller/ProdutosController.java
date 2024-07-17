package br.com.sistema.loja.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.sistema.loja.Produto;
import br.com.sistema.loja.repository.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutosController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listarProdutos() {
        return (List<Produto>) produtoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Void> adicionarProduto(@RequestBody Produto produto) {
        produtoRepository.save(produto);
        return ResponseEntity.status(201).build();
    }
}
