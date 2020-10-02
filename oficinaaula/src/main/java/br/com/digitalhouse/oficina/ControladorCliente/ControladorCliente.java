package br.com.digitalhouse.oficina.ControladorCliente;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ControladorCliente {
    
    @GetMapping
    public String getCliente(){
        return "Retorna os cliente cadastrados";
    }
    
    @PostMapping
    public String createCliente(){
        return "Cadastra um cliente";
    }
    
    @PutMapping
    public String updateCliente(){
        return "Edita um cliente";
    }
    
    @DeleteMapping
    public String deleteCliente(){
        return "Apaga um cliente";
    }
    
}
