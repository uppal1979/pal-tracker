package io.pivotal.pal.tracker;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
<<<<<<< HEAD
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.databind.SerializationFeature;
=======
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> origin/master
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

@SpringBootApplication
public class PalTrackerApplication {

<<<<<<< HEAD
=======

>>>>>>> origin/master
    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

<<<<<<< HEAD
    @Bean
    public TimeEntryRepository timeEntryRepository() {
=======

    @Bean
    public InMemoryTimeEntryRepository timeEntryRepository (){
>>>>>>> origin/master
        return new InMemoryTimeEntryRepository();
    }

    @Bean
<<<<<<< HEAD
    public ObjectMapper jsonObjectMapper() {
=======
    public ObjectMapper jsonObjectMapper(){
>>>>>>> origin/master
        return Jackson2ObjectMapperBuilder.json()
                .serializationInclusion(JsonInclude.Include.NON_NULL) // Don’t include null values
                .featuresToDisable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS) //ISODate
                .modules(new JavaTimeModule())
                .build();
    }
<<<<<<< HEAD
}
=======
    }




>>>>>>> origin/master
