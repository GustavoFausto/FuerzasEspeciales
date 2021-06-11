package com.auditorias.fuerzasespeciales.request.inicioSubFase;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Documentos {
    @SerializedName("IdIntegracion")
    @Expose
    private String idIntegracion;
    @SerializedName("Descripcion")
    @Expose
    private String descripcion;
    @SerializedName("TipoArchivo")
    @Expose
    private String tipoArchivo;
    @SerializedName("TamArhivo")
    @Expose
    private Integer tamArhivo;
    @SerializedName("StringArchivo")
    @Expose
    private String stringArchivo;

    private String mPath;

    private String tipoDocumento;

    public Documentos(String descripcion, String idIntegracion, String tipoArchivo, Integer tamArhivo, String stringArchivo, String mPath, String tipoDocumento) {
        this.descripcion = descripcion;
        this.idIntegracion = idIntegracion;
        this.tipoArchivo = tipoArchivo;
        this.tamArhivo = tamArhivo;
        this.stringArchivo = stringArchivo;
        this.mPath = mPath;
        this.tipoDocumento = tipoDocumento;
    }

    public Documentos(String descripcion, String tipoArchivo, Integer tamArhivo, String stringArchivo) {
        this.descripcion = descripcion;
        this.tipoArchivo = tipoArchivo;
        this.tamArhivo = tamArhivo;
        this.stringArchivo = stringArchivo;
    }


    public Documentos(String idIntegracion, String descripcion, String tipoArchivo, Integer tamArhivo, String stringArchivo) {
        this.idIntegracion = idIntegracion;
        this.descripcion = descripcion;
        this.tipoArchivo = tipoArchivo;
        this.tamArhivo = tamArhivo;
        this.stringArchivo = stringArchivo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getIdIntegracion() {
        return idIntegracion;
    }

    public void setIdIntegracion(String idIntegracion) {
        this.idIntegracion = idIntegracion;
    }

    public String getTipoArchivo() {
        return tipoArchivo;
    }

    public void setTipoArchivo(String tipoArchivo) {
        this.tipoArchivo = tipoArchivo;
    }

    public Integer getTamArhivo() {
        return tamArhivo;
    }

    public void setTamArhivo(Integer tamArhivo) {
        this.tamArhivo = tamArhivo;
    }

    public String getStringArchivo() {
        return stringArchivo;
    }

    public void setStringArchivo(String stringArchivo) {
        this.stringArchivo = stringArchivo;
    }

    public String getmPath() {
        return mPath;
    }

    public void setmPath(String mPath) {
        this.mPath = mPath;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }
}
