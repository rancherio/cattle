/*
 * This file is generated by jOOQ.
*/
package io.cattle.platform.core.model;


import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


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
@Table(name = "task_instance", schema = "cattle")
public interface TaskInstance extends Serializable {

    /**
     * Setter for <code>cattle.task_instance.id</code>.
     */
    public void setId(Long value);

    /**
     * Getter for <code>cattle.task_instance.id</code>.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false, precision = 19)
    public Long getId();

    /**
     * Setter for <code>cattle.task_instance.name</code>.
     */
    public void setName(String value);

    /**
     * Getter for <code>cattle.task_instance.name</code>.
     */
    @Column(name = "name", nullable = false, length = 128)
    public String getName();

    /**
     * Setter for <code>cattle.task_instance.task_id</code>.
     */
    public void setTaskId(Long value);

    /**
     * Getter for <code>cattle.task_instance.task_id</code>.
     */
    @Column(name = "task_id", nullable = false, precision = 19)
    public Long getTaskId();

    /**
     * Setter for <code>cattle.task_instance.start_time</code>.
     */
    public void setStartTime(Date value);

    /**
     * Getter for <code>cattle.task_instance.start_time</code>.
     */
    @Column(name = "start_time", nullable = false)
    public Date getStartTime();

    /**
     * Setter for <code>cattle.task_instance.end_time</code>.
     */
    public void setEndTime(Date value);

    /**
     * Getter for <code>cattle.task_instance.end_time</code>.
     */
    @Column(name = "end_time")
    public Date getEndTime();

    /**
     * Setter for <code>cattle.task_instance.exception</code>.
     */
    public void setException(String value);

    /**
     * Getter for <code>cattle.task_instance.exception</code>.
     */
    @Column(name = "exception", length = 255)
    public String getException();

    /**
     * Setter for <code>cattle.task_instance.server_id</code>.
     */
    public void setServerId(String value);

    /**
     * Getter for <code>cattle.task_instance.server_id</code>.
     */
    @Column(name = "server_id", nullable = false, length = 128)
    public String getServerId();

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * Load data from another generated Record/POJO implementing the common interface TaskInstance
     */
    public void from(io.cattle.platform.core.model.TaskInstance from);

    /**
     * Copy data into another generated Record/POJO implementing the common interface TaskInstance
     */
    public <E extends io.cattle.platform.core.model.TaskInstance> E into(E into);
}