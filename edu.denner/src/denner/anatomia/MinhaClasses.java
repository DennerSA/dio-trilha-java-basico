package denner.anatomia;

public class MinhaClasses {

    public static void main(String[] args) {
        String primeiroNome = "Denner";
        String segundoNome = "Silva";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" " ).concat(segundoNome);
    }

}
