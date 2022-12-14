package idat.edu.pe.curisinche.hospedaje.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import idat.edu.pe.curisinche.hospedaje.client.OpenFeignClient;
import idat.edu.pe.curisinche.hospedaje.dto.HospedajeDTO;
import idat.edu.pe.curisinche.hospedaje.dto.TuristaDTO;
import idat.edu.pe.curisinche.hospedaje.model.Hospedaje;
import idat.edu.pe.curisinche.hospedaje.model.HospedajeDetalle;
import idat.edu.pe.curisinche.hospedaje.model.HospedajeTuristaFK;
import idat.edu.pe.curisinche.hospedaje.repository.DetalleHospedajeRepository;
import idat.edu.pe.curisinche.hospedaje.repository.HospedajeRepository;

@Service
public class HospedajeServiceImpl implements HospedajeService {
	@Autowired
	private HospedajeRepository repository;
	@Autowired
	private DetalleHospedajeRepository detalleClient;
	@Autowired
	private OpenFeignClient client;

	@Override
	public List<HospedajeDTO> listar() {
		return repository.findAll().stream().map(h -> new HospedajeDTO(h.getIdHospedaje(), h.getNombre()))
				.collect(Collectors.toList());
	}

	@Override
	public void guardar(HospedajeDTO dto) {
		Hospedaje hospedaje = new Hospedaje(0, dto.getNom());
		repository.save(hospedaje);
	}

	@Override
	public void asignar() {
		List<TuristaDTO> listado = client.listarTuristas();
		HospedajeTuristaFK fk = null;
		HospedajeDetalle detalle = null;
		for (TuristaDTO turista : listado) {
			fk = new HospedajeTuristaFK();
			fk.setIdTurista(turista.getId());
			fk.setIdHospedaje(1);

			detalle = new HospedajeDetalle();
			detalle.setFk(fk);
			detalleClient.save(detalle);
		}
	}

}
