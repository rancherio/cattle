/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.Service;
import io.cattle.platform.core.model.tables.ServiceTable;
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
import org.jooq.Record21;
import org.jooq.Row21;
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
@Table(name = "service", schema = "cattle")
public class ServiceRecord extends UpdatableRecordImpl<ServiceRecord> implements TableRecordJaxb, Record21<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, String, Long, String, String, String, Boolean, Long, Long, Long>, Service {

    private static final long serialVersionUID = 368176369;

    /**
     * Setter for <code>cattle.service.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.service.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.service.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.service.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.service.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.service.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.service.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.service.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.service.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.service.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.service.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.service.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.service.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.service.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.service.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.service.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.service.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.service.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.service.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.service.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>cattle.service.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.service.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(10);
    }

    /**
     * Setter for <code>cattle.service.environment_id</code>.
     */
    @Override
    public void setStackId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.service.environment_id</code>.
     */
    @Column(name = "environment_id", precision = 19)
    @Override
    public Long getStackId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>cattle.service.vip</code>.
     */
    @Override
    public void setVip(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.service.vip</code>.
     */
    @Column(name = "vip", length = 255)
    @Override
    public String getVip() {
        return (String) get(12);
    }

    /**
     * Setter for <code>cattle.service.create_index</code>.
     */
    @Override
    public void setCreateIndex(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.service.create_index</code>.
     */
    @Column(name = "create_index", precision = 19)
    @Override
    public Long getCreateIndex() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>cattle.service.selector</code>.
     */
    @Override
    public void setSelector(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>cattle.service.selector</code>.
     */
    @Column(name = "selector", length = 4096)
    @Override
    public String getSelector() {
        return (String) get(14);
    }

    /**
     * Setter for <code>cattle.service.external_id</code>.
     */
    @Override
    public void setExternalId(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>cattle.service.external_id</code>.
     */
    @Column(name = "external_id", length = 255)
    @Override
    public String getExternalId() {
        return (String) get(15);
    }

    /**
     * Setter for <code>cattle.service.health_state</code>.
     */
    @Override
    public void setHealthState(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>cattle.service.health_state</code>.
     */
    @Column(name = "health_state", length = 128)
    @Override
    public String getHealthState() {
        return (String) get(16);
    }

    /**
     * Setter for <code>cattle.service.system</code>.
     */
    @Override
    public void setSystem(Boolean value) {
        set(17, value);
    }

    /**
     * Getter for <code>cattle.service.system</code>.
     */
    @Column(name = "system", nullable = false, precision = 1)
    @Override
    public Boolean getSystem() {
        return (Boolean) get(17);
    }

    /**
     * Setter for <code>cattle.service.previous_revision_id</code>.
     */
    @Override
    public void setPreviousRevisionId(Long value) {
        set(18, value);
    }

    /**
     * Getter for <code>cattle.service.previous_revision_id</code>.
     */
    @Column(name = "previous_revision_id", precision = 19)
    @Override
    public Long getPreviousRevisionId() {
        return (Long) get(18);
    }

    /**
     * Setter for <code>cattle.service.revision_id</code>.
     */
    @Override
    public void setRevisionId(Long value) {
        set(19, value);
    }

    /**
     * Getter for <code>cattle.service.revision_id</code>.
     */
    @Column(name = "revision_id", precision = 19)
    @Override
    public Long getRevisionId() {
        return (Long) get(19);
    }

    /**
     * Setter for <code>cattle.service.revision</code>.
     */
    @Override
    public void setRevision(Long value) {
        set(20, value);
    }

    /**
     * Getter for <code>cattle.service.revision</code>.
     */
    @Column(name = "revision", nullable = false, precision = 19)
    @Override
    public Long getRevision() {
        return (Long) get(20);
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
    // Record21 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, String, Long, String, String, String, Boolean, Long, Long, Long> fieldsRow() {
        return (Row21) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row21<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, String, Long, String, String, String, Boolean, Long, Long, Long> valuesRow() {
        return (Row21) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ServiceTable.SERVICE.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ServiceTable.SERVICE.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ServiceTable.SERVICE.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ServiceTable.SERVICE.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ServiceTable.SERVICE.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ServiceTable.SERVICE.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ServiceTable.SERVICE.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return ServiceTable.SERVICE.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return ServiceTable.SERVICE.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return ServiceTable.SERVICE.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field11() {
        return ServiceTable.SERVICE.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return ServiceTable.SERVICE.STACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ServiceTable.SERVICE.VIP;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return ServiceTable.SERVICE.CREATE_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return ServiceTable.SERVICE.SELECTOR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ServiceTable.SERVICE.EXTERNAL_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return ServiceTable.SERVICE.HEALTH_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field18() {
        return ServiceTable.SERVICE.SYSTEM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field19() {
        return ServiceTable.SERVICE.PREVIOUS_REVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field20() {
        return ServiceTable.SERVICE.REVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field21() {
        return ServiceTable.SERVICE.REVISION;
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
    public Long value12() {
        return getStackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getVip();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getCreateIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getSelector();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getExternalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getHealthState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value18() {
        return getSystem();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value19() {
        return getPreviousRevisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value20() {
        return getRevisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value21() {
        return getRevision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value9(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value10(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value11(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value12(Long value) {
        setStackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value13(String value) {
        setVip(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value14(Long value) {
        setCreateIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value15(String value) {
        setSelector(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value16(String value) {
        setExternalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value17(String value) {
        setHealthState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value18(Boolean value) {
        setSystem(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value19(Long value) {
        setPreviousRevisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value20(Long value) {
        setRevisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord value21(Long value) {
        setRevision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Date value9, Date value10, Map<String,Object> value11, Long value12, String value13, Long value14, String value15, String value16, String value17, Boolean value18, Long value19, Long value20, Long value21) {
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
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(Service from) {
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
        setStackId(from.getStackId());
        setVip(from.getVip());
        setCreateIndex(from.getCreateIndex());
        setSelector(from.getSelector());
        setExternalId(from.getExternalId());
        setHealthState(from.getHealthState());
        setSystem(from.getSystem());
        setPreviousRevisionId(from.getPreviousRevisionId());
        setRevisionId(from.getRevisionId());
        setRevision(from.getRevision());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends Service> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceRecord
     */
    public ServiceRecord() {
        super(ServiceTable.SERVICE);
    }

    /**
     * Create a detached, initialised ServiceRecord
     */
    public ServiceRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, Long environmentId, String vip, Long createIndex, String selector, String externalId, String healthState, Boolean system, Long previousRevisionId, Long revisionId, Long revision) {
        super(ServiceTable.SERVICE);

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
        set(11, environmentId);
        set(12, vip);
        set(13, createIndex);
        set(14, selector);
        set(15, externalId);
        set(16, healthState);
        set(17, system);
        set(18, previousRevisionId);
        set(19, revisionId);
        set(20, revision);
    }
}