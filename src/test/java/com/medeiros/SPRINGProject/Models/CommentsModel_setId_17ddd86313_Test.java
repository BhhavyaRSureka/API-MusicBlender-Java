// Test generated by RoostGPT for test JavaTest using AI Type Open AI and AI Model gpt-4

package com.medeiros.SPRINGProject.Models;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class CommentsModel_setId_17ddd86313_Test {

    private CommentsModel commentsModel;

    @BeforeEach
    public void setup() {
        commentsModel = new CommentsModel();
    }

    @Test
    public void testSetId_Positive() {
        int expectedId = 123;
        commentsModel.setId(expectedId);
        int actualId = commentsModel.getId();
        assertEquals(expectedId, actualId, "The id should match the set value");
    }

    @Test
    public void testSetId_Zero() {
        int expectedId = 0;
        commentsModel.setId(expectedId);
        int actualId = commentsModel.getId();
        assertEquals(expectedId, actualId, "The id should match the set value even if it's zero");
    }
}
