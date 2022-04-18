package com.meli.obterdiploma.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter @Setter
public class StudentDTO {

    @NotBlank
    String studentName;
    String message;
    Double averageScore;
    List<SubjectDTO> subjects;
}
