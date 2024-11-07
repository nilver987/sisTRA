package com.example.serviciopagos.model.pagos.repository;

import com.example.serviciopagos.model.pagos.model.Pago;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<Pago, Long> {
}
