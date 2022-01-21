package org.springframework.samples.petclinic.care;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CareService {
	/*
	 * Modificar la clase “CareService”, para que sea un servicio Spring de lógica
	 * de negocio, que permita obtener todos cuidados realizados (CareProvision). No
	 * modifique por ahora la implementación de los demás métodos del servicio.
	 */
	@Autowired
	private CareProvisionRepository careRepository;

	public List<Care> getAllCares() {
		return this.careRepository.findAllCares();
	}

	public List<Care> getAllCompatibleCares(String petTypeName) {
		return null;
	}

	public Care getCare(String careName) {
		return null;
	}

	public CareProvision save(CareProvision p) throws NonCompatibleCaresException, UnfeasibleCareException {
		return null;
	}

	public List<CareProvision> getAllCaresProvided() {
		return this.careRepository.findAll();
	}

	public List<CareProvision> getCaresProvided(Integer visitId) {
		return null;

	}

}
