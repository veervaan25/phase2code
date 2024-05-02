package com.caching.caching.demo.using.caffeine.persistence;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "relations_codes")
public class Relations {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String relationId;
    @Column(name = "relationTypeCode",columnDefinition = "varchar(22)")
    private String relation_code;
}
