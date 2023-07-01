package com.geekster.universityeventmanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Validated
@Entity
public class Student {
    @Id
    private Long studentId;

    @NotBlank(message = "First name is required")
    @Pattern(regexp = "^[A-Z].*", message = "First name should start with a capital letter")
    private String firstName;

    @NotBlank(message = "Last name is required")
    @Pattern(regexp = "^[A-Z].*", message = "Last name should start with a capital letter")
    private String lastName;

    @NotNull(message = "Age is required")
    @Min(value = 18, message = "Age should be at least 18")
    @Max(value = 25, message = "Age should not exceed 25")
    private Integer age;

    @NotNull(message = "Department is required")
    @Enumerated(EnumType.STRING)
    private Department department;
}
