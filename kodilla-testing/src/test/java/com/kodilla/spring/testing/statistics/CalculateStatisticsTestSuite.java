package com.kodilla.spring.testing.statistics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.stream.IntStream;

@ExtendWith(MockitoExtension.class)
public class CalculateStatisticsTestSuite {
    /**
     * Testy zrealizuj przy pomocy mocka interfejsu Statistics. Przetestuj poprawność
     * obliczeń wartości średnich dla różnych przypadków:
     * <p>
     * gdy liczba postów = 0,
     * gdy liczba postów = 1000,
     * gdy liczba komentarzy = 0,
     * gdy liczba komentarzy < liczba postów,
     * gdy liczba komentarzy > liczba postów,
     * gdy liczba użytkowników = 0,
     * gdy liczba użytkowników = 100.
     * <p>
     * Uwaga! Każdy przypadek testowy powinien być osobnym testem jednostkowym.
     * Śmiało możesz skorzystać też z adnotacji @BeforeEach aby przygotować dane testowe.
     */


    @Mock
    private Statistics statistics;

    @Test
    void testAverageWhenZeroPostsCount() {
        //given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Mockito.when(statistics.postsCount()).thenReturn(0);

        //when
        calculateStatistics.calculateAdvStatistics(statistics);

        //then
        Assertions.assertEquals(0, calculateStatistics.howManyPosts());
        Assertions.assertEquals(0.0, calculateStatistics.postsAveragePerUser());
    }

    //TODO gdy liczba postów = 1000

    @Test
    void testPostsCountEquals1000And2000Comments() {
        //given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Mockito.when(statistics.postsCount()).thenReturn(1000);
        Mockito.when(statistics.commentsCount()).thenReturn(2000);

        //when
        calculateStatistics.calculateAdvStatistics(statistics);

        //then
        Assertions.assertEquals(2.0, calculateStatistics.commentsAveragePerPost());

    }

    @Test
    void testCommentsCountEquals1000And5Users() {
        //given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Mockito.when(statistics.commentsCount()).thenReturn(1000);
        List<String> users = IntStream
                .range(0, 5)
                .boxed()
                .map(el -> "user:" + el)
                .toList();
        Mockito.when(statistics.usersNames()).thenReturn(users);

        //when
        calculateStatistics.calculateAdvStatistics(statistics);

        //then
        Assertions.assertEquals(200.0, calculateStatistics.commentsAveragePerUser());

    }

    @Test
    void testCommentsCountEqualsZero() {
        //given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Mockito.when(statistics.commentsCount()).thenReturn(0);

        //when
        calculateStatistics.calculateAdvStatistics(statistics);

        //then
        Assertions.assertEquals(0, 0);

    }


    @Test
    void testAverageWhen1000PostsFor100Users() {
        //given
        CalculateStatistics calculateStatistics = new CalculateStatistics();
        Mockito.when(statistics.postsCount()).thenReturn(1000);
        List<String> users = IntStream
                .range(0, 100)
                .boxed()
                .map(el -> "user:" + el)
                .toList();
        Mockito.when(statistics.usersNames()).thenReturn(users);

        //when
        calculateStatistics.calculateAdvStatistics(statistics);

        //then
        Assertions.assertEquals(1000, calculateStatistics.howManyPosts());
        Assertions.assertEquals(10.0, calculateStatistics.postsAveragePerUser());
    }

    @Test
    void PostsCountIsBiggerThanCommentsCount() {
        //given
        Mockito.when(statistics.postsCount()).thenReturn(10);
        Mockito.when(statistics.commentsCount()).thenReturn(9);

        //when
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();

        //then
        Assertions.assertTrue(postsCount > commentsCount);
    }

    @Test
    void PostsCountIsSmallerThanCommentsCount() {
        //given
        Mockito.when(statistics.postsCount()).thenReturn(3);
        Mockito.when(statistics.commentsCount()).thenReturn(11);

        //when
        int postsCount = statistics.postsCount();
        int commentsCount = statistics.commentsCount();

        //then
        Assertions.assertTrue(postsCount < commentsCount);
    }
}