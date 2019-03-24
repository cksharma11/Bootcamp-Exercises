package com.bootcamp.matrix;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MatrixOperationsTest {

    @Test
    void shouldAddMatrix() {
        List<List<Integer>> matrix = new ArrayList<>();
        matrix.add(Arrays.asList(1,2,3));
        matrix.add(Arrays.asList(1,2,3));
        matrix.add(Arrays.asList(1,2,3));

        List<List<Integer>> otherMatrix= new ArrayList<>();
        otherMatrix.add(Arrays.asList(1,2,3));
        otherMatrix.add(Arrays.asList(1,2,3));
        otherMatrix.add(Arrays.asList(1,2,3));

        List<List<Integer>> resultedMatrix= new ArrayList<>();
        resultedMatrix.add(Arrays.asList(2,4,6));
        resultedMatrix.add(Arrays.asList(2,4,6));
        resultedMatrix.add(Arrays.asList(2,4,6));

        MatrixOperations matrixOperations = new MatrixOperations(matrix);

        List<List<Integer>> actual = matrixOperations.add(otherMatrix);

        assertEquals(resultedMatrix, actual);
    }
}