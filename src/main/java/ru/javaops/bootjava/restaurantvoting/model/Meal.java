package ru.javaops.bootjava.restaurantvoting.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "meals")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Meal extends BaseEntity {

    @Column(name = "name", nullable = false)
    @NotBlank
    @Size(min = 5, max = 100)
    private String name;

    @NotNull
    @DecimalMin("0.01")
    @Column(name = "price", nullable = false)
    private float price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "menu_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @NotNull
    @JsonIgnore
    private Menu menu;

    @Override
    public Integer getId() {
        return null;
    }
}