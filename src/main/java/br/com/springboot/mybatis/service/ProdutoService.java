package br.com.springboot.mybatis.service;

import java.util.List;

import br.com.springboot.mybatis.model.Produto;

public interface ProdutoService {

    List<Produto> findAll();

    List<Produto> findById(Long id);

    Object findToMap();

}
