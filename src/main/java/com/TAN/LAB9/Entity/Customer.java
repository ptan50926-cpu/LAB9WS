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
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    // One Customer has Many Invoices
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Invoice> invoices;
}
