package com.bilalkose;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//Data Transfer Object => DTO . objeler arasında veri taşıma
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StudentDTO {
    private Long studentId;
    private String studentName;
    private String studentSurname;
}
