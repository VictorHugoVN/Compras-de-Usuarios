package com.Dev.UserShopping.controllers;

import com.Dev.UserShopping.DTO.UserDto;
import com.Dev.UserShopping.model.User;
import com.Dev.UserShopping.service.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public String getMensagem(){
        return "Spring boot is working!";
    }

    @GetMapping("/users")
    public List<UserDto> getUsers(){
        List<UserDto> usuarios = userService.getAll();
        return usuarios;
    }

    @GetMapping("/user/{id}")
    public UserDto findById(@PathVariable Long id){
        return userService.findById(id);
    }

    @PostMapping("/user")
    public UserDto newUser(@RequestBody UserDto userDto){
        return userService.save(userDto);
    }

    @GetMapping("user/cpf/{cpf}")
    public UserDto getUsersFiltro(@PathVariable String cpf){
        return userService.findByCpf(cpf);
    }

    @DeleteMapping("/user/{id}")
    public UserDto remover(@PathVariable Long id){
        return userService.delete(id);
    }

    @GetMapping("/user/search")
    public List<UserDto> queryByName(
            @RequestParam(name="nome", required=true)
            String nome
    ){
        return userService.queryByName(nome);
    }


    public static List<UserDto> usuarios = new ArrayList<UserDto>();
    @PostConstruct
    //Faz com que este método seja executado assim que a classe for inicializada.
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
