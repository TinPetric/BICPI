package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import com.bicpi.bicpiserver.model.NarudzbaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NarudzbaRepository extends JpaRepository<NarudzbaEntity, Integer> {
}
