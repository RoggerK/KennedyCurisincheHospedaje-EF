package idat.edu.pe.curisinche.hospedaje.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "hospedaje")
public class Hospedaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idHospedaje;
	private String nombre;
}
