package io.pivotal.pal.tracker;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
public class TimeEntryController {

    private TimeEntryRepository timeEntryRepository;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }

    @RequestMapping
    public ResponseEntity create(TimeEntry timeEntryToCreate) {

        TimeEntry timeEntry = timeEntryRepository.create(timeEntryToCreate);

        return new ResponseEntity(timeEntry, HttpStatus.OK);
    }

    public ResponseEntity<TimeEntry> read(long l) {

        TimeEntry timeEntry = timeEntryRepository.find(l);

        return new ResponseEntity(timeEntry, HttpStatus.OK);

    }

    public ResponseEntity<List<TimeEntry>> list() {
        List<TimeEntry> timeEntryList = timeEntryRepository.list();

        return new ResponseEntity(timeEntryList, HttpStatus.OK);
    }

    public ResponseEntity update(long l, TimeEntry expected) {

        TimeEntry timeEntry = timeEntryRepository.update(l, expected);

        return new ResponseEntity(timeEntry, HttpStatus.OK);

    }

    public ResponseEntity  delete(long l) {
        TimeEntry timeEntry = timeEntryRepository.delete(l);
        return new ResponseEntity(timeEntry, HttpStatus.OK);

    }

 }
