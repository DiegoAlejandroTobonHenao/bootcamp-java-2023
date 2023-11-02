package com.recommender.students.domain.entities;

import com.recommender.examresults.domain.entities.ExamResult;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Student {
    private String name;
    private String lastname;
    private String age;
    private String budget;
    private String document;
    private ExamResult result;

}
