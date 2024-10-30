package br.com.fiap.mvc.model;

public enum Genero {
    ACAO("Ação"), EDUCACAO("Educação"), AUTO_AJUDA("Auto-ajuda"),
    ESPORTE("Esporte"), PROGRAMACAO("Programacao"), DRAMA("Drama"),
    ROMANCE("Romance"), DORAMA("Dorama");


    private String label;

    Genero(String label){
        this.label = label;
    }

    public String getLabel(){
        return label;
    }
}
