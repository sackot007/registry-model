package com.kohls.registry.dao;

import java.util.UUID;

import org.springframework.data.cassandra.mapping.PrimaryKey;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class RegistryItem {

	@PrimaryKey
	private UUID registry_id;
	private UUID id;

	private String description;
	private float price;

	public RegistryItem(UUID id, UUID registry_id, String description,
			float price) {
		super();
		this.id = id;
		this.registry_id = registry_id;
		this.description = description;
		this.price = price;
	}

	public UUID getRegistry_id() {
		return registry_id;
	}

	public void setRegistry_id(UUID registry_id) {
		this.registry_id = registry_id;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("RegistryItem [id=").append(id).append(", registry_id=")
				.append(registry_id).append(", description=")
				.append(description).append(", price=").append(price)
				.append("]");
		return builder.toString();
	}
}
