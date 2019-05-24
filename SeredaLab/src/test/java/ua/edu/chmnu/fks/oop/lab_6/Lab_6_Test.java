package ua.edu.chmnu.fks.oop.lab_6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static ua.edu.chmnu.fks.oop.lab_6.Lab_6.*;

/**
 *
 * @author NikitaPC
 */
public class Lab_6_Test {

    public Lab_6_Test() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {

    }

    @AfterEach
    public void tearDown() {
    }

    @Test
    public void getBookTypeTest(){
        Manual manual = mock(Manual.class);
        when(manual.getBookType()).thenReturn("Пособие");
        assertEquals("Пособие", manual.getBookType());
    }

    @Test
    public void getNameTest(){
        Manual manual = mock(Manual.class);
        when(manual.getName()).thenReturn("Нормальная физиология");
        assertEquals("Нормальная физиология", manual.getName());
    }

    @Test
    public void getAuthorTest(){
        Manual manual = mock(Manual.class);
        when(manual.getAuthor()).thenReturn("Агаджанян Николай Александрович");
        assertEquals("Агаджанян Николай Александрович", manual.getAuthor());
    }

    @Test
    public void getYearTest(){
        Manual manual = mock(Manual.class);
        when(manual.getYear()).thenReturn(2001);
        assertEquals(2001, manual.getYear());
    }

    @Test
    public void getPageNumberTest(){
        Manual manual = mock(Manual.class);
        when(manual.getPageNumber()).thenReturn(233);
        assertEquals(233, manual.getPageNumber());
    }

    @Test
    public void getPriceTest(){
        Manual manual = mock(Manual.class);
        when(manual.getPrice()).thenReturn(500);
        assertEquals(500, manual.getPrice());
    }

    @Test
    public void setNameTest(){
        Manual manual = mock(Manual.class);
        manual.setName("physics");
        manual.setName("math");
        manual.setName("math");
        manual.setName("math");
        manual.setName("biology");

        verify(manual, times(1)).setName("physics");
        verify(manual, times(3)).setName("math");
        verify(manual, times(1)).setName("biology");

        InOrder inOrder = inOrder(manual);
        inOrder.verify(manual).setName("physics");
        inOrder.verify(manual, times(3)).setName("math");
        inOrder.verify(manual).setName("biology");

    }

    @Test
    public void setAuthorTest(){
        Manual manual = mock(Manual.class);
        manual.setAuthor("Jeremy");
        manual.setAuthor("Jack");
        manual.setAuthor("Jack");
        manual.setAuthor("Jack");
        manual.setAuthor("Felicity");

        verify(manual, times(1)).setAuthor("Jeremy");
        verify(manual, times(3)).setAuthor("Jack");
        verify(manual, times(1)).setAuthor("Felicity");

        InOrder inOrder = inOrder(manual);
        inOrder.verify(manual).setAuthor("Jeremy");
        inOrder.verify(manual, times(3)).setAuthor("Jack");
        inOrder.verify(manual).setAuthor("Felicity");
    }

    @Test
    public void setYearTest(){
        Manual manual = mock(Manual.class);
        manual.setYear(2000);
        manual.setYear(2004);
        manual.setYear(2004);
        manual.setYear(2004);
        manual.setYear(2010);

        verify(manual, times(1)).setYear(2000);
        verify(manual, times(3)).setYear(2004);
        verify(manual, times(1)).setYear(2010);

        InOrder inOrder = inOrder(manual);
        inOrder.verify(manual).setYear(2000);
        inOrder.verify(manual, times(3)).setYear(2004);
        inOrder.verify(manual).setYear(2010);
    }

    @Test
    public void setPageNumberTest(){
        Manual manual = mock(Manual.class);
        manual.setPageNumber(250);
        manual.setPageNumber(300);
        manual.setPageNumber(300);
        manual.setPageNumber(300);
        manual.setPageNumber(425);

        verify(manual, times(1)).setPageNumber(250);
        verify(manual, times(3)).setPageNumber(300);
        verify(manual, times(1)).setPageNumber(425);

        InOrder inOrder = inOrder(manual);
        inOrder.verify(manual).setPageNumber(250);
        inOrder.verify(manual, times(3)).setPageNumber(300);
        inOrder.verify(manual).setPageNumber(425);
    }

    @Test
    public void setPriceTest(){
        Manual manual = mock(Manual.class);
        manual.setPrice(300);
        manual.setPrice(500);
        manual.setPrice(500);
        manual.setPrice(500);
        manual.setPrice(225);

        verify(manual, times(1)).setPrice(300);
        verify(manual, times(3)).setPrice(500);
        verify(manual, times(1)).setPrice(225);

        InOrder inOrder = inOrder(manual);
        inOrder.verify(manual).setPrice(300);
        inOrder.verify(manual, times(3)).setPrice(500);
        inOrder.verify(manual).setPrice(225);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
