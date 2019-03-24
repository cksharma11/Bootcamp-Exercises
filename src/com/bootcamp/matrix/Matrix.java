package com.bootcamp.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Matrix {
    interface MatrixOperation {
        Integer perform(Integer a, Integer b);
    }

    private MatrixOperation addElements = (a, b) -> a + b;
    private MatrixOperation subtractElements = (a, b) -> a - b;

    private List<List<Integer>> matrix;

    Matrix(List<List<Integer>> matrix) {
        this.matrix = matrix;
    }

    List<List<Integer>> add(List<List<Integer>> otherMatrix) {
        return this.performOperation(otherMatrix, addElements);
    }

    List<List<Integer>> sub(List<List<Integer>> otherMatrix) {
        return this.performOperation(otherMatrix, subtractElements);
    }

    private List<List<Integer>> performOperation(List<List<Integer>> otherMatrix, MatrixOperation operation) {
        List<List<Integer>> resultedMatrix = new ArrayList<>();
        for (int row = 0; row < this.matrix.size(); row++) {
            List<Integer> resultRow = new ArrayList<>();
            for (int column = 0; column < this.matrix.size(); column++) {
                Integer resultedElement = operation.perform(this.matrix.get(row).get(column), otherMatrix.get(row).get(column));
                resultRow.add(resultedElement);
            }
            resultedMatrix.addAll(Arrays.asList(resultRow));
        }
        return resultedMatrix;
    }

    List<List<Integer>> mul(List<List<Integer>> otherMatrix) {
        List<List<Integer>> resultedMatrix = new ArrayList<>();

        for (int index = 0; index < this.matrix.size(); index++) {
            List<Integer> resultRow = new ArrayList<>();
            for (int row = 0; row < this.matrix.size(); row++) {
                int sumOfMultiplication = 0;
                for (int column = 0; column < otherMatrix.size(); column++) {
                    sumOfMultiplication += (this.matrix.get(index).get(column) * otherMatrix.get(column).get(row));
                }
                resultRow.add(sumOfMultiplication);
            }
            resultedMatrix.add(resultRow);
        }
        return resultedMatrix;
    }
}
