package org.project.openbaton.nubomedia.paas.model.persistence.security;

import org.openbaton.catalogue.nfvo.Quota;
import org.openbaton.catalogue.util.IdGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.PrePersist;

/**
 * Created by lto on 24/05/16.
 */
@Entity
public class Project {
    @Id
    private String id;
    @Column(unique = true)
    private String name;
    private Quota quota;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quota=" + quota +
                '}';
    }

    public Quota getQuota() {
        return quota;
    }

    public void setQuota(Quota quota) {
        this.quota = quota;
    }

    @PrePersist
    public void ensureId() {
        id = IdGenerator.createUUID();
    }

}
