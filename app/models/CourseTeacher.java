package models;

import io.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CourseTeacher extends Model {

    @Id
    private long id;

    private long courseId;

    private long teacherId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }
}
