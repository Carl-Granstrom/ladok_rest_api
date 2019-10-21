package ltu.integration.demo.domain;


import javax.persistence.*;
import java.util.List;

public class CourseResult {

    @Id
    @GeneratedValue
    @Column(name = "course_result_id", updatable = false, nullable = false)
    private Long id;

    @OneToMany
    private List<TestResult> testResults;
}
