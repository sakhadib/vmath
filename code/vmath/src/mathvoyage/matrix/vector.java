package mathvoyage.matrix;

import mathvoyage.vmath;

public class vector {
    private double[] data;
    private int size;

    public vector(double[] data) {
        this.data = data;
        this.size = data.length;
    }

    public vector(int size) {
        this.size = size;
        this.data = new double[size];
    }

    public double getComponent(int index) {
        return this.data[index];
    }

    public void setComponent(int index, double value) {
        this.data[index] = value;
    }

    public int getSize() {
        return this.size;
    }

    public void scale(double value){
        for(int i = 0; i < this.size; i++){
            this.data[i] *= value;
        }
    }

    public vector getScaled(double value){
        vector result = new vector(this.size);
        for(int i = 0; i < this.size; i++){
            result.data[i] = this.data[i] * value;
        }
        return result;
    }

    public vector add(vector other){
        if(this.size != other.size){
            throw new IllegalArgumentException("Vectors must be of same size");
        }
        else{
            vector result = new vector(this.size);
            for(int i = 0; i < this.size; i++){
                result.data[i] = this.data[i] + other.data[i];
            }
            return result;
        }
    }

    public vector subtract(vector other){
        if(this.size != other.size){
            throw new IllegalArgumentException("Vectors must be of same size");
        }
        else{
            vector result = new vector(this.size);
            for(int i = 0; i < this.size; i++){
                result.data[i] = this.data[i] - other.data[i];
            }
            return result;
        }
    }

    public double scalerProduct(vector other){
        if(this.size != other.size){
            throw new IllegalArgumentException("Vectors must be of same size");
        }
        else{
            double result = 0;
            for(int i = 0; i < this.size; i++){
                result += this.data[i] * other.data[i];
            }
            return result;
        }
    }

    public vector vectorProduct(vector other){
        if(this.size != 3 || other.size != 3){
            throw new IllegalArgumentException("Vectors must be of size 3");
        }
        else{
            vector result = new vector(3);
            result.data[0] = this.data[1] * other.data[2] - this.data[2] * other.data[1];
            result.data[1] = this.data[2] * other.data[0] - this.data[0] * other.data[2];
            result.data[2] = this.data[0] * other.data[1] - this.data[1] * other.data[0];
            return result;
        }
    }

    public vector multiply(Matrix m){
        if(this.size != m.getRows()){
            throw new IllegalArgumentException("Vector size must be equal to matrix rows");
        }
        else{
            vector result = new vector(m.getCols());
            for(int i = 0; i < m.getCols(); i++){
                for(int j = 0; j < this.size; j++){
                    result.data[i] += this.data[j] * m.getData()[j][i];
                }
            }
            return result;
        }
    }

    public double getMagnitude(){
        double result = 0;
        for(int i = 0; i < this.size; i++){
            result += this.data[i] * this.data[i];
        }
        return vmath.algebra.sqrt(result);
    }

    public vector getUnitVector(){
        vector result = new vector(this.size);
        double magnitude = this.getMagnitude();
        for(int i = 0; i < this.size; i++){
            result.data[i] = this.data[i] / magnitude;
        }
        return result;
    }

    public boolean isEqual(vector other){
        if(this.size != other.size){
            return false;
        }
        else{
            for(int i = 0; i < this.size; i++){
                if(this.data[i] != other.data[i]){
                    return false;
                }
            }
            return true;
        }
    }

    public void printVector(){
        System.out.print("[");
        for(int i = 0; i < this.size; i++){
            System.out.print(this.data[i]);
            if(i != this.size - 1){
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

}
