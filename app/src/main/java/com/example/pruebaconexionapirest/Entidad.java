package com.example.pruebaconexionapirest;

class Entidad {
    private int imgFoto;
    private String titulo;
    private String urlImagen;

    public Entidad(String titulo, String urlImg){

        this.titulo=titulo;
        this.urlImagen=urlImg;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getUrlImagen(){return urlImagen;}
}