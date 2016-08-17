package com.kohls.registry.dao;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

public interface GetRegistryDao extends CrudRepository<Registry, UUID>{

}
