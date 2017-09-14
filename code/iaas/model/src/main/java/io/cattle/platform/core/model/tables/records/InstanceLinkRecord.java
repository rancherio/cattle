/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.InstanceLink;
import io.cattle.platform.core.model.tables.InstanceLinkTable;
import io.cattle.platform.db.jooq.utils.TableRecordJaxb;

import java.util.Date;
import java.util.Map;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record15;
import org.jooq.Row15;
import org.jooq.impl.UpdatableRecordImpl;


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
@Entity
@Table(name = "instance_link", schema = "cattle")
public class InstanceLinkRecord extends UpdatableRecordImpl<InstanceLinkRecord> implements TableRecordJaxb, Record15<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, Long, Long>, InstanceLink {

    private static final long serialVersionUID = 1111315704;

    /**
     * Setter for <code>cattle.instance_link.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.instance_link.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.instance_link.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.instance_link.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.instance_link.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.instance_link.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.instance_link.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.instance_link.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.instance_link.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.instance_link.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.instance_link.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.instance_link.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.instance_link.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.instance_link.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.instance_link.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.instance_link.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.instance_link.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.instance_link.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.instance_link.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.instance_link.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>cattle.instance_link.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.instance_link.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(10);
    }

    /**
     * Setter for <code>cattle.instance_link.link_name</code>.
     */
    @Override
    public void setLinkName(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.instance_link.link_name</code>.
     */
    @Column(name = "link_name", length = 255)
    @Override
    public String getLinkName() {
        return (String) get(11);
    }

    /**
     * Setter for <code>cattle.instance_link.instance_id</code>.
     */
    @Override
    public void setInstanceId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.instance_link.instance_id</code>.
     */
    @Column(name = "instance_id", precision = 19)
    @Override
    public Long getInstanceId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>cattle.instance_link.target_instance_id</code>.
     */
    @Override
    public void setTargetInstanceId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.instance_link.target_instance_id</code>.
     */
    @Column(name = "target_instance_id", precision = 19)
    @Override
    public Long getTargetInstanceId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>cattle.instance_link.service_consume_map_id</code>.
     */
    @Override
    public void setServiceConsumeMapId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>cattle.instance_link.service_consume_map_id</code>.
     */
    @Column(name = "service_consume_map_id", precision = 19)
    @Override
    public Long getServiceConsumeMapId() {
        return (Long) get(14);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Long> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record15 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, Long, Long> fieldsRow() {
        return (Row15) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row15<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, Long, Long> valuesRow() {
        return (Row15) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return InstanceLinkTable.INSTANCE_LINK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return InstanceLinkTable.INSTANCE_LINK.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return InstanceLinkTable.INSTANCE_LINK.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return InstanceLinkTable.INSTANCE_LINK.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return InstanceLinkTable.INSTANCE_LINK.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return InstanceLinkTable.INSTANCE_LINK.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return InstanceLinkTable.INSTANCE_LINK.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return InstanceLinkTable.INSTANCE_LINK.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return InstanceLinkTable.INSTANCE_LINK.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return InstanceLinkTable.INSTANCE_LINK.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field11() {
        return InstanceLinkTable.INSTANCE_LINK.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return InstanceLinkTable.INSTANCE_LINK.LINK_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return InstanceLinkTable.INSTANCE_LINK.INSTANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return InstanceLinkTable.INSTANCE_LINK.TARGET_INSTANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return InstanceLinkTable.INSTANCE_LINK.SERVICE_CONSUME_MAP_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value3() {
        return getAccountId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getKind();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getDescription();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value8() {
        return getCreated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value9() {
        return getRemoved();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Date value10() {
        return getRemoveTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Map<String,Object> value11() {
        return getData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value12() {
        return getLinkName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getTargetInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getServiceConsumeMapId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value9(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value10(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value11(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value12(String value) {
        setLinkName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value13(Long value) {
        setInstanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value14(Long value) {
        setTargetInstanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord value15(Long value) {
        setServiceConsumeMapId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public InstanceLinkRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Date value9, Date value10, Map<String,Object> value11, String value12, Long value13, Long value14, Long value15) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(InstanceLink from) {
        setId(from.getId());
        setName(from.getName());
        setAccountId(from.getAccountId());
        setKind(from.getKind());
        setUuid(from.getUuid());
        setDescription(from.getDescription());
        setState(from.getState());
        setCreated(from.getCreated());
        setRemoved(from.getRemoved());
        setRemoveTime(from.getRemoveTime());
        setData(from.getData());
        setLinkName(from.getLinkName());
        setInstanceId(from.getInstanceId());
        setTargetInstanceId(from.getTargetInstanceId());
        setServiceConsumeMapId(from.getServiceConsumeMapId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends InstanceLink> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached InstanceLinkRecord
     */
    public InstanceLinkRecord() {
        super(InstanceLinkTable.INSTANCE_LINK);
    }

    /**
     * Create a detached, initialised InstanceLinkRecord
     */
    public InstanceLinkRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, String linkName, Long instanceId, Long targetInstanceId, Long serviceConsumeMapId) {
        super(InstanceLinkTable.INSTANCE_LINK);

        set(0, id);
        set(1, name);
        set(2, accountId);
        set(3, kind);
        set(4, uuid);
        set(5, description);
        set(6, state);
        set(7, created);
        set(8, removed);
        set(9, removeTime);
        set(10, data);
        set(11, linkName);
        set(12, instanceId);
        set(13, targetInstanceId);
        set(14, serviceConsumeMapId);
    }
}