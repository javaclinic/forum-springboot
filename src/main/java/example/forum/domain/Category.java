package example.forum.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Category entity represents a category of the forum.
 *
 * @author nevenc
 *
 */
@Entity
@Table(name="forum_categories")
public class Category extends IdentifiableEntity {

    private static final long serialVersionUID = 7472543610178653487L;

    private String name;

    private String description;

    @Column(name="name", nullable=false, length=255, unique=true)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name="description", length=255)
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int hashCode() {
       return this.getName() == null ? System.identityHashCode(this) : 31 * this.getName().hashCode();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if ( this.getName() == null ) return false;
        if ( object instanceof Category ) {
            Category other = (Category) object;
            return this.getName().equals(other.getName());
        }
        return false;
    }

    @Override
    public String toString() {
        return this.getName();
    }

}
