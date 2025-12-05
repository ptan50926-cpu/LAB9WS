package com.TAN.LAB9.Entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    
    @NonNull
    private LocalDateTime transactionDate = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    @NonNull
    private Customer customer;

    @ManyToMany
    @JoinTable(
            name = "invoice_product_join",
            joinColumns = @JoinColumn(name = "invoice_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    @ToString.Exclude
    @NonNull
    private List<Product> products;
}