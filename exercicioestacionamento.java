import java.util.Scanner;

class exercicioestacionamento
{
	public static void main (String[] args)
	{
		Scanner ler = new Scanner(System.in);
        // Declarado uma variavel de numero inteiro.
		int numero;
        // Exibe na tela o texto do que o usuario deve fazer ou digitar e foi usado /n para quebra de linha.
        System.out.print("Ola! \n Se voce for idoso digite 1 \n Se for uma pessoa com deficiencia digite 2 \n Se for gestante digite 3 \n Se nao for nenhuma dessas opçoes digite 4: ");
		// Atribuido o comando ler.nextInt() na variavel.
        numero = ler.nextInt();
        // Declarado condiçao que se o usuario digitar um valor igual a 1, exibe a mensagem que ele pode estacionar na vaga. 
		if(numero==1)
        {
			System.out.print("Voce pode estacionar na vaga!");
        }
        // Declarado condiçao que se o usuario digitar um valor igual a 2, exibe a mensagem que ele pode estacionar na vaga.
        else if(numero==2)
        {
            System.out.print("Voce pode estacionar na vaga!");
        }
        // Declarado condiçao que se o usuario digitar um valor igual a 3, exibe a mensagem que ele pode estacionar na vaga.
        else if(numero==3)
        {
            System.out.print("Voce pode estacionar na vaga!");
        }
        // Declarado condiçao que se o usuario digitar um valor igual a 4, exibe a mensagem que ele nao pode estacionar na vaga.
        else if(numero==4)
        {
            System.out.print("Voce nao pode estacionar na vaga!");
        }
        // Declarado que usuario nao pode digitar qualquer valor alem de "1,2,3 ou 4"
        else
        {
            System.out.print("Por favor, digite 1, 2, 3 ou 4!");
        }
    }
}





