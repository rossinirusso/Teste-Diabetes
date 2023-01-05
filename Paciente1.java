package Diabetes1;

public class Paciente1 {
    private String nome;
    private double exames[];
    private int tamanho;
    private double media;
    private int cont;

    public Paciente1(String nome, int n){
        this.nome=nome;
        tamanho=n;
        exames = new double[tamanho];
    }
    
    public String getNome(){
        return nome;
    }

    public double getAnalise(int i){
        return exames[i];
    }

    public double getMedia(){
        for(int i=0;i<tamanho;i++){
            media = media+exames[i];
}
media = media/tamanho;
return media;
    }

    public int getDiagnostico(){

        for(int i=0;i<tamanho;i++){
            media = media+exames[i];
}
        media = media/tamanho;
        if(media<140){
            return 0;
        }

        if(media>=140 && media<=199){
            return 1;
        }

        else{
            return 2;
        }

    }

    public void insere(double x){
        exames[cont]=x;
        cont++;
    }
}
