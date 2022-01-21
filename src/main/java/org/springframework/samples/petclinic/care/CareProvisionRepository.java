package org.springframework.samples.petclinic.care;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface CareProvisionRepository extends CrudRepository<CareProvision, Integer>{
    @Query("SELECT c FROM CareProvision c")
    List<CareProvision> findAll();        
    Optional<CareProvision> findById(int id);
    CareProvision save(CareProvision p);
    @Query("SELECT c FROM Care c")
	List<Care> findAllCares();
    /*@Query("SELECT c from Care c WHERE c.compatiblePetTypes.name LIKE :petTypeName")
    List<Care> findCompatibleCares(String petTypeName);*/
    @Query("Select pt from Care pt where pt.name like :name")
    Care findCareByName(String name);
    //List<CareProvision> findCaresProvidedByVisitId(Integer visitId);
}
