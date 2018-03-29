package io.pivotal.pal.tracker;

<<<<<<< HEAD
//import com.sun.scenario.animation.shared.TimerReceiver;

//import java.sql.Time;
//import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//import java.util.ListIterator;

public class InMemoryTimeEntryRepository implements TimeEntryRepository {

    List<TimeEntry> timeList;


    public InMemoryTimeEntryRepository(){
        timeList = new ArrayList<TimeEntry>();
    }

    public TimeEntry create(TimeEntry e){

        System.out.println("InMemoryTimeEntryRepository  " + e.toString());
        e.setId(timeList.size()+1);

        timeList.add(e);
        return e;
    }

    public TimeEntry find(long id){
        TimeEntry temp = null;
        Iterator<TimeEntry> itr = timeList.iterator();
        while (itr.hasNext()) {
            TimeEntry element = itr.next();
            if(element.getId() == id) temp = element;
        }
        return temp;
    }

    public List<TimeEntry> list(){
        return timeList;
    }

    public TimeEntry update(long id, TimeEntry e){
        int i = 0;
        TimeEntry temp = null;
        Iterator<TimeEntry> itr = timeList.iterator();
        while (itr.hasNext()) {
            TimeEntry element = itr.next();

            if(element.getId() == id)
            {
                int k = timeList.indexOf(element);
                System.out.println(k);
                e.setId(id);
                timeList.set(k, e);
                break;
            }
            i++;
        }
        for(TimeEntry te : timeList) {
            if(te.getId() == id) temp =  te;

        }
        return temp;
    }

    public void delete(long id){

        int i = 0;
        TimeEntry temp = null;
        Iterator<TimeEntry> itr = timeList.iterator();
        while (itr.hasNext()) {
            TimeEntry element = itr.next();
            if(element.getId() == id)
            {
                timeList.remove(i);
                break;
            }
            i++;
        }
    }

=======
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


>>>>>>> origin/master
}
