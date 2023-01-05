package Diabetes1;
import java.util.Scanner;

public class TesteDiabetes1 {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Insira o nome do paciente:");
        String nome = entrada.nextLine();

        System.out.println("Insira o número de amostras a serem analisadas:");
        int nAmostras =  entrada.nextInt();

        Paciente1 p = new Paciente1(nome, nAmostras);

        for(int i=0;i<nAmostras;i++){
            System.out.printf("Resultado teste %d: \n",i+1);
            p.insere(entrada.nextDouble());
        }
        
        System.out.println();
        System.out.println("########## Relatório Final ##########");
        System.out.printf("Nome do paciente: %s \n",p.getNome());
        System.out.printf("Resultado médio: %f \n",p.getMedia());
        
        int x = p.getDiagnostico();
        if(x==0){
            System.out.println("Diagnóstico :Glicemia normal");
        }

        else if(x==1){
            System.out.println("Diagnóstico : Situação de risco");
            
        }

        else if(x==2){
            System.out.println("Diagnóstico : Diabates");
        }
                
        

    }


    
}
