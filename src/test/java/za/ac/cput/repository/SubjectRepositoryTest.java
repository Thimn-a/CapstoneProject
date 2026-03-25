/*
Subject repository testing
Author: Wendy Bayise - 222828978
Date: 24/03/2026
 */

package za.ac.cput.repository;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Subject;
import za.ac.cput.factory.SubjectFactory;
import static org.junit.jupiter.api.Assertions.*;


//AlphanumericOrder
@TestMethodOrder(MethodOrderer.MethodName.class)
class SubjectRepositoryTest {

    private static ISubjectRepository repository = SubjectRepository.getRepository();
    Subject subject = SubjectFactory.createSubject("APD", "Application Development Practice",
            "Programming Module", "3rd Year");

    @Test
    void a_create() {
        Subject created = repository.create(subject);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Subject read = repository.read(subject.getSubjectCode());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Subject newRecord = new Subject.Builder()
                .copy(subject)
                .setSubjectName("ISA")
                .setSubjectDescription("Information System ")
                .setGradeLevel("4th year")
                .build();

        Subject updated = repository.update(newRecord);
        assertNotNull(updated);
        System.out.println(updated);
    }

    @Test
    @Disabled
    void d_delete() {
        assertTrue(repository.delete(subject.getSubjectCode()));
        System.out.println("This Subject has been deleted");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}