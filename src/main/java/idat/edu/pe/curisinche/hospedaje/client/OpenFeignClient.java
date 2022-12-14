package idat.edu.pe.curisinche.hospedaje.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import idat.edu.pe.curisinche.hospedaje.dto.TuristaDTO;

@FeignClient(name = "turista-microservicio", url="localhost:8090")
public interface OpenFeignClient {
	
	@GetMapping("/api/turista/v1/listar")
	public List<TuristaDTO> listarTuristas();
}
