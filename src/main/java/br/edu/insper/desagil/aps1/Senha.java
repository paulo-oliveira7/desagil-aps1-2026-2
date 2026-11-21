package br.edu.insper.desagil.aps1;

public class Senha {
    public boolean valida(String s) {
        boolean maius = false;
        boolean minus = false;
        boolean nletra = false;

        for (int i = 0; i < s.length(); i++){
            if (Character.isUpperCase(s.charAt(i))){
                maius = true;
            } else if (Character.isLowerCase(s.charAt(i))) {
                minus = true;
            } else{
                nletra = true;
            }
        }

        if (maius && minus && nletra){
            return true;
        }
        return false;
    }
}
