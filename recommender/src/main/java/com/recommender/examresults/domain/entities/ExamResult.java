package com.recommender.examresults.domain.entities;

import com.recommender.examresults.domain.entities.vo.InformationCourse;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class ExamResult {
    private String documentStudent;
    private String date;
    private String institution;
    private List<InformationCourse> courses;
    private Double average;

}
