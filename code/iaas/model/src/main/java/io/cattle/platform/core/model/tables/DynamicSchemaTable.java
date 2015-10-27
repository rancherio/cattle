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
public class DynamicSchemaTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord> {

	private static final long serialVersionUID = 433201263;

	/**
	 * The singleton instance of <code>cattle.dynamic_schema</code>
	 */
	public static final io.cattle.platform.core.model.tables.DynamicSchemaTable DYNAMIC_SCHEMA = new io.cattle.platform.core.model.tables.DynamicSchemaTable();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord> getRecordType() {
		return io.cattle.platform.core.model.tables.records.DynamicSchemaRecord.class;
	}

	/**
	 * The column <code>cattle.dynamic_schema.id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.name</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.account_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.Long> ACCOUNT_ID = createField("account_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * The column <code>cattle.dynamic_schema.kind</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.uuid</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.description</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.state</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.created</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.util.Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.data</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.util.Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.parent</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.String> PARENT = createField("parent", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.definition</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.String> DEFINITION = createField("definition", org.jooq.impl.SQLDataType.CLOB.length(16777215), this, "");

	/**
	 * The column <code>cattle.dynamic_schema.service_id</code>.
	 */
	public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.Long> SERVICE_ID = createField("service_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

	/**
	 * Create a <code>cattle.dynamic_schema</code> table reference
	 */
	public DynamicSchemaTable() {
		this("dynamic_schema", null);
	}

	/**
	 * Create an aliased <code>cattle.dynamic_schema</code> table reference
	 */
	public DynamicSchemaTable(java.lang.String alias) {
		this(alias, io.cattle.platform.core.model.tables.DynamicSchemaTable.DYNAMIC_SCHEMA);
	}

	private DynamicSchemaTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord> aliased) {
		this(alias, aliased, null);
	}

	private DynamicSchemaTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, java.lang.Long> getIdentity() {
		return io.cattle.platform.core.model.Keys.IDENTITY_DYNAMIC_SCHEMA;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord> getPrimaryKey() {
		return io.cattle.platform.core.model.Keys.KEY_DYNAMIC_SCHEMA_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord>>asList(io.cattle.platform.core.model.Keys.KEY_DYNAMIC_SCHEMA_PRIMARY, io.cattle.platform.core.model.Keys.KEY_DYNAMIC_SCHEMA_IDX_DYNAMIC_SCHEMA_UUID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, ?>> getReferences() {
		return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.DynamicSchemaRecord, ?>>asList(io.cattle.platform.core.model.Keys.FK_DYNAMIC_SCHEMA__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_DYNAMIC_SCHEMA__SERVICE_ID);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public io.cattle.platform.core.model.tables.DynamicSchemaTable as(java.lang.String alias) {
		return new io.cattle.platform.core.model.tables.DynamicSchemaTable(alias, this);
	}

	/**
	 * Rename this table
	 */
	public io.cattle.platform.core.model.tables.DynamicSchemaTable rename(java.lang.String name) {
		return new io.cattle.platform.core.model.tables.DynamicSchemaTable(name, null);
	}
}
