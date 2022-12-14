package idat.edu.pe.curisinche.hospedaje.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.curisinche.hospedaje.dto.HospedajeDTO;
import idat.edu.pe.curisinche.hospedaje.model.Hospedaje;
import idat.edu.pe.curisinche.hospedaje.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {
	@Autowired
	private HospedajeRepository repository;

	@Override
	public List<HospedajeDTO> listar() {
		return repository.findAll().stream()
						.map(h -> new HospedajeDTO(h.getIdHospedaje(), h.getNombre()))
						.collect(Collectors.toList());
	}

	@Override
	public void guardar(HospedajeDTO dto) {
		Hospedaje hospedaje = new Hospedaje(0, dto.getNom());
		repository.save(hospedaje);
	}

}
