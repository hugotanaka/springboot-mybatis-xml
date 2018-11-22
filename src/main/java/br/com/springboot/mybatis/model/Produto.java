package br.com.springboot.mybatis.model;

import lombok.Data;

@Data
public class Produto {

    private Long id;
    private Long codigo;
    private String descricao;

}
