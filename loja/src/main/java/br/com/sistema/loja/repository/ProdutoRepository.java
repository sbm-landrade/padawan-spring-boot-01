package br.com.sistema.loja.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.sistema.loja.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Long> {}
