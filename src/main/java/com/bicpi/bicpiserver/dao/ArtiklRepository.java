package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import com.bicpi.bicpiserver.model.ArtiklEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArtiklRepository extends JpaRepository<ArtiklEntity, Integer> {
}

