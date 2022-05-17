package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import com.bicpi.bicpiserver.model.StavkaNarudzbeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StavkaNarudzbeRepository extends JpaRepository<StavkaNarudzbeEntity, Integer> {
}
