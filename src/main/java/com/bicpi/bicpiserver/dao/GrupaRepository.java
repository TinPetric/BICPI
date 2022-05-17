package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import com.bicpi.bicpiserver.model.GrupaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupaRepository extends JpaRepository<GrupaEntity, Integer> {
}
