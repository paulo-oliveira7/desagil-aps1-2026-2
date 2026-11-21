package br.edu.insper.desagil.aps1;

public class Eme {
    public String constroi(int n) {
        String m = "";
        for (int i = 0; i<= n; i++){
            m += "M";
            for (int j = 0; j<i; j++){
                m += " ";
            }
            m += "M";
            for (int j = 0; j < 2*(n-i); j++){
                m += " ";
            }
            m += "M";
            for (int j = 0; j < i; j++){
                m += " ";
            }
            m += "M\n";
        }
        for (int i = 0; i<n; i++){
            m += "M";
            for (int j = 0; j<2*(n+1); j++){
                m += " ";
            }
            m += "M\n";
        }
        return m;
    }
}
