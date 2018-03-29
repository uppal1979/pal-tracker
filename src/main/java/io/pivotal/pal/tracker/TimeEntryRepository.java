package io.pivotal.pal.tracker;

<<<<<<< HEAD
import java.util.List;

public interface TimeEntryRepository {
    public TimeEntry create(TimeEntry e);

    public TimeEntry find(long id);

    public List<TimeEntry> list();

    public TimeEntry update(long id, TimeEntry e);

    public void delete(long id);

=======
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeEntryRepository {
    
    public TimeEntry create(TimeEntry any);

    public TimeEntry find(long l);

    public List<TimeEntry> list();

    public TimeEntry update(long eq, TimeEntry any);

    public TimeEntry delete(long l);
>>>>>>> origin/master
}
