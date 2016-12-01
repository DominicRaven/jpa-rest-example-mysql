package org.salonlike.repository;

import org.salonlike.domain.Salon;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by Dom Raven on 27/11/2016.
 */
@RepositoryRestResource(collectionResourceRel = "salon", path = "salon")
public interface SalonRepository extends PagingAndSortingRepository<Salon, Long> {

    List<Salon> getByName(String name);

}
