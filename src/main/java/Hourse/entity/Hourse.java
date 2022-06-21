package Hourse.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "hourse")
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder

public class Hourse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "type")
    private String type;

    @Column(name = "age")
    private Integer age;


    @Column(name = "price")
    private Integer price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this)
                != Hibernate.getClass(o)) return false;
        Hourse hourse = (Hourse) o;
        return id != null && Objects.equals(id, hourse.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
