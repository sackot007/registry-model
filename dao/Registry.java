package com.kohls.registry.dao;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;
import org.springframework.data.cassandra.mapping.Table;

@Table("registry")
public class Registry {

	@PrimaryKey
	private UUID id;

	private String name;
	private String createdBy;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Registry [id=").append(id).append(", name=")
				.append(name).append(", createdBy=").append(createdBy)
				.append("]");
		return builder.toString();
	}
}
