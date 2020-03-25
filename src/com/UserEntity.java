package com;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@javax.persistence.Table(name = "User", schema = "asset", catalog = "")
public class UserEntity {
    private String name;

    @Id
    @javax.persistence.Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private Date dateOfEntry;

    @Basic
    @javax.persistence.Column(name = "\r\nDate_of_entry")
    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }
}
