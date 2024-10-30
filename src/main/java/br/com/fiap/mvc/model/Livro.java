package br.com.fiap.mvc.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;

import java.time.LocalDate;

@Getter @Setter
@NoArgsConstructor
@Entity
@Table(name = "TB_JAVA_LIVRO")
public class Livro {

    @Id
    @GeneratedValue
    @Column(name = "cd_livro")
    private Long id;
    @Column(name = "nm_titulo", nullable = false, length = 50, unique = true)
    private String titulo;
    @Column(name = "nm_sinopse", nullable = false, length = 300)
    private String sinopse;
    @Column(name = "vl_preco", nullable = false)
    private Double preco;
    @Column(name = "nr_paginas", nullable = false, precision = 5)
    private Integer paginas;
    @Column(name = "ds_isbn", nullable = false)
    private String isbn;
    @Column(name = "ds_disponivel", nullable = false, length = 3)
    private Boolean disponivel;
    @CreatedDate
    @Column(name = "dt_publicacao", nullable = false)
    private LocalDate dataPublicacao;
    @Column(name = "ds_genero")
    private String genero;

}
