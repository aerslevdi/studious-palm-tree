package com.example.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.List;

public class ActorDetalle implements Parcelable {
    //ATRIBUTOS

    private String nombre;
    private Integer imagen;

    //CONSTRUCTOR

    public ActorDetalle(String nombre, Integer imagen) {
        this.nombre = nombre;
        this.imagen = imagen;
    }

    //GETTER/SETTER


    protected ActorDetalle(Parcel in) {
        nombre = in.readString();
        if (in.readByte() == 0) {
            imagen = null;
        } else {
            imagen = in.readInt();
        }
    }

    public static final Creator<ActorDetalle> CREATOR = new Creator<ActorDetalle>() {
        @Override
        public ActorDetalle createFromParcel(Parcel in) {
            return new ActorDetalle(in);
        }

        @Override
        public ActorDetalle[] newArray(int size) {
            return new ActorDetalle[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public Integer getImagen() {
        return imagen;
    }

    @Override
    public String toString() {
        return "ActorDetalle{" +
                "nombre='" + nombre + '\'' +
                ", imagen=" + imagen +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        if (imagen == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeInt(imagen);
        }
    }
}
