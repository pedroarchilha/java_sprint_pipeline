package br.com.fiap.mvc.repository;

import br.com.fiap.mvc.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {
}
