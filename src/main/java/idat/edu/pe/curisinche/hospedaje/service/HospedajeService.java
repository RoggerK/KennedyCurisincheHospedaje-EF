package idat.edu.pe.curisinche.hospedaje.service;

import java.util.List;

import idat.edu.pe.curisinche.hospedaje.dto.HospedajeDTO;

public interface HospedajeService {
	public List<HospedajeDTO> listar();
	public void guardar(HospedajeDTO dto);
	public void asignar();
}
