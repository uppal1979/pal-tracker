package io.pivotal.pal.tracker;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ResponseBody
public class TimeEntryController {

    private TimeEntryRepository timeEntryRepository;

    @Autowired
    private ObjectMapper objectMapper;

    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
        this.timeEntryRepository = timeEntryRepository;
    }

    @PostMapping("/time-entries")
    public ResponseEntity create(@RequestBody TimeEntry timeEntryToCreate) {
        //timeEntryToCreate.setDate(objectMapper.);
        //System.out.println(timeEntryToCreate.getDate());
        TimeEntry timeEntry = timeEntryRepository.create(timeEntryToCreate);

        return new ResponseEntity(timeEntry, HttpStatus.CREATED);
    }

    @GetMapping("/time-entries/{id}")
    public ResponseEntity<TimeEntry> read(@PathVariable long id) {

        TimeEntry timeEntry = timeEntryRepository.find(id);

        if (timeEntry == null) {
            return new ResponseEntity(timeEntry, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(timeEntry, HttpStatus.OK);

    }

    @GetMapping ("/time-entries")
    public ResponseEntity<List<TimeEntry>> list() {
        List<TimeEntry> timeEntryList = timeEntryRepository.list();

        return new ResponseEntity(timeEntryList, HttpStatus.OK);
    }

    @PutMapping("/time-entries/{id}")
    public ResponseEntity update(@PathVariable long id, @RequestBody TimeEntry expected) {

        TimeEntry timeEntry = timeEntryRepository.update(id, expected);

        if (timeEntry==null){
            return new ResponseEntity(timeEntry, HttpStatus.NOT_FOUND);
        }

            return new ResponseEntity(timeEntry, HttpStatus.OK);


    }

    @DeleteMapping("/time-entries/{id}")
    public ResponseEntity  delete(@PathVariable long id) {
        TimeEntry timeEntry = timeEntryRepository.delete(id);

        if (timeEntry==null){
            return new ResponseEntity(timeEntry, HttpStatus.NO_CONTENT);
        }


        return new ResponseEntity(timeEntry, HttpStatus.NO_CONTENT);

    }

 }
