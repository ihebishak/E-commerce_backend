package com.project.ecommerce.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name="category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;

    @Column(name="category_name")
    private String categoryName;

    @OneToMany(mappedBy = "category",fetch = FetchType.LAZY)
    private Collection<Product> products;


}
