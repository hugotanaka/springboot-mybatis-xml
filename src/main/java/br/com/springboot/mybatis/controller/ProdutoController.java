package br.com.springboot.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.springboot.mybatis.model.Produto;
import br.com.springboot.mybatis.service.ProdutoService;

@RestController
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @GetMapping(value = "/all")
    public List<Produto> findAll() {
        return service.findAll();
    }

    @GetMapping(value = "/id")
    public List<Produto> findById(@RequestParam(name = "id") Long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/map")
    public Object findToMap() {
        return service.findToMap();
    }

}
