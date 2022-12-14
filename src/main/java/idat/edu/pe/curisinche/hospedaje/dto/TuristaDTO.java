package idat.edu.pe.curisinche.hospedaje.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TuristaDTO {
	private Integer id;
	private String nom;
	private String cel;
	private String direc;
}
