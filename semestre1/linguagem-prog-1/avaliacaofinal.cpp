#include<stdio.h>
#include<stdlib.h>
#include<string>

int main(){

   int opcao, numero_nome, i=1;
   float areatrap, basemaior, basemenor, alturatrap, pesoideal, alt;
   char c, opcao2, nome[50];

   system("clear");

   do{
      printf("Digite o numero da opção abaixo desejada\n");
      printf("Opção 1) Trapezio\n");
      printf("Opção 2) Nome\n");
      printf("Opção 3) Peso Ideal\n");
      printf("Opção 0) SAIR\n");
      scanf("%d", &opcao);
      system("clear");

      switch (opcao) {
         case 1:
         	printf("Você selecionou a opção 1, descubra a área do trapézio!\n");
         	printf("Digite a altura do trapézio:\n");
         	scanf("%f", &alturatrap);
         	printf("Digite a maior base do trapézio:\n");
         	scanf("%f", &basemaior);
         	printf("Digite a menor base do trapézio:\n");
         	scanf("%f", &basemenor);

         	areatrap=((basemaior+basemenor)*alturatrap)/2;

         	printf("Area = %.2f\n", areatrap);
		      printf("Pressione ENTER para voltar ao menu principal\n");
            getchar();
            getchar();

	        break;

         case 2:
         	printf("Você escolheu 'Nome'\n");
	 	      printf("Digite um numero inteiro: ");
		      scanf("%d",&numero_nome);
         	printf("Digite o seu nome: ");
		      scanf("%s",nome);

		      while(i<=numero_nome){
               printf("%s\n",nome);
			      i++;
		      }
            i=1;

		      printf("Pressione ENTER para voltar ao menu principal\n");
		      getchar();
            getchar();

         break;
         case 3:
         	printf("Peso ideal\n");
		      printf("Escolha o sexo.\nDigite 'm' para masculino e 'f' para feminino.\n");
		      scanf(" %c",&opcao2);

		      switch(opcao2){
               case 'm':
                  printf("Você escolheu 'masculino'.\n");
                  printf("Digite a sua altura: ");
                  scanf("%f",&alt);

                  pesoideal = (72.7*alt)-58;

                  printf("O seu peso ideal é %.2f\n", pesoideal);
                  printf("Pressione ENTER para voltar ao menu principal\n");
                  getchar();
		            getchar();
               break;
               case 'f':
                  printf("Você escolheu 'feminino'.\n");
                  printf("Digite a sua altura: ");
                  scanf("%f",&alt);
                  pesoideal = (62.1*alt)-44.7;
                  printf("O seu peso ideal é %.2f\n", pesoideal);
                  printf("Pressione ENTER para voltar ao menu principal\n");
                  getchar();
            		getchar();
               break;
            }
         break;
         default:
            printf("Opção invalida, digite outra opção\n");
            getchar();
            getchar();
         break;
      }
      system("clear");
  }while(opcao!=0);

return 0;
}
