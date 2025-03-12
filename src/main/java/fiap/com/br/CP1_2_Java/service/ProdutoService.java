package fiap.com.br.CP1_2_Java.service;

import org.springframework.stereotype.Service;

@Service
public class ProdutoService {

    public String nm_produto(String name) {
        return "Produtos:  " + name;
    }
}
