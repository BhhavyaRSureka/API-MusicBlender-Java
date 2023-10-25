// Test generated by RoostGPT for test JavaTest using AI Type Open AI and AI Model gpt-4

package com.medeiros.SPRINGProject.Models;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ForumChatModel_setMessage_a4320850bf_Test {

    private ForumChatModel forumChatModel;

    @BeforeEach
    public void setUp() {
        forumChatModel = new ForumChatModel();
    }

    @Test
    public void testSetMessage_success() {
        String expectedMessage = "Hello, World!";
        forumChatModel.setMessage(expectedMessage);
        assertEquals(expectedMessage, forumChatModel.getMessage());
    }

    @Test
    public void testSetMessage_null() {
        forumChatModel.setMessage(null);
        assertNull(forumChatModel.getMessage());
    }

    @Test
    public void testSetMessage_emptyString() {
        String expectedMessage = "";
        forumChatModel.setMessage(expectedMessage);
        assertEquals(expectedMessage, forumChatModel.getMessage());
    }
}
