/**
 * This class is generated by jOOQ
 */
package io.cattle.platform.core.model.tables.records;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value = { "http://www.jooq.org", "3.3.0" }, comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
@javax.persistence.Entity
@javax.persistence.Table(name = "task", schema = "cattle")
public class TaskRecord extends org.jooq.impl.UpdatableRecordImpl<io.cattle.platform.core.model.tables.records.TaskRecord> implements
        io.cattle.platform.db.jooq.utils.TableRecordJaxb, org.jooq.Record2<java.lang.Long, java.lang.String>, io.cattle.platform.core.model.Task {

    private static final long serialVersionUID = 1655582833;

    /**
     * Setter for <code>cattle.task.id</code>.
     */
    @Override
    public void setId(java.lang.Long value) {
        setValue(0, value);
    }

    /**
     * Getter for <code>cattle.task.id</code>.
     */
    @javax.persistence.Id
    @javax.persistence.Column(name = "id", unique = true, nullable = false, precision = 19)
    @Override
    public java.lang.Long getId() {
        return (java.lang.Long) getValue(0);
    }

    /**
     * Setter for <code>cattle.task.name</code>.
     */
    @Override
    public void setName(java.lang.String value) {
        setValue(1, value);
    }

    /**
     * Getter for <code>cattle.task.name</code>.
     */
    @javax.persistence.Column(name = "name", unique = true, nullable = false, length = 128)
    @Override
    public java.lang.String getName() {
        return (java.lang.String) getValue(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Record1<java.lang.Long> key() {
        return (org.jooq.Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.Long, java.lang.String> fieldsRow() {
        return (org.jooq.Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Row2<java.lang.Long, java.lang.String> valuesRow() {
        return (org.jooq.Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.Long> field1() {
        return io.cattle.platform.core.model.tables.TaskTable.TASK.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public org.jooq.Field<java.lang.String> field2() {
        return io.cattle.platform.core.model.tables.TaskTable.TASK.NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.Long value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public java.lang.String value2() {
        return getName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskRecord value1(java.lang.Long value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskRecord value2(java.lang.String value) {
        setName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TaskRecord values(java.lang.Long value1, java.lang.String value2) {
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(io.cattle.platform.core.model.Task from) {
        setId(from.getId());
        setName(from.getName());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends io.cattle.platform.core.model.Task> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TaskRecord
     */
    public TaskRecord() {
        super(io.cattle.platform.core.model.tables.TaskTable.TASK);
    }

    /**
     * Create a detached, initialised TaskRecord
     */
    public TaskRecord(java.lang.Long id, java.lang.String name) {
        super(io.cattle.platform.core.model.tables.TaskTable.TASK);

        setValue(0, id);
        setValue(1, name);
    }
}
