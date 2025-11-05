package Dio.Spring_Rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Dio.Spring_Rest.entity.Produto;
import Dio.Spring_Rest.exception.ProductNullException;
import Dio.Spring_Rest.exception.ProductPriceException;
import Dio.Spring_Rest.repository.ProdutoRepository;


@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto) throws Exception {
        if(produto.getNome() == null || produto.getPreco() == null) {
            throw new ProductNullException();
        }

        if(produto.getPreco() < 0){
            throw new ProductPriceException();
        }
        return repository.save(produto);
    }

    public Produto findById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }
}   
