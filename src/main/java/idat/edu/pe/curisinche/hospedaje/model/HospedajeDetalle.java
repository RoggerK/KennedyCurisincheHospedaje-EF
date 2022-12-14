package idat.edu.pe.curisinche.hospedaje.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "detalle_hospedaje")
public class HospedajeDetalle {
	@Id
	private HospedajeTuristaFK fk = new HospedajeTuristaFK();
}
