package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministratorRepository extends JpaRepository<AdministratorEntity, Integer> {
}
