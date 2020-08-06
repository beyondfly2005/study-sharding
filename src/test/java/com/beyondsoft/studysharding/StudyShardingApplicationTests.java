package com.beyondsoft.studysharding;

import com.beyondsoft.studysharding.entity.Course;
import com.beyondsoft.studysharding.mapper.CourseMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudyShardingApplicationTests {

    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void addCourse() {
        Course course = new Course();
        course.setCname("Java");
        course.setUserId(100L);
        course.setCstatus("Normal");
        courseMapper.insert(course);
    }

}
