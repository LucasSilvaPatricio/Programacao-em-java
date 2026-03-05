package application;

import entities.Person;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.IO.print;
import static java.lang.IO.println;

//    Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//    tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//    bem como os nomes dessas pessoas caso houver.

public class Heights {

    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();
        Person[] people = new Person[n];
        String minors = "";
        for(int k = 0; k < people.length; k++){
            sc.nextLine();
            println("Dados da "+(k+1)+"a pessoa");
            print("Nome: ");
            String name = sc.nextLine();
            print("Idade: ");
            int age = sc.nextInt();
            print("Height: ");
            double height = sc.nextDouble();
            people[k] = new Person(name, age,height);
        }

        double averageHeight = 0.0;
        double lessThanSixteen = 0.0;

        for(int j = 0; j < people.length; j++){
            averageHeight += people[j].getHeight();
            if(people[j].getAge() < 16){
                lessThanSixteen++;
                minors += people[j].getName()+"\n";
            }
        }

        averageHeight = averageHeight / people.length; // average
        lessThanSixteen = (lessThanSixteen/n) * 100;
        println("Altura média: "+String.format("%.2f",averageHeight));
        println("Pessoas com menos de 16 anos: "+String.format("%.1f",lessThanSixteen)+"%");
        println(minors);
        sc.close();
    }
}
