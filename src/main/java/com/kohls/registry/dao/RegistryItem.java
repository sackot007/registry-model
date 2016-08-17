package com.kohls.registry.dao;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "registry_item")
public class RegistryItem {

	@Id
	private String id;

	@ManyToOne
	@JoinColumn(name = "registry_id")
	private Registry registry;

	private String description;
	private float price;

	public Registry getRegistry() {
		return registry;
	}

	public void setRegistry(Registry registry) {
		this.registry = registry;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		builder.append("RegistryItem [id=").append(id).append(", registry=")
				.append(registry).append(", description=").append(description)
				.append(", price=").append(price).append("]");
		return builder.toString();
	}
}
