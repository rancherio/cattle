/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = { "http://www.jooq.org", "3.3.0" }, comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class IpAssociationTable extends org.jooq.impl.TableImpl<io.cattle.platform.core.model.tables.records.IpAssociationRecord> {

    private static final long serialVersionUID = 1997292890;

    /**
     * The singleton instance of <code>cattle.ip_association</code>
     */
    public static final io.cattle.platform.core.model.tables.IpAssociationTable IP_ASSOCIATION = new io.cattle.platform.core.model.tables.IpAssociationTable();

    /**
     * The class holding records for this type
     */
    @Override
    public java.lang.Class<io.cattle.platform.core.model.tables.records.IpAssociationRecord> getRecordType() {
        return io.cattle.platform.core.model.tables.records.IpAssociationRecord.class;
    }

    /**
     * The column <code>cattle.ip_association.id</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.Long> ID = createField("id",
            org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.ip_association.name</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.String> NAME = createField("name",
            org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.ip_association.account_id</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.Long> ACCOUNT_ID = createField("account_id",
            org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.ip_association.kind</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.String> KIND = createField("kind",
            org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.ip_association.uuid</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.String> UUID = createField("uuid",
            org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.ip_association.description</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.String> DESCRIPTION = createField(
            "description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.ip_association.state</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.String> STATE = createField("state",
            org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.ip_association.created</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.util.Date> CREATED = createField("created",
            org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

    /**
     * The column <code>cattle.ip_association.removed</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.util.Date> REMOVED = createField("removed",
            org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

    /**
     * The column <code>cattle.ip_association.remove_time</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.util.Date> REMOVE_TIME = createField("remove_time",
            org.jooq.impl.SQLDataType.TIMESTAMP.asConvertedDataType(new io.cattle.platform.db.jooq.converter.DateConverter()), this, "");

    /**
     * The column <code>cattle.ip_association.data</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.util.Map<String, Object>> DATA = createField(
            "data", org.jooq.impl.SQLDataType.CLOB.length(65535).asConvertedDataType(new io.cattle.platform.db.jooq.converter.DataConverter()), this, "");

    /**
     * The column <code>cattle.ip_association.ip_address_id</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.Long> IP_ADDRESS_ID = createField(
            "ip_address_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.ip_association.child_ip_address_id</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.Long> CHILD_IP_ADDRESS_ID = createField(
            "child_ip_address_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.ip_association.role</code>.
     */
    public final org.jooq.TableField<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.String> ROLE = createField("role",
            org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * Create a <code>cattle.ip_association</code> table reference
     */
    public IpAssociationTable() {
        this("ip_association", null);
    }

    /**
     * Create an aliased <code>cattle.ip_association</code> table reference
     */
    public IpAssociationTable(java.lang.String alias) {
        this(alias, io.cattle.platform.core.model.tables.IpAssociationTable.IP_ASSOCIATION);
    }

    private IpAssociationTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.IpAssociationRecord> aliased) {
        this(alias, aliased, null);
    }

    private IpAssociationTable(java.lang.String alias, org.jooq.Table<io.cattle.platform.core.model.tables.records.IpAssociationRecord> aliased,
            org.jooq.Field<?>[] parameters) {
        super(alias, io.cattle.platform.core.model.CattleTable.CATTLE, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Identity<io.cattle.platform.core.model.tables.records.IpAssociationRecord, java.lang.Long> getIdentity() {
        return io.cattle.platform.core.model.Keys.IDENTITY_IP_ASSOCIATION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.IpAssociationRecord> getPrimaryKey() {
        return io.cattle.platform.core.model.Keys.KEY_IP_ASSOCIATION_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.IpAssociationRecord>> getKeys() {
        return java.util.Arrays.<org.jooq.UniqueKey<io.cattle.platform.core.model.tables.records.IpAssociationRecord>> asList(
                io.cattle.platform.core.model.Keys.KEY_IP_ASSOCIATION_PRIMARY, io.cattle.platform.core.model.Keys.KEY_IP_ASSOCIATION_IDX_IP_ASSOCIATION_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.util.List<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.IpAssociationRecord, ?>> getReferences() {
        return java.util.Arrays.<org.jooq.ForeignKey<io.cattle.platform.core.model.tables.records.IpAssociationRecord, ?>> asList(
                io.cattle.platform.core.model.Keys.FK_IP_ASSOCIATION__ACCOUNT_ID, io.cattle.platform.core.model.Keys.FK_IP_ASSOCIATION__IP_ADDRESS_ID,
                io.cattle.platform.core.model.Keys.FK_IP_ASSOCIATION__CHILD_IP_ADDRESS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public io.cattle.platform.core.model.tables.IpAssociationTable as(java.lang.String alias) {
        return new io.cattle.platform.core.model.tables.IpAssociationTable(alias, this);
    }

    /**
     * Rename this table
     */
    public io.cattle.platform.core.model.tables.IpAssociationTable rename(java.lang.String name) {
        return new io.cattle.platform.core.model.tables.IpAssociationTable(name, null);
    }
}
