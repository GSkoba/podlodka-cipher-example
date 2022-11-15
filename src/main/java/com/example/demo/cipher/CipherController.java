package com.example.demo.cipher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cipher")
public class CipherController {

    @PostMapping("encrypt")
    public String encrypt(@RequestBody String plainText) {
        return CipherService.encrypt(plainText);
    }

    @PostMapping("decrypt")
    public String decrypt(@RequestBody String cipherText) {
        return CipherService.decrypt(cipherText);
    }
}
