package cl.aiep.java.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.aiep.java.rest.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {

}