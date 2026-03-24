/*
Subject factory test
Author: Wendy Bayise - 222828978
Date: 24/03/2026
 */
package za.ac.cput.factory;

import org.junit.jupiter.api.*;
import za.ac.cput.domain.Subject;
import static org.junit.jupiter.api.Assertions.*;

class SubjectFactoryTest {

    @Test
    void createSubject() {
        Subject subject= SubjectFactory.createSubject("APD","Application Development Practice",
                "Programming Module","3rd Year");
        assertNotNull(subject);
        System.out.println(subject);
    }
}