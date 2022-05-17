package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import com.bicpi.bicpiserver.model.KorisnikEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KupacRepository extends JpaRepository<KorisnikEntity, Integer> {
}
