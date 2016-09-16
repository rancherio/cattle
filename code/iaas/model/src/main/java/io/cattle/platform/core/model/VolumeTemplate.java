/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "volume_template", schema = "cattle")
public interface VolumeTemplate extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.volume_template.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.volume_template.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.volume_template.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.volume_template.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.volume_template.account_id</code>.
	 */
	public void setAccountId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.volume_template.account_id</code>.
	 */
	@javax.persistence.Column(name = "account_id", precision = 19)
	public java.lang.Long getAccountId();

	/**
	 * Setter for <code>cattle.volume_template.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.volume_template.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.volume_template.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.volume_template.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.volume_template.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.volume_template.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.volume_template.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.volume_template.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.volume_template.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.volume_template.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.volume_template.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.volume_template.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.volume_template.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.volume_template.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.volume_template.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.volume_template.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 65535)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.volume_template.driver</code>.
	 */
	public void setDriver(java.lang.String value);

	/**
	 * Getter for <code>cattle.volume_template.driver</code>.
	 */
	@javax.persistence.Column(name = "driver", length = 255)
	public java.lang.String getDriver();

	/**
	 * Setter for <code>cattle.volume_template.environment_id</code>.
	 */
	public void setStackId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.volume_template.environment_id</code>.
	 */
	@javax.persistence.Column(name = "environment_id", precision = 19)
	public java.lang.Long getStackId();

	/**
	 * Setter for <code>cattle.volume_template.external</code>.
	 */
	public void setExternal(java.lang.Boolean value);

	/**
	 * Getter for <code>cattle.volume_template.external</code>.
	 */
	@javax.persistence.Column(name = "external", nullable = false, precision = 1)
	public java.lang.Boolean getExternal();

	/**
	 * Setter for <code>cattle.volume_template.per_container</code>.
	 */
	public void setPerContainer(java.lang.Boolean value);

	/**
	 * Getter for <code>cattle.volume_template.per_container</code>.
	 */
	@javax.persistence.Column(name = "per_container", nullable = false, precision = 1)
	public java.lang.Boolean getPerContainer();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface VolumeTemplate
	 */
	public void from(io.cattle.platform.core.model.VolumeTemplate from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface VolumeTemplate
	 */
	public <E extends io.cattle.platform.core.model.VolumeTemplate> E into(E into);
}
