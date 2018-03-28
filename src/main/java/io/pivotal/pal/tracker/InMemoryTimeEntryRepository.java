package io.pivotal.pal.tracker;

import java.util.*;

public class InMemoryTimeEntryRepository implements TimeEntryRepository{

    private long id =  1;
    private Map<Long, TimeEntry> data = new HashMap();

    public TimeEntry create(TimeEntry timeEntry){
        timeEntry.setId(id++);
        data.put(timeEntry.getId(), timeEntry);
        return timeEntry;
    }

    public TimeEntry find(long id) {
        return data.get(id);
    }


    public List<TimeEntry> list() {
        List<TimeEntry> dataList = new ArrayList();
        Collection<TimeEntry> collection = data.values();
        dataList.addAll(collection);
        return dataList;

    }

    public TimeEntry update(long id, TimeEntry timeEntry) {
        timeEntry.setId(id);
        data.put(id, timeEntry);
        return data.get(id);


    }


    public TimeEntry  delete(long id) {
       TimeEntry timeEntry =  data.remove(id);
       return timeEntry;
    }


}
