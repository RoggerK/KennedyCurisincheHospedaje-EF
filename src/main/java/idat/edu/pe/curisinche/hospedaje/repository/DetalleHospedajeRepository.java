package idat.edu.pe.curisinche.hospedaje.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import idat.edu.pe.curisinche.hospedaje.model.HospedajeDetalle;

@Repository
public interface DetalleHospedajeRepository extends JpaRepository<HospedajeDetalle, Integer> {

}
