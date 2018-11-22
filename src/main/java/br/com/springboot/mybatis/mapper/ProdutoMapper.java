package br.com.springboot.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import br.com.springboot.mybatis.model.Produto;

@Mapper
public interface ProdutoMapper {

    List<Produto> findAll();

    List<Produto> findById(Long id);

    List<Object> findToMap();
}
