package com.caching.caching.demo.using.caffeine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.N;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RelationDto {
    private List<String> relationCodes;
}
