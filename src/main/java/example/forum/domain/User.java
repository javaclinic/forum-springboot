package example.forum.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 * User entity represents a user of the forum.
 *
 * @author nevenc
 *
 */
@Entity
@Table(name="forum_users")
public class User extends IdentifiableEntity {

    private static final long serialVersionUID = 1541297987409775718L;

    private String firstname;
    private String lastname;
    private String organization;
    private String title;
    private String email;
    private String password;
    private Date created;

    @Column(name="firstname", nullable=false, length=255)
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Column(name="lastname", nullable=false, length=255)
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Column(name="organization", length=255)
    public String getOrganization() {
        return organization;
    }
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @Column(name="title", length=255)
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name="email", nullable=false, length=255, unique=true)
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name="password", nullable=false, length=255)
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name="created", nullable=false, updatable=false)
    @Temporal(TemporalType.TIMESTAMP)
    public Date getCreated() {
        return created;
    }
    public void setCreated(Date created) {
        this.created = created;
    }

    @Transient
    public String getName() {
        return this.getFirstname() + " " + this.getLastname();
    }

    @Override
    public int hashCode() {
       return this.getEmail() == null ? System.identityHashCode(this) : 31 * this.getEmail().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if ( this.getName() == null ) return false;
        if ( object instanceof User ) {
            User other = (User) object;
            return this.getEmail().equals(other.getEmail());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
