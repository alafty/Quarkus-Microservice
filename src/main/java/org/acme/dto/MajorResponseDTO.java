package org.acme.dto;

import org.acme.enumerator.Department;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MajorResponseDTO {
    private String name;
    private String description;
    private int creditsRequired;
    private Department department;
}