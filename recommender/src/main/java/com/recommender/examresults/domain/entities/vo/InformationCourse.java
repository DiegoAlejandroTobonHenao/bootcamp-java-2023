package com.recommender.examresults.domain.entities.vo;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class InformationCourse {
    private String nameCourse;
    private Double percent;
}
