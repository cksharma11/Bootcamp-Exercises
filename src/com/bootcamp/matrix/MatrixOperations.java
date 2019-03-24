package com.bootcamp.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixOperations {
    private List<List<Integer>> matrix;

    MatrixOperations(List<List<Integer>> matrix) {
        this.matrix = matrix;
    }

    List<List<Integer>> add(List<List<Integer>> otherMatrix){
        List<List<Integer>> resultedMatrix = new ArrayList<>();
        for (int row = 0; row < this.matrix.size(); row++) {
            List<Integer> resultRow = new ArrayList<>();
            for (int column = 0; column < this.matrix.size(); column++) {
                resultRow.add(this.matrix.get(row).get(column) + otherMatrix.get(row).get(column));
            }
            resultedMatrix.addAll(Arrays.asList(resultRow));
        }
        return resultedMatrix;
    }
}
