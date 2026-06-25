package za.ac.cput.service;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Booking;
import za.ac.cput.domain.Student;
import za.ac.cput.factory.BookingFactory;
import za.ac.cput.factory.StudentFactory;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


@SpringBootTest
@TestMethodOrder(MethodOrderer.MethodName.class)    //Alphanumeric
class StudentServiceTest {
    @Autowired
    private StudentService studentService;

    private Booking booking = BookingFactory.createBooking(
            "B12345",
            "222056401",
            "ADP362S",
            "Online",
            "2 hours",
            "T987654",
            LocalDateTime.of(2026, 5, 20, 10, 30)
    );

    private List<Booking> bookings = List.of(booking);

    private Student student = StudentFactory.createStudent("220094489","Sabelo",
            "Ceza","220094489@mycput.ac.za","073 985 1110",
            "SabieCeza2026","Third year", bookings);
    @Test
    void create() {
    }

    @Test
    void read() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }

    @Test
    void getAll() {
    }
}