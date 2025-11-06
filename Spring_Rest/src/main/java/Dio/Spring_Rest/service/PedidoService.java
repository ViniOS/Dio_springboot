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

    public Pedido save(Pedido pedido) {
        
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public Pedido findByid() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'findByid'");
    }

    public List <Pedido> findAll(){
        return repository.findAll();
    }

}
