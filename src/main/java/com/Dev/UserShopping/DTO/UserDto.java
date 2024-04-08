package com.Dev.UserShopping.DTO;

import com.Dev.UserShopping.model.User;

import java.util.Date;

public class UserDto {

    public String nome;
    public String cpf;
    public String endereco;
    public String email;
    public String telefone;
    public Date dataCadastro;

    public static UserDto convert(User user){
        UserDto userDto = new UserDto();
        userDto.setNome(user.getNome());
        userDto.setCpf(user.getCpf());
        userDto.setEndereco(user.getEndereco());
        userDto.setEmail(user.getEmail());
        userDto.setTelefone(user.getTelefone());
        userDto.setDataCadastro(user.getDataCadastro());
        return userDto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }
}
