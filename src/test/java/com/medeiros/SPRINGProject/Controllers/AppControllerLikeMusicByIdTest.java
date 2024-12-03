

package com.medeiros.SPRINGProject.Controllers;
import com.medeiros.SPRINGProject.Controllers.AppController;
import com.medeiros.SPRINGProject.Models.*;
import com.medeiros.SPRINGProject.algorithm.algorithmBlender;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.stream.Stream;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import java.util.Map;

@DisplayName("AppControllerLikeMusicByIdTest")
class AppControllerLikeMusicByIdTest {
    @Mock
    private MusicRepository musicRepo;
    @Mock
    private LogRepository Log;
    @Mock
    private LogModel Date;
    @Mock
    private CommentsRepository CommentsRepo;
    @Mock
    private algorithmBlender ab;
    @InjectMocks
    private AppController controller;
    private static Stream<Arguments> provideTestData() {
        return Stream.of(
                Arguments.of(1, 0, "Música Alterada!"),
                Arguments.of(2, 10, "Música Alterada!"),
                Arguments.of(3, 20, "Música Alterada!")
        );
    }
    @ParameterizedTest
    @MethodSource("provideTestData")
    @Tag("valid")
    @DisplayName("Should successfully increment the number of likes for a music track")
    void likeMusicById_Success(int id, int initialLikes, String expectedMessage) {
        // Arrange
        MusicModel musicToUpdate = new MusicModel();
        musicToUpdate.setNumberOfLikes(initialLikes);
        when(musicRepo.findById(id)).thenReturn(Optional.of(musicToUpdate));
        // Act
        String actualMessage = controller.LikeMusicById(id);
        // Assert
        assertThat(actualMessage).isEqualTo(expectedMessage);
        assertThat(musicToUpdate.getNumberOfLikes()).isEqualTo(initialLikes + 1);
        Mockito.verify(musicRepo).save(musicToUpdate);
        Mockito.verify(Log).save(any(LogModel.class));
    }
    @Test
    @Tag("invalid")
    @DisplayName("Should return an error message when the music ID does not exist")
    void likeMusicById_NonExistentId() {
        // Arrange
        when(musicRepo.findById(anyInt())).thenReturn(Optional.empty());
        // Act
        String actualMessage = controller.LikeMusicById(100);
        // Assert
        assertThat(actualMessage).isEqualTo("Música não encontrada!");
        Mockito.verify(musicRepo).findById(100);
        Mockito.verifyNoInteractions(Log);
    }
    @Test
    @Tag("integration")
    @DisplayName("Should handle database save failure gracefully")
    void likeMusicById_SaveFailure() {
        // Arrange
        MusicModel musicToUpdate = new MusicModel();
        musicToUpdate.setNumberOfLikes(0);
        when(musicRepo.findById(anyInt())).thenReturn(Optional.of(musicToUpdate));
        when(musicRepo.save(any(MusicModel.class))).thenThrow(new RuntimeException());
        // Act
        String actualMessage = controller.LikeMusicById(100);
        // Assert
        assertThat(actualMessage).isEqualTo("Ocorreu um erro ao atualizar a música!");
        Mockito.verify(musicRepo).findById(100);
        Mockito.verify(musicRepo).save(musicToUpdate);
        Mockito.verifyNoInteractions(Log);
    }
    @Test
    @Tag("invalid")
    @DisplayName("Should handle null music model gracefully")
    void likeMusicById_NullMusicModel() {
        // Arrange
        when(musicRepo.findById(anyInt())).thenReturn(Optional.empty());
        // Act
        String actualMessage = controller.LikeMusicById(100);
        // Assert
        assertThat(actualMessage).isEqualTo("Música não encontrada!");
        Mockito.verify(musicRepo).findById(100);
        Mockito.verifyNoInteractions(Log);
    }
}