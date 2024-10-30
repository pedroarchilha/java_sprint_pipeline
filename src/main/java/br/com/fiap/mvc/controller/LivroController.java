package br.com.fiap.mvc.controller;

import br.com.fiap.mvc.model.Genero;
import br.com.fiap.mvc.model.Livro;
import br.com.fiap.mvc.repository.LivroRepository;
import jakarta.transaction.TransactionScoped;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("livro")
public class LivroController {

    @Autowired
    private LivroRepository livroRepository;


    @GetMapping("cadastrar")
    public String cadastrar(Livro livro, Model model) {
        //Enviar as constantes para a pagina
        model.addAttribute("valorGenero", Genero.values());
        return "livros/cadastro_livro";
    }

    @GetMapping("listar_livros")
    public String listarLivros(Model model){
        model.addAttribute("books", livroRepository.findAll());
        return "livros/lista_livros";
    }

    @GetMapping("editar_livro/{id}")
    public String editar(@PathVariable("id") Long id, Model model){
        model.addAttribute("livro", livroRepository.findById(id));
        model.addAttribute("valorGenero", Genero.values());
        return "livros/editar_livro";

    }

    @PostMapping("editar_livro")
    @Transactional
    public String atualizar(Livro livro, RedirectAttributes redirectAttributes){
        livroRepository.save(livro);
        redirectAttributes.addFlashAttribute("msg", "Livro atualizado");
        return "redirect:/livro/listar_livros";
    }

    @PostMapping("excluir_livro")
    @Transactional
    public String excluir(@RequestParam("id") Long id, RedirectAttributes redirectAttributes) {
        livroRepository.deleteById(id);
        redirectAttributes.addFlashAttribute("msg", "Livro excluido");
        return "redirect:/livro/listar_livros";
    }

    @PostMapping("cadastrar")
    @Transactional
    public String cadastrarBanco(Livro livro, RedirectAttributes redirectAttributes){
        livroRepository.save(livro);
        redirectAttributes.addFlashAttribute("msg", "Livro Cadastrado");
        return "redirect:/livro/listar_livros";
    }
}
