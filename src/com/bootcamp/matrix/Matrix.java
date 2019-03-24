package com.bootcamp.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

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

    Matrix add(Matrix otherMatrix) {
        return this.performOperation(otherMatrix, addElements);
    }

    Matrix sub(Matrix otherMatrix) {
        return this.performOperation(otherMatrix, subtractElements);
    }

    private Matrix performOperation(Matrix otherMatrix, MatrixOperation operation) {
        List<List<Integer>> list = new ArrayList<>();
        Matrix resultedMatrix = new Matrix(list);
        for (int row = 0; row < this.matrix.size(); row++) {
            List<Integer> resultRow = new ArrayList<>();
            for (int column = 0; column < this.matrix.size(); column++) {
                Integer resultedElement = operation.perform(this.matrix.get(row).get(column), otherMatrix.matrix.get(row).get(column));
                resultRow.add(resultedElement);
            }
            resultedMatrix.matrix.addAll(Arrays.asList(resultRow));
        }
        return resultedMatrix;
    }

    Matrix mul(Matrix otherMatrix) {
        List<List<Integer>> list = new ArrayList<>();
        Matrix resultedMatrix = new Matrix(list);

        for (int index = 0; index < this.matrix.size(); index++) {
            List<Integer> resultRow = new ArrayList<>();
            for (int row = 0; row < this.matrix.size(); row++) {
                int sumOfMultiplication = 0;
                for (int column = 0; column < otherMatrix.matrix.size(); column++) {
                    sumOfMultiplication += (this.matrix.get(index).get(column) * otherMatrix.matrix.get(column).get(row));
                }
                resultRow.add(sumOfMultiplication);
            }
            resultedMatrix.matrix.add(resultRow);
        }
        return resultedMatrix;
    }

    Matrix transpose() {
        List<List<Integer>> list = new ArrayList<>();
        Matrix resultedMatrix = new Matrix(list);
        for (int row = 0; row < this.matrix.get(0).size(); row++) {
            List<Integer> resultRow = new ArrayList<>();
            for (List<Integer> rowElements : this.matrix) {
                resultRow.add(rowElements.get(row));
            }
            resultedMatrix.matrix.add(resultRow);
        }
        return resultedMatrix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Matrix matrix1 = (Matrix) o;
        return Objects.equals(addElements, matrix1.addElements) &&
                Objects.equals(subtractElements, matrix1.subtractElements) &&
                Objects.equals(matrix, matrix1.matrix);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addElements, subtractElements, matrix);
    }
}
