package br.com.cursoudemy.productapi

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class StatusController {

    @GetMapping("status")
    public @ResponseEntity<HashMap<String, Object>> getApiStatus() {
        var response = new HashMap<String, Object>();

        response.put("", "")
    }
}