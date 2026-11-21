package br.edu.insper.desagil.aps1;

public class Leibniz {
    public double aproxima(int n) {
        double soma = 0.0;
        for (int i = 1; i<=n; i++){
            if (i%2 == 1){
                soma += (double) 1/(2*i - 1);
            } else{
                soma -= (double) 1/(2*i -1);
            }
        }
        return 4*soma;
    }
}
