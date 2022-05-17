package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.KorisnikEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KorisnikRepository extends JpaRepository<KorisnikEntity, Integer> {
}
