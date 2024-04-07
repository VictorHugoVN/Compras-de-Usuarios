package com.Dev.UserShopping.controllers;

import com.Dev.UserShopping.DTO.UserDto;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @GetMapping
    public String getMensagem(){
        return "Spring boot is working!";
    }

    @GetMapping("/users")
    public List<UserDto> getUsers(){
        return usuarios;
    }

    @GetMapping("users/{cpf}")
    public UserDto getUsersFiltro(@PathVariable String cpf){
        for(UserDto user: usuarios){
            if(user.getCpf().equals(cpf)){
                return user;
            }
        }
        return null;
    }

    @PostMapping("/newUser")
    public UserDto inserir(@RequestBody UserDto userDto){
        userDto.setDataCadastro(new Date());
        usuarios.add(userDto);
        return userDto;
    }

    @DeleteMapping("/users/{cpf}")
    public boolean remover(@PathVariable String cpf){
        for(UserDto user: usuarios){
            if(user.getCpf().equals(cpf)){
                usuarios.remove(user);
                return true;
            }
        }
        return false;
    }


    public static List<UserDto> usuarios = new ArrayList<UserDto>();
    @PostConstruct
    public void initiateList(){
        UserDto userDto = new UserDto();
        userDto.setNome("Eduardo");
        userDto.setCpf("123");
        userDto.setEndereco("Rua a");
        userDto.setEmail("eduardo@gmail.com");
        userDto.setTelefone("1234-3454");
        userDto.setDataCadastro(new Date());

        UserDto userDto2 = new UserDto();
        userDto2.setNome("Luiz");
        userDto2.setCpf("456");
        userDto2.setEndereco("Rua b");
        userDto2.setEmail("luiz@gmail.com");
        userDto2.setTelefone("1234-3454");
        userDto2.setDataCadastro(new Date());

        UserDto userDto3 = new UserDto();
        userDto3.setNome("Bruna");
        userDto3.setCpf("678");
        userDto3.setEndereco("Rua c");
        userDto3.setEmail("bruna@gmail.com");
        userDto3.setTelefone("1234-3454");
        userDto3.setDataCadastro(new Date());

        usuarios.add(userDto);
        usuarios.add(userDto2);
        usuarios.add(userDto3);
    }


}
