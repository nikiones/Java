/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ua.edu.chmnu.fks.oop.lab_6;

import java.util.Iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static ua.edu.chmnu.fks.oop.lab_6.Auditory.*;

/**
 *
 * @author NikitaPC
 */
public class Auditory_Test {



    public Auditory_Test() {

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
    public void parallelogramPerimeterTest(){
        Parallelogram par = mock(Parallelogram.class);
        when(par.perimeter()).thenReturn(20.0);
        assertEquals(20.0, par.perimeter());
    }

    @Test
    public void parallelogramSquareTest(){
        Parallelogram par = mock(Parallelogram.class);
        when(par.square()).thenReturn(77.26650019206264);
        assertEquals(77.26650019206264, par.square());
    }

    @Test
    public void getAngle1Test(){
        Parallelogram par = mock(Parallelogram.class);
        when(par.getAngle1()).thenReturn(12.0);
        assertEquals(12.0, par.getAngle1());
    }

    @Test
    public void setLengthTest(){
        Parallelogram par = mock(Parallelogram.class);
        par.setLength(2);
        par.setLength(5);
        par.setLength(5);
        par.setLength(5);
        par.setLength(6);

        verify(par, times(1)).setLength(2);
        verify(par, times(3)).setLength(5);
        verify(par, times(1)).setLength(6);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setLength(2);
        inOrder.verify(par, times(3)).setLength(5);
        inOrder.verify(par).setLength(6);
    }

    @Test
    public void setWidthTest(){
        Parallelogram par = mock(Parallelogram.class);
        par.setWidth(3);
        par.setWidth(4);
        par.setWidth(4);
        par.setWidth(4);
        par.setWidth(7);

        verify(par, times(1)).setWidth(3);
        verify(par, times(3)).setWidth(4);
        verify(par, times(1)).setWidth(7);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setWidth(3);
        inOrder.verify(par, times(3)).setWidth(4);
        inOrder.verify(par).setWidth(7);

    }

    @Test
    public void setAngle1Test(){
        Parallelogram par = mock(Parallelogram.class);
        par.setAngle1(7);
        par.setAngle1(9);
        par.setAngle1(9);
        par.setAngle1(9);
        par.setAngle1(11);

        verify(par, times(1)).setAngle1(7);
        verify(par, times(3)).setAngle1(9);
        verify(par, times(1)).setAngle1(11);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setAngle1(7);
        inOrder.verify(par, times(3)).setAngle1(9);
        inOrder.verify(par).setAngle1(11);
    }

    @Test
    public void parallelepipedPerimeterTest(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.perimeter()).thenReturn(80.0);
        assertEquals(80.0, par.perimeter());
    }

    @Test
    public void parallelepipedSquareTest(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.square()).thenReturn(1005.3754420378682);
        assertEquals(1005.3754420378682, par.square());
    }

    @Test
    public void parallelepipedVolumeTest(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.volume()).thenReturn(370.4353347064138);
        assertEquals(370.4353347064138, par.volume());
    }

    @Test
    public void getHeightTest(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.getHeight()).thenReturn(10.0);
        assertEquals(10.0, par.getHeight());
    }

    @Test
    public void getAngle2Test(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.getAngle2()).thenReturn(0.5);
        assertEquals(0.5, par.getAngle2());
    }

    @Test
    public void getAngle3Test(){
        Parallelepiped par = mock(Parallelepiped.class);
        when(par.getAngle3()).thenReturn(0.4);
        assertEquals(0.4, par.getAngle3());
    }

    @Test
    public void setHeightTest(){
        Parallelepiped par = mock(Parallelepiped.class);
        par.setHeight(7);
        par.setHeight(9);
        par.setHeight(9);
        par.setHeight(9);
        par.setHeight(11);

        verify(par, times(1)).setHeight(7);
        verify(par, times(3)).setHeight(9);
        verify(par, times(1)).setHeight(11);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setHeight(7);
        inOrder.verify(par, times(3)).setHeight(9);
        inOrder.verify(par).setHeight(11);
    }

    @Test
    public void setAngle2Test(){
        Parallelepiped par = mock(Parallelepiped.class);
        par.setAngle2(0.1);
        par.setAngle2(0.4);
        par.setAngle2(0.4);
        par.setAngle2(0.4);
        par.setAngle2(0.6);

        verify(par, times(1)).setAngle2(0.1);
        verify(par, times(3)).setAngle2(0.4);
        verify(par, times(1)).setAngle2(0.6);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setAngle2(0.1);
        inOrder.verify(par, times(3)).setAngle2(0.4);
        inOrder.verify(par).setAngle2(0.6);
    }

    @Test
    public void setAngle3Test(){
        Parallelepiped par = mock(Parallelepiped.class);
        par.setAngle3(0.2);
        par.setAngle3(0.5);
        par.setAngle3(0.5);
        par.setAngle3(0.5);
        par.setAngle3(0.8);

        verify(par, times(1)).setAngle3(0.2);
        verify(par, times(3)).setAngle3(0.5);
        verify(par, times(1)).setAngle3(0.8);

        InOrder inOrder = inOrder(par);
        inOrder.verify(par).setAngle3(0.2);
        inOrder.verify(par, times(3)).setAngle3(0.5);
        inOrder.verify(par).setAngle3(0.8);
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
