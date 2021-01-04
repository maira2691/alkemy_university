package com.alkemy.university.util;

import com.alkemy.university.model.User;
import com.github.javafaker.Faker;
import com.github.javafaker.Name;

import java.util.List;

public class FakeFactory_Impl implements FakeFactory_I{

    private Faker faker;
    private Name fakerName;


   /* @Override
    public User createUser() {
        String name = faker.funnyName().name();
        String lastName = fakerName.lastName();
        Integer dni =
        return new User(name, lastName, dni);
    }*/

    /*@Override
    public Perfil generarPerfil() {
        // TODO Auto-generated method stub
        String nombre = faker.funnyName().name();
        short edad = (short) faker.number().numberBetween(18, 60);
        String username = nombre.replaceAll("\\s","").toLowerCase() + edad + "@gmail.com";
        char genero;
        if((faker.number().randomDigit() % 2) == 0)
            genero = 'M';
        else
            genero = 'H';
        String descripcion = this.seleccionarDescripcion(genero);
        String imagen = this.seleccionarImagen(genero);
        return new Perfil(nombre,username,genero,edad,descripcion,imagen,null);
    }*/

    @Override
    public List<User> createNUsers(int number) {
        return null;
    }
}
