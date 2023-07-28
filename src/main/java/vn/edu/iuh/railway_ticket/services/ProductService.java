package vn.edu.iuh.railway_ticket.services;

import vn.edu.iuh.railway_ticket.exceptions.NoProductExistInRepository;
import vn.edu.iuh.railway_ticket.exceptions.ProvideProperFileDetailException;
import vn.edu.iuh.railway_ticket.models.Product;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface ProductService {
    List<Product> getAll() throws NoProductExistInRepository;

    Product getById(Long pid) throws NoProductExistInRepository;

    Product add1(Product product);
}
