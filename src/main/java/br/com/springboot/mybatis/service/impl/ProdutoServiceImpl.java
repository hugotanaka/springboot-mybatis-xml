package br.com.springboot.mybatis.service.impl;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.springboot.mybatis.mapper.ProdutoMapper;
import br.com.springboot.mybatis.model.Produto;
import br.com.springboot.mybatis.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

    @Autowired
    private ProdutoMapper mapper;

    @Override
    public List<Produto> findAll() {
        return mapper.findAll();
    }

    @Override
    public List<Produto> findById(Long id) {
        return mapper.findById(id);
    }

    @Override
    public Object findToMap() {
        return mapper.findToMap();
    }

}
