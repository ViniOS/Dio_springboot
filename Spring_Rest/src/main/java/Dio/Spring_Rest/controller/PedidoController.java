package Dio.Spring_Rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Dio.Spring_Rest.entity.Pedido;
import Dio.Spring_Rest.service.PedidoService;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping(value = "/pedido")
public class PedidoController {
    
    @Autowired
    private PedidoService service;

    @PostMapping(value = "/save")
    public ResponseEntity<Pedido> salvaPedido(@RequestBody Pedido pedido) throws Exception{
        pedido = service.save(pedido);

        return ResponseEntity.ok().body(pedido);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Pedido> buscaPedido(@PathVariable Long param) {
        
        Pedido pedido = service.findByid()        ;

        return ResponseEntity.ok().body(pedido);
    }

    @GetMapping("/busca-todos")
    public ResponseEntity<List<Pedido>> buscaTodosPedidos () {
    
        List <Pedido> pedidos = service.findAll();

        return ResponseEntity.ok().body(pedidos);
    }
    
    
}
