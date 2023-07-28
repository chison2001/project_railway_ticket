package vn.edu.iuh.railway_ticket.services;

import	vn.edu.iuh.railway_ticket.exceptions.NoProductExistInRepository;
import vn.edu.iuh.railway_ticket.models.Product;
import vn.edu.iuh.railway_ticket.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAll() throws NoProductExistInRepository {
        List<Product> all = productRepository.findAll();

        if (all.isEmpty()) {
            throw new NoProductExistInRepository();
        } else {
            return all;
        }
    }

    @Override
    public Product getById(Long pid) throws NoProductExistInRepository {
        Optional<Product> product = productRepository.findById(pid);
        if(product.isEmpty()){
            throw new NoProductExistInRepository();
        }else{
            return product.get();
        }
    }

    @Override
    public Product add1(Product product) {
        return productRepository.save(product);
    }


}
