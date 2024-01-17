package mathvoyage.matrix;

import mathvoyage.vmath;

/**
 * The type Vector.
 */
public class vector {
    private double[] data;
    private int size;

    /**
     * Instantiates a new Vector.
     *
     * @param data the data
     */
    public vector(double[] data) {
        this.data = data;
        this.size = data.length;
    }

    /**
     * Instantiates a new Vector.
     *
     * @param size the size
     */
    public vector(int size) {
        this.size = size;
        this.data = new double[size];
    }

    /**
     * Gets component.
     *
     * @param index the index
     * @return the component
     */
    public double getComponent(int index) {
        return this.data[index];
    }

    /**
     * Sets component.
     *
     * @param index the index
     * @param value the value
     */
    public void setComponent(int index, double value) {
        this.data[index] = value;
    }

    /**
     * Gets size.
     *
     * @return the size
     */
    public int getSize() {
        return this.size;
    }

    /**
     * Scale.
     *
     * @param value the value
     */
    public void scale(double value){
        for(int i = 0; i < this.size; i++){
            this.data[i] *= value;
        }
    }

    /**
     * Get scaled vector.
     *
     * @param value the value
     * @return the vector
     */
    public vector getScaled(double value){
        vector result = new vector(this.size);
        for(int i = 0; i < this.size; i++){
            result.data[i] = this.data[i] * value;
        }
        return result;
    }

    /**
     * Add vector.
     *
     * @param other the other
     * @return the vector
     */
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

    /**
     * Subtract vector.
     *
     * @param other the other
     * @return the vector
     */
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

    /**
     * Scaler product double.
     *
     * @param other the other
     * @return the double
     */
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

    /**
     * Vector product vector.
     *
     * @param other the other
     * @return the vector
     */
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

    /**
     * Multiply vector.
     *
     * @param m the m
     * @return the vector
     */
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

    /**
     * Get magnitude double.
     *
     * @return the double
     */
    public double getMagnitude(){
        double result = 0;
        for(int i = 0; i < this.size; i++){
            result += this.data[i] * this.data[i];
        }
        return vmath.algebra.sqrt(result);
    }

    /**
     * Get unit vector vector.
     *
     * @return the vector
     */
    public vector getUnitVector(){
        vector result = new vector(this.size);
        double magnitude = this.getMagnitude();
        for(int i = 0; i < this.size; i++){
            result.data[i] = this.data[i] / magnitude;
        }
        return result;
    }

    /**
     * Is equal boolean.
     *
     * @param other the other
     * @return the boolean
     */
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

    /**
     * Print vector.
     */
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
