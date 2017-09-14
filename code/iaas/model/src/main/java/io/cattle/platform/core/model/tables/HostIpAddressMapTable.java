/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables;


import io.cattle.platform.core.model.CattleTable;
import io.cattle.platform.core.model.Keys;
import io.cattle.platform.core.model.tables.records.HostIpAddressMapRecord;
import io.cattle.platform.db.jooq.converter.DataConverter;
import io.cattle.platform.db.jooq.converter.DateConverter;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Identity;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.9.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class HostIpAddressMapTable extends TableImpl<HostIpAddressMapRecord> {

    private static final long serialVersionUID = 1793342063;

    /**
     * The reference instance of <code>cattle.host_ip_address_map</code>
     */
    public static final HostIpAddressMapTable HOST_IP_ADDRESS_MAP = new HostIpAddressMapTable();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<HostIpAddressMapRecord> getRecordType() {
        return HostIpAddressMapRecord.class;
    }

    /**
     * The column <code>cattle.host_ip_address_map.id</code>.
     */
    public final TableField<HostIpAddressMapRecord, Long> ID = createField("id", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>cattle.host_ip_address_map.name</code>.
     */
    public final TableField<HostIpAddressMapRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.VARCHAR.length(255), this, "");

    /**
     * The column <code>cattle.host_ip_address_map.kind</code>.
     */
    public final TableField<HostIpAddressMapRecord, String> KIND = createField("kind", org.jooq.impl.SQLDataType.VARCHAR.length(255).nullable(false), this, "");

    /**
     * The column <code>cattle.host_ip_address_map.uuid</code>.
     */
    public final TableField<HostIpAddressMapRecord, String> UUID = createField("uuid", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.host_ip_address_map.description</code>.
     */
    public final TableField<HostIpAddressMapRecord, String> DESCRIPTION = createField("description", org.jooq.impl.SQLDataType.VARCHAR.length(1024), this, "");

    /**
     * The column <code>cattle.host_ip_address_map.state</code>.
     */
    public final TableField<HostIpAddressMapRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.VARCHAR.length(128).nullable(false), this, "");

    /**
     * The column <code>cattle.host_ip_address_map.created</code>.
     */
    public final TableField<HostIpAddressMapRecord, Date> CREATED = createField("created", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.host_ip_address_map.removed</code>.
     */
    public final TableField<HostIpAddressMapRecord, Date> REMOVED = createField("removed", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.host_ip_address_map.remove_time</code>.
     */
    public final TableField<HostIpAddressMapRecord, Date> REMOVE_TIME = createField("remove_time", org.jooq.impl.SQLDataType.TIMESTAMP, this, "", new DateConverter());

    /**
     * The column <code>cattle.host_ip_address_map.data</code>.
     */
    public final TableField<HostIpAddressMapRecord, Map<String,Object>> DATA = createField("data", org.jooq.impl.SQLDataType.CLOB, this, "", new DataConverter());

    /**
     * The column <code>cattle.host_ip_address_map.host_id</code>.
     */
    public final TableField<HostIpAddressMapRecord, Long> HOST_ID = createField("host_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>cattle.host_ip_address_map.ip_address_id</code>.
     */
    public final TableField<HostIpAddressMapRecord, Long> IP_ADDRESS_ID = createField("ip_address_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * Create a <code>cattle.host_ip_address_map</code> table reference
     */
    public HostIpAddressMapTable() {
        this("host_ip_address_map", null);
    }

    /**
     * Create an aliased <code>cattle.host_ip_address_map</code> table reference
     */
    public HostIpAddressMapTable(String alias) {
        this(alias, HOST_IP_ADDRESS_MAP);
    }

    private HostIpAddressMapTable(String alias, Table<HostIpAddressMapRecord> aliased) {
        this(alias, aliased, null);
    }

    private HostIpAddressMapTable(String alias, Table<HostIpAddressMapRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return CattleTable.CATTLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<HostIpAddressMapRecord, Long> getIdentity() {
        return Keys.IDENTITY_HOST_IP_ADDRESS_MAP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<HostIpAddressMapRecord> getPrimaryKey() {
        return Keys.KEY_HOST_IP_ADDRESS_MAP_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<HostIpAddressMapRecord>> getKeys() {
        return Arrays.<UniqueKey<HostIpAddressMapRecord>>asList(Keys.KEY_HOST_IP_ADDRESS_MAP_PRIMARY, Keys.KEY_HOST_IP_ADDRESS_MAP_IDX_HOST_IP_ADDRESS_MAP_UUID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<HostIpAddressMapRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<HostIpAddressMapRecord, ?>>asList(Keys.FK_HOST_IP_ADDRESS_MAP__HOST_ID, Keys.FK_HOST_IP_ADDRESS_MAP__IP_ADDRESS_ID);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public HostIpAddressMapTable as(String alias) {
        return new HostIpAddressMapTable(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public HostIpAddressMapTable rename(String name) {
        return new HostIpAddressMapTable(name, null);
    }
}