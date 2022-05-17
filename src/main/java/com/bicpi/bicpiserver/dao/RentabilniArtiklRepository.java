package com.bicpi.bicpiserver.dao;

import com.bicpi.bicpiserver.model.AdministratorEntity;
import com.bicpi.bicpiserver.model.RentabilniArtiklEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RentabilniArtiklRepository extends JpaRepository<RentabilniArtiklEntity, Integer> {
}
