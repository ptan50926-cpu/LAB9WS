package com.TAN.LAB9.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor 
@AllArgsConstructor 
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @NonNull tells Lombok to include this in the RequiredArgsConstructor
    @NonNull
    private String name;

    @NonNull
    private Double price;

    // Inverse side of Many-to-Many
    @ManyToMany(mappedBy = "products")
    @ToString.Exclude // Avoids infinite loop when printing
    private List<Invoice> invoices;
}
