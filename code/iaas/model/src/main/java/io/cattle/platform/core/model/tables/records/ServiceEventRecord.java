/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.ServiceEvent;
import io.cattle.platform.core.model.tables.ServiceEventTable;
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
import org.jooq.Record17;
import org.jooq.Row17;
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
@Table(name = "service_event", schema = "cattle")
public class ServiceEventRecord extends UpdatableRecordImpl<ServiceEventRecord> implements TableRecordJaxb, Record17<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, String, Long, Long, String, Integer>, ServiceEvent {

    private static final long serialVersionUID = 388269211;

    /**
     * Setter for <code>cattle.service_event.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.service_event.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.service_event.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.service_event.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.service_event.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.service_event.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.service_event.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.service_event.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.service_event.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.service_event.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.service_event.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.service_event.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.service_event.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.service_event.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.service_event.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.service_event.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.service_event.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.service_event.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.service_event.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.service_event.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>cattle.service_event.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.service_event.data</code>.
     */
    @Column(name = "data", length = 16777215)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(10);
    }

    /**
     * Setter for <code>cattle.service_event.host_id</code>.
     */
    @Override
    public void setHostId(Long value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.service_event.host_id</code>.
     */
    @Column(name = "host_id", precision = 19)
    @Override
    public Long getHostId() {
        return (Long) get(11);
    }

    /**
     * Setter for <code>cattle.service_event.healthcheck_uuid</code>.
     */
    @Override
    public void setHealthcheckUuid(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.service_event.healthcheck_uuid</code>.
     */
    @Column(name = "healthcheck_uuid", length = 255)
    @Override
    public String getHealthcheckUuid() {
        return (String) get(12);
    }

    /**
     * Setter for <code>cattle.service_event.instance_id</code>.
     */
    @Override
    public void setInstanceId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.service_event.instance_id</code>.
     */
    @Column(name = "instance_id", precision = 19)
    @Override
    public Long getInstanceId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>cattle.service_event.healthcheck_instance_id</code>.
     */
    @Override
    public void setHealthcheckInstanceId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>cattle.service_event.healthcheck_instance_id</code>.
     */
    @Column(name = "healthcheck_instance_id", precision = 19)
    @Override
    public Long getHealthcheckInstanceId() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>cattle.service_event.reported_health</code>.
     */
    @Override
    public void setReportedHealth(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>cattle.service_event.reported_health</code>.
     */
    @Column(name = "reported_health", length = 255)
    @Override
    public String getReportedHealth() {
        return (String) get(15);
    }

    /**
     * Setter for <code>cattle.service_event.external_timestamp</code>.
     */
    @Override
    public void setExternalTimestamp(Integer value) {
        set(16, value);
    }

    /**
     * Getter for <code>cattle.service_event.external_timestamp</code>.
     */
    @Column(name = "external_timestamp", precision = 10)
    @Override
    public Integer getExternalTimestamp() {
        return (Integer) get(16);
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
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, String, Long, Long, String, Integer> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, Long, String, Long, Long, String, Integer> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return ServiceEventTable.SERVICE_EVENT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return ServiceEventTable.SERVICE_EVENT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return ServiceEventTable.SERVICE_EVENT.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return ServiceEventTable.SERVICE_EVENT.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return ServiceEventTable.SERVICE_EVENT.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return ServiceEventTable.SERVICE_EVENT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return ServiceEventTable.SERVICE_EVENT.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return ServiceEventTable.SERVICE_EVENT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return ServiceEventTable.SERVICE_EVENT.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return ServiceEventTable.SERVICE_EVENT.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field11() {
        return ServiceEventTable.SERVICE_EVENT.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field12() {
        return ServiceEventTable.SERVICE_EVENT.HOST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return ServiceEventTable.SERVICE_EVENT.HEALTHCHECK_UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return ServiceEventTable.SERVICE_EVENT.INSTANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return ServiceEventTable.SERVICE_EVENT.HEALTHCHECK_INSTANCE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return ServiceEventTable.SERVICE_EVENT.REPORTED_HEALTH;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field17() {
        return ServiceEventTable.SERVICE_EVENT.EXTERNAL_TIMESTAMP;
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
        return getHostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getHealthcheckUuid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getHealthcheckInstanceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getReportedHealth();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value17() {
        return getExternalTimestamp();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value9(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value10(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value11(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value12(Long value) {
        setHostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value13(String value) {
        setHealthcheckUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value14(Long value) {
        setInstanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value15(Long value) {
        setHealthcheckInstanceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value16(String value) {
        setReportedHealth(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord value17(Integer value) {
        setExternalTimestamp(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public ServiceEventRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Date value9, Date value10, Map<String,Object> value11, Long value12, String value13, Long value14, Long value15, String value16, Integer value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ServiceEvent from) {
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
        setHostId(from.getHostId());
        setHealthcheckUuid(from.getHealthcheckUuid());
        setInstanceId(from.getInstanceId());
        setHealthcheckInstanceId(from.getHealthcheckInstanceId());
        setReportedHealth(from.getReportedHealth());
        setExternalTimestamp(from.getExternalTimestamp());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ServiceEvent> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ServiceEventRecord
     */
    public ServiceEventRecord() {
        super(ServiceEventTable.SERVICE_EVENT);
    }

    /**
     * Create a detached, initialised ServiceEventRecord
     */
    public ServiceEventRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, Long hostId, String healthcheckUuid, Long instanceId, Long healthcheckInstanceId, String reportedHealth, Integer externalTimestamp) {
        super(ServiceEventTable.SERVICE_EVENT);

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
        set(11, hostId);
        set(12, healthcheckUuid);
        set(13, instanceId);
        set(14, healthcheckInstanceId);
        set(15, reportedHealth);
        set(16, externalTimestamp);
    }
}