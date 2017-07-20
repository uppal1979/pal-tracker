package io.pivotal.pal.tracker;

import java.util.List;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    public TimeEntry create(TimeEntry timeEntry) {
        return timeEntry;
    }

    public TimeEntry find(long id) {
        return null;
    }


    public List<TimeEntry> list() {
        return null;
    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        return timeEntry;
    }


    public TimeEntry  delete(long id) {
        return null;
    }
}
