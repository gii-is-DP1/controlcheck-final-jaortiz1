package org.springframework.samples.petclinic.care;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;
import org.springframework.samples.petclinic.model.NamedEntity;
import org.springframework.samples.petclinic.pet.PetType;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table
public class Care extends BaseEntity{
	@Length(min = 5, max = 30)
	@NotEmpty
	@Column(unique = true)
    String name;
	@NotEmpty
    String description;
	@ManyToMany(cascade = {
	        CascadeType.ALL,
	        CascadeType.MERGE
	    })
	
	@NotEmpty
    Set<PetType> compatiblePetTypes;
	@ManyToMany(cascade = {
	        CascadeType.ALL,
	        CascadeType.MERGE
	    })
	Set<Care> incompatibleCares;
}
