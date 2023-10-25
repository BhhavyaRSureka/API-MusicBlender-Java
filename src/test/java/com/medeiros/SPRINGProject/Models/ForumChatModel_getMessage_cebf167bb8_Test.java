// Test generated by RoostGPT for test JavaTest using AI Type Open AI and AI Model gpt-4

package com.medeiros.SPRINGProject.Models;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ForumChatModel_getMessage_cebf167bb8_Test {

    @Test
    public void testGetMessage() {
        ForumChatModel forumChatModel = new ForumChatModel();
        forumChatModel.setMessage("Hello World!");
        String message = forumChatModel.getMessage();
        assertNotNull(message, "Message should not be null");
        assertEquals("Hello World!", message, "Expected and actual message do not match");
    }

    @Test
    public void testGetMessage_EmptyString() {
        ForumChatModel forumChatModel = new ForumChatModel();
        forumChatModel.setMessage("");
        String message = forumChatModel.getMessage();
        assertNotNull(message, "Message should not be null");
        assertEquals("", message, "Expected and actual message do not match");
    }
}
