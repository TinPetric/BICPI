package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import com.bicpi.bicpiserver.model.KupovniArtiklEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KupovniArtiklRepository extends JpaRepository<KupovniArtiklEntity, Integer> {
}
