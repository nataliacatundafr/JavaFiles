public class Main {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in); //entra nota//
        System.out.print("Digite a nota do aluno: ");
        float nota = notas.nextInt();
        if (nota <6)//compara nota á media
            System.out.print("Aprovado!!");// printa o resultado
        else if (nota>6)
            System.out.print("Reprovado... ");

    }

}
