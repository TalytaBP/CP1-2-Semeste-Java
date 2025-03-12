package fiap.com.br.CP1_2_Java.controller;

import fiap.com.br.CP1_2_Java.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.rmi.server.UID;
import java.util.UUID;

@RestController
@RequestMapping("/produto")


public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    @GetMapping
    public String nm_produto() {
        return produtoService.nm_produto("Livros");
    }

    @PostMapping ("")
    public String nm_produto(@RequestBody String body) {
        return "Livros";
    }

}
