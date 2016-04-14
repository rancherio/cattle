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
@javax.persistence.Table(name = "account", schema = "cattle")
public interface Account extends java.io.Serializable {

	/**
	 * Setter for <code>cattle.account.id</code>.
	 */
	public void setId(java.lang.Long value);

	/**
	 * Getter for <code>cattle.account.id</code>.
	 */
	@javax.persistence.Id
	@javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
	public java.lang.Long getId();

	/**
	 * Setter for <code>cattle.account.name</code>.
	 */
	public void setName(java.lang.String value);

	/**
	 * Getter for <code>cattle.account.name</code>.
	 */
	@javax.persistence.Column(name = "name", length = 255)
	public java.lang.String getName();

	/**
	 * Setter for <code>cattle.account.kind</code>.
	 */
	public void setKind(java.lang.String value);

	/**
	 * Getter for <code>cattle.account.kind</code>.
	 */
	@javax.persistence.Column(name = "kind", nullable = false, length = 255)
	public java.lang.String getKind();

	/**
	 * Setter for <code>cattle.account.uuid</code>.
	 */
	public void setUuid(java.lang.String value);

	/**
	 * Getter for <code>cattle.account.uuid</code>.
	 */
	@javax.persistence.Column(name = "uuid", unique = true, nullable = false, length = 128)
	public java.lang.String getUuid();

	/**
	 * Setter for <code>cattle.account.description</code>.
	 */
	public void setDescription(java.lang.String value);

	/**
	 * Getter for <code>cattle.account.description</code>.
	 */
	@javax.persistence.Column(name = "description", length = 1024)
	public java.lang.String getDescription();

	/**
	 * Setter for <code>cattle.account.state</code>.
	 */
	public void setState(java.lang.String value);

	/**
	 * Getter for <code>cattle.account.state</code>.
	 */
	@javax.persistence.Column(name = "state", nullable = false, length = 128)
	public java.lang.String getState();

	/**
	 * Setter for <code>cattle.account.created</code>.
	 */
	public void setCreated(java.util.Date value);

	/**
	 * Getter for <code>cattle.account.created</code>.
	 */
	@javax.persistence.Column(name = "created")
	public java.util.Date getCreated();

	/**
	 * Setter for <code>cattle.account.removed</code>.
	 */
	public void setRemoved(java.util.Date value);

	/**
	 * Getter for <code>cattle.account.removed</code>.
	 */
	@javax.persistence.Column(name = "removed")
	public java.util.Date getRemoved();

	/**
	 * Setter for <code>cattle.account.remove_time</code>.
	 */
	public void setRemoveTime(java.util.Date value);

	/**
	 * Getter for <code>cattle.account.remove_time</code>.
	 */
	@javax.persistence.Column(name = "remove_time")
	public java.util.Date getRemoveTime();

	/**
	 * Setter for <code>cattle.account.data</code>.
	 */
	public void setData(java.util.Map<String,Object> value);

	/**
	 * Getter for <code>cattle.account.data</code>.
	 */
	@javax.persistence.Column(name = "data", length = 16777215)
	public java.util.Map<String,Object> getData();

	/**
	 * Setter for <code>cattle.account.external_id</code>.
	 */
	public void setExternalId(java.lang.String value);

	/**
	 * Getter for <code>cattle.account.external_id</code>.
	 */
	@javax.persistence.Column(name = "external_id", length = 255)
	public java.lang.String getExternalId();

	/**
	 * Setter for <code>cattle.account.external_id_type</code>.
	 */
	public void setExternalIdType(java.lang.String value);

	/**
	 * Getter for <code>cattle.account.external_id_type</code>.
	 */
	@javax.persistence.Column(name = "external_id_type", length = 128)
	public java.lang.String getExternalIdType();

	/**
	 * Setter for <code>cattle.account.metadata_revision</code>.
	 */
	public void setMetadataRevision(java.lang.Long value);

	/**
	 * Getter for <code>cattle.account.metadata_revision</code>.
	 */
	@javax.persistence.Column(name = "metadata_revision", nullable = false, precision = 19)
	public java.lang.Long getMetadataRevision();

	// -------------------------------------------------------------------------
	// FROM and INTO
	// -------------------------------------------------------------------------

	/**
	 * Load data from another generated Record/POJO implementing the common interface Account
	 */
	public void from(io.cattle.platform.core.model.Account from);

	/**
	 * Copy data into another generated Record/POJO implementing the common interface Account
	 */
	public <E extends io.cattle.platform.core.model.Account> E into(E into);
}
