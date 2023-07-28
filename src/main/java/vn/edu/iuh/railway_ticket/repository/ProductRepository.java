package vn.edu.iuh.railway_ticket.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import vn.edu.iuh.railway_ticket.models.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
