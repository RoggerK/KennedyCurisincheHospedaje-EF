package idat.edu.pe.curisinche.hospedaje.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class HospedajeTuristaFK implements Serializable {
	
	private static final long serialVersionUID = -9051897319326283194L;

	@Column(name = "id_hospedaje", nullable = false)
	private Integer idHospedaje;
	
	@Column(name = "id_turista", nullable = false)
	private Integer idTurista;
}
