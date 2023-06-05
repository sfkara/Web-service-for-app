package io.sfkara.mobile.controller;


import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/users")
public class UserController {


    @GetMapping(path = "/{userId}")
    public String getUser(@PathVariable String userId){
        return "get all user" + userId;
    }
    @GetMapping
    public String getUsers(@RequestParam(value = "page",defaultValue = "2") int page,
                           @RequestParam(value = "limit", defaultValue = "5") int limit){
        return "get user page = " + page + " limit = " + limit;
    }

    @PostMapping
    public String createUser(){
        return "create user";
    }
}
