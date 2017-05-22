/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.3.0" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ConfigItemStatusTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord> {

	private static final long serialVersionUID = 1749137116;

	/**
	 * The singleton instance of <code>cattle.config_item_status</code>
	 */
	public static final io.cattle.platform.core.model.tables.ConfigItemStatusTable CONFIG_ITEM_STATUS = new io.cattle.platform.core.model.tables.ConfigItemStatusTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord.class;
	}

	/**
	 * The column <code>cattle.config_item_status.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.config_item_status.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.config_item_status.requested_version</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> REQUESTED_VERSION = createField("requested_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>cattle.config_item_status.applied_version</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> APPLIED_VERSION = createField("applied_version", org.jooq.impl.SQLDataType.BIGINT.nullable(false).defaulted(true), this, "");

	/**
	 * The column <code>cattle.config_item_status.source_version</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.String> SOURCE_VERSION = createField("source_version", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.config_item_status.requested_updated</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.util.Date> REQUESTED_UPDATED = createField("requested_updated", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.config_item_status.applied_updated</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.util.Date> APPLIED_UPDATED = createField("applied_updated", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.config_item_status.agent_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> AGENT_ID = createField("agent_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.config_item_status.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.config_item_status.service_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.config_item_status.resource_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> RESOURCE_ID = createField("resource_id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.config_item_status.resource_type</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.String> RESOURCE_TYPE = createField("resource_type", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.config_item_status.environment_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> STACK_ID = createField("environment_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.config_item_status.host_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.config_item_status.deployment_unit_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> DEPLOYMENT_UNIT_ID = createField("deployment_unit_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.config_item_status</code> table reference
	 */
	public ConfigItemStatusTable() {
		this("config_item_status", null);
	}

	/**
	 * Create an aliased <code>cattle.config_item_status</code> table reference
	 */
	public ConfigItemStatusTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.ConfigItemStatusTable.CONFIG_ITEM_STATUS);
	}

	private ConfigItemStatusTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord> aliased) {
		this(alias, aliased, null);
	}

	private ConfigItemStatusTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_CONFIG_ITEM_STATUS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_CONFIG_ITEM_STATUS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord>>asList(io.cattle.platform.core.model.Keys.KEY_CONFIG_ITEM_STATUS_PRIMARY, io.cattle.platform.core.model.Keys.KEY_CONFIG_ITEM_STATUS_IDX_CONFIG_ITEM_STATUS_RESOURCE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.ConfigItemStatusRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_CONFIG_ITEM__NAME, io.cattle.platform.core.model.Keys.FK_CONFIG_ITEM__AGENT_ID, io.cattle.platform.core.model.Keys.FK_CONFIG_ITEM__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_CONFIG_ITEM__SERVICE_ID, io.cattle.platform.core.model.Keys.FK_CONFIG_ITEM__ENVIRONMENT_ID, io.cattle.platform.core.model.Keys.FK_CONFIG_ITEM__HOST_ID, io.cattle.platform.core.model.Keys.FK_CONFIG_ITEM__DEPLOYMENT_UNIT_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.ConfigItemStatusTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.ConfigItemStatusTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.ConfigItemStatusTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.ConfigItemStatusTable(name, null);
	}
}
