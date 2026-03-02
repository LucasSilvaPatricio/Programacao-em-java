
void main() {
    double[]vect = new double[10];
    double value = 0.0;
    for(int i=0; i < vect.length; i++){
        vect[i] = i;
    }

    for(int i = 0; i < vect.length; i++){
        value += vect[i];
    }

    System.out.printf("Value: %.2f",value);

}
