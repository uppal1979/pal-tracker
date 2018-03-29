package io.pivotal.pal.tracker;

import java.time.LocalDate;
<<<<<<< HEAD
import java.util.Objects;

public class TimeEntry {
=======

public class TimeEntry{
>>>>>>> origin/master

    private long id;
    private long projectId;
    private long userId;
    private LocalDate date;
    private int hours;

<<<<<<< HEAD
    public TimeEntry(){}
    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
=======
    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {

        this.id = id;
>>>>>>> origin/master
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

<<<<<<< HEAD
    public TimeEntry(long id, long projectId, long userId, LocalDate date, int hours) {
        this.id = id;
=======
    public TimeEntry(long projectId, long userId, LocalDate date, int hours) {
>>>>>>> origin/master
        this.projectId = projectId;
        this.userId = userId;
        this.date = date;
        this.hours = hours;
    }

<<<<<<< HEAD
=======
    public TimeEntry() {

    }

>>>>>>> origin/master
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

<<<<<<< HEAD
=======
    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
    }

>>>>>>> origin/master
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

<<<<<<< HEAD
    public long getProjectId() {
        return projectId;
    }

    public void setProjectId(long projectId) {
        this.projectId = projectId;
=======
    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
>>>>>>> origin/master
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
<<<<<<< HEAD
        TimeEntry timeEntry = (TimeEntry) o;
        return id == timeEntry.id &&
                projectId == timeEntry.projectId &&
                userId == timeEntry.userId &&
                hours == timeEntry.hours &&
                Objects.equals(date, timeEntry.date);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, projectId, userId, date, hours);
    }

    @Override
    public String toString() {
        return "TimeEntry{" +
                "id=" + id +
                ", projectId=" + projectId +
                ", userId=" + userId +
                ", date=" + date +
                ", hours=" + hours +
                '}';
    }

=======

        TimeEntry timeEntry = (TimeEntry) o;

        if (id != timeEntry.id) return false;
        if (projectId != timeEntry.projectId) return false;
        if (userId != timeEntry.userId) return false;
        if (hours != timeEntry.hours) return false;
        return date != null ? date.equals(timeEntry.date) : timeEntry.date == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (int) (projectId ^ (projectId >>> 32));
        result = 31 * result + (int) (userId ^ (userId >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + hours;
        return result;
    }
>>>>>>> origin/master
}
