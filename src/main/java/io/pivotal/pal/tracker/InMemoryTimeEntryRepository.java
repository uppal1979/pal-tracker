package io.pivotal.pal.tracker;

import com.sun.scenario.animation.shared.TimerReceiver;

import java.sql.Time;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

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


    public static void main(String args[])
    {

        InMemoryTimeEntryRepository repo = new InMemoryTimeEntryRepository();
        TimeEntry created1 = repo.create(new TimeEntry(123L, 456L, LocalDate.parse("2017-01-08"), 8));
        TimeEntry created2 = repo.create(new TimeEntry(123L, 456L, LocalDate.parse("2017-01-08"), 8));
        TimeEntry created3 = repo.create(new TimeEntry(123L, 456L, LocalDate.parse("2017-01-08"), 8));

        System.out.println("list = " + repo.timeList);

        TimeEntry updatedEntry = repo.update(
                created2.getId(),
                new TimeEntry(321L, 654L, LocalDate.parse("2017-01-09"), 5));

        TimeEntry expected = new TimeEntry(created2.getId(), 321L, 654L, LocalDate.parse("2017-01-09"), 5);

        System.out.println("list = " + repo.timeList);


        //TimeEntry entry1 = new TimeEntry(1L, 123L, 456L, LocalDate.parse("2017-01-08"), 8);
        //repo.create(entry1);
        System.out.println("updatedEntry = " + updatedEntry);
        System.out.println("expected = " + expected);


    }
}
