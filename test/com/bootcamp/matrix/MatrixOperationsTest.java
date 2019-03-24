package com.bootcamp.matrix;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MatrixOperationsTest {
    private List<List<Integer>> matrix = new ArrayList<>();
    private List<List<Integer>> otherMatrix = new ArrayList<>();

    @BeforeEach
    void setUp() {
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(1, 2, 3));
        matrix.add(Arrays.asList(1, 2, 3));

        otherMatrix.add(Arrays.asList(1, 2, 3));
        otherMatrix.add(Arrays.asList(1, 2, 3));
        otherMatrix.add(Arrays.asList(1, 2, 3));

    }

    @Test
    void shouldAddMatrix() {
        Matrix matrixOperations = new Matrix(matrix);
        List<List<Integer>> resultedMatrix = new ArrayList<>();
        resultedMatrix.add(Arrays.asList(2, 4, 6));
        resultedMatrix.add(Arrays.asList(2, 4, 6));
        resultedMatrix.add(Arrays.asList(2, 4, 6));

        List<List<Integer>> actual = matrixOperations.add(otherMatrix);

        assertEquals(resultedMatrix, actual);
    }

    @Test
    void shouldSubtractMatrix() {
        Matrix matrixOperations = new Matrix(matrix);
        List<List<Integer>> resultedMatrix = new ArrayList<>();
        resultedMatrix.add(Arrays.asList(0, 0, 0));
        resultedMatrix.add(Arrays.asList(0, 0, 0));
        resultedMatrix.add(Arrays.asList(0, 0, 0));

        List<List<Integer>> actual = matrixOperations.sub(otherMatrix);

        assertEquals(resultedMatrix, actual);
    }

}