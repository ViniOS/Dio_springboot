package Dio.Spring_Rest.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dio.Spring_Rest.entity.Pedido;
import Dio.Spring_Rest.repository.PedidoRepository;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido save(Pedido pedido) throws Exception {

        return  repository.save(pedido);        
        
    }

    public Pedido findByid(Long id) {
        
        return repository.findById(id).orElse(null);
        
    }

    public List <Pedido> findAll(){
        return repository.findAll();
    }

}
