package br.edu.insper.desagil.aps1;

public class Potres {
    public int calcula(int n) {
        int k = 0;
        while (n%3 == 0){
            n = n/3;
            k += 1;
        }

        if (n == 1){
            return k;
        }

        return -1;
    }
}
