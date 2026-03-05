import entities.Product;

void main() {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    Product[] vect = new Product[n];

    for(int k = 0; k < n; k++){
        sc.nextLine();
        String name = sc.nextLine();
        double price = sc.nextDouble();
        vect[k] = new Product(name, price);
    }

    double sum = 0.0;
    for(int k = 0; k < vect.length; k++){
        sum += vect[k].getPrice();
    }

    double avg = sum/vect.length;

    IO.println("AVERAGE PRICE: "+avg);
}
//    double[]vect = new double[10];
//    double value = 0.0;
//
//    for(int i=0; i < vect.length; i++){
//        vect[i] = i;
//    }
//
//    for(int i = 0; i < vect.length; i++){
//        value += vect[i];
//    }
//
//    System.out.printf("Value: %.2f",value);