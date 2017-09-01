/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model.tables.records;


import io.cattle.platform.core.model.DeploymentUnit;
import io.cattle.platform.core.model.tables.DeploymentUnitTable;
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
import org.jooq.Record19;
import org.jooq.Row19;
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
@Table(name = "deployment_unit", schema = "cattle")
public class DeploymentUnitRecord extends UpdatableRecordImpl<DeploymentUnitRecord> implements TableRecordJaxb, Record19<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, Long, Long, Long, Long, Long, String>, DeploymentUnit {

    private static final long serialVersionUID = 367416981;

    /**
     * Setter for <code>cattle.deployment_unit.id</code>.
     */
    @Override
    public void setId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public Long getId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>cattle.deployment_unit.name</code>.
     */
    @Override
    public void setName(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.name</code>.
     */
    @Column(name = "name", length = 255)
    @Override
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cattle.deployment_unit.account_id</code>.
     */
    @Override
    public void setAccountId(Long value) {
        set(2, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.account_id</code>.
     */
    @Column(name = "account_id", precision = 19)
    @Override
    public Long getAccountId() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>cattle.deployment_unit.kind</code>.
     */
    @Override
    public void setKind(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.kind</code>.
     */
    @Column(name = "kind", nullable = false, length = 255)
    @Override
    public String getKind() {
        return (String) get(3);
    }

    /**
     * Setter for <code>cattle.deployment_unit.uuid</code>.
     */
    @Override
    public void setUuid(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.uuid</code>.
     */
    @Column(name = "uuid", unique = true, nullable = false, length = 128)
    @Override
    public String getUuid() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cattle.deployment_unit.description</code>.
     */
    @Override
    public void setDescription(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.description</code>.
     */
    @Column(name = "description", length = 1024)
    @Override
    public String getDescription() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cattle.deployment_unit.state</code>.
     */
    @Override
    public void setState(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.state</code>.
     */
    @Column(name = "state", nullable = false, length = 128)
    @Override
    public String getState() {
        return (String) get(6);
    }

    /**
     * Setter for <code>cattle.deployment_unit.created</code>.
     */
    @Override
    public void setCreated(Date value) {
        set(7, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.created</code>.
     */
    @Column(name = "created")
    @Override
    public Date getCreated() {
        return (Date) get(7);
    }

    /**
     * Setter for <code>cattle.deployment_unit.removed</code>.
     */
    @Override
    public void setRemoved(Date value) {
        set(8, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.removed</code>.
     */
    @Column(name = "removed")
    @Override
    public Date getRemoved() {
        return (Date) get(8);
    }

    /**
     * Setter for <code>cattle.deployment_unit.remove_time</code>.
     */
    @Override
    public void setRemoveTime(Date value) {
        set(9, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.remove_time</code>.
     */
    @Column(name = "remove_time")
    @Override
    public Date getRemoveTime() {
        return (Date) get(9);
    }

    /**
     * Setter for <code>cattle.deployment_unit.data</code>.
     */
    @Override
    public void setData(Map<String,Object> value) {
        set(10, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.data</code>.
     */
    @Column(name = "data", length = 65535)
    @Override
    public Map<String,Object> getData() {
        return (Map<String,Object>) get(10);
    }

    /**
     * Setter for <code>cattle.deployment_unit.service_index</code>.
     */
    @Override
    public void setServiceIndex(String value) {
        set(11, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.service_index</code>.
     */
    @Column(name = "service_index", length = 255)
    @Override
    public String getServiceIndex() {
        return (String) get(11);
    }

    /**
     * Setter for <code>cattle.deployment_unit.service_id</code>.
     */
    @Override
    public void setServiceId(Long value) {
        set(12, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.service_id</code>.
     */
    @Column(name = "service_id", precision = 19)
    @Override
    public Long getServiceId() {
        return (Long) get(12);
    }

    /**
     * Setter for <code>cattle.deployment_unit.environment_id</code>.
     */
    @Override
    public void setStackId(Long value) {
        set(13, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.environment_id</code>.
     */
    @Column(name = "environment_id", nullable = false, precision = 19)
    @Override
    public Long getStackId() {
        return (Long) get(13);
    }

    /**
     * Setter for <code>cattle.deployment_unit.host_id</code>.
     */
    @Override
    public void setHostId(Long value) {
        set(14, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.host_id</code>.
     */
    @Column(name = "host_id", precision = 19)
    @Override
    public Long getHostId() {
        return (Long) get(14);
    }

    /**
     * Setter for <code>cattle.deployment_unit.requested_revision_id</code>.
     */
    @Override
    public void setRequestedRevisionId(Long value) {
        set(15, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.requested_revision_id</code>.
     */
    @Column(name = "requested_revision_id", precision = 19)
    @Override
    public Long getRequestedRevisionId() {
        return (Long) get(15);
    }

    /**
     * Setter for <code>cattle.deployment_unit.revision_id</code>.
     */
    @Override
    public void setRevisionId(Long value) {
        set(16, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.revision_id</code>.
     */
    @Column(name = "revision_id", precision = 19)
    @Override
    public Long getRevisionId() {
        return (Long) get(16);
    }

    /**
     * Setter for <code>cattle.deployment_unit.cluster_id</code>.
     */
    @Override
    public void setClusterId(Long value) {
        set(17, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.cluster_id</code>.
     */
    @Column(name = "cluster_id", precision = 19)
    @Override
    public Long getClusterId() {
        return (Long) get(17);
    }

    /**
     * Setter for <code>cattle.deployment_unit.external_id</code>.
     */
    @Override
    public void setExternalId(String value) {
        set(18, value);
    }

    /**
     * Getter for <code>cattle.deployment_unit.external_id</code>.
     */
    @Column(name = "external_id", length = 255)
    @Override
    public String getExternalId() {
        return (String) get(18);
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
    // Record19 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, Long, Long, Long, Long, Long, String> fieldsRow() {
        return (Row19) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row19<Long, String, Long, String, String, String, String, Date, Date, Date, Map<String,Object>, String, Long, Long, Long, Long, Long, Long, String> valuesRow() {
        return (Row19) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field3() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.ACCOUNT_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.KIND;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.UUID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.DESCRIPTION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field8() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.CREATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field9() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.REMOVED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Date> field10() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.REMOVE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Map<String,Object>> field11() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field12() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.SERVICE_INDEX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field13() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.SERVICE_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field14() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.STACK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field15() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.HOST_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field16() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.REQUESTED_REVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field17() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.REVISION_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field18() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.CLUSTER_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field19() {
        return DeploymentUnitTable.DEPLOYMENT_UNIT.EXTERNAL_ID;
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
        return getServiceIndex();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value13() {
        return getServiceId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value14() {
        return getStackId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value15() {
        return getHostId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value16() {
        return getRequestedRevisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value17() {
        return getRevisionId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value18() {
        return getClusterId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value19() {
        return getExternalId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value1(Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value2(String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value3(Long value) {
        setAccountId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value4(String value) {
        setKind(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value5(String value) {
        setUuid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value6(String value) {
        setDescription(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value7(String value) {
        setState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value8(Date value) {
        setCreated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value9(Date value) {
        setRemoved(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value10(Date value) {
        setRemoveTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value11(Map<String,Object> value) {
        setData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value12(String value) {
        setServiceIndex(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value13(Long value) {
        setServiceId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value14(Long value) {
        setStackId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value15(Long value) {
        setHostId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value16(Long value) {
        setRequestedRevisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value17(Long value) {
        setRevisionId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value18(Long value) {
        setClusterId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord value19(String value) {
        setExternalId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public DeploymentUnitRecord values(Long value1, String value2, Long value3, String value4, String value5, String value6, String value7, Date value8, Date value9, Date value10, Map<String,Object> value11, String value12, Long value13, Long value14, Long value15, Long value16, Long value17, Long value18, String value19) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(DeploymentUnit from) {
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
        setServiceIndex(from.getServiceIndex());
        setServiceId(from.getServiceId());
        setStackId(from.getStackId());
        setHostId(from.getHostId());
        setRequestedRevisionId(from.getRequestedRevisionId());
        setRevisionId(from.getRevisionId());
        setClusterId(from.getClusterId());
        setExternalId(from.getExternalId());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends DeploymentUnit> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached DeploymentUnitRecord
     */
    public DeploymentUnitRecord() {
        super(DeploymentUnitTable.DEPLOYMENT_UNIT);
    }

    /**
     * Create a detached, initialised DeploymentUnitRecord
     */
    public DeploymentUnitRecord(Long id, String name, Long accountId, String kind, String uuid, String description, String state, Date created, Date removed, Date removeTime, Map<String,Object> data, String serviceIndex, Long serviceId, Long environmentId, Long hostId, Long requestedRevisionId, Long revisionId, Long clusterId, String externalId) {
        super(DeploymentUnitTable.DEPLOYMENT_UNIT);

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
        set(11, serviceIndex);
        set(12, serviceId);
        set(13, environmentId);
        set(14, hostId);
        set(15, requestedRevisionId);
        set(16, revisionId);
        set(17, clusterId);
        set(18, externalId);
    }
}
