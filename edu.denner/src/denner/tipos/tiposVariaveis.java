package denner.tipos;

public class tiposVariaveis {

    public static void main(String[] args) {
        // tipos primitivos ( int, byte , short, long , float, double, boolean e char )
        byte idade = 123;
        short ano = 2121;
        int cep = 2107333; // se começar com zero, talvez tenha qe ser o outro tipo
        long cpf = 9876543219L; // se começar com zero, talvez tenha qe ser o outro tipo
        float pi = 3.14F;
        double salarioMinin = 2500.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
    }
}