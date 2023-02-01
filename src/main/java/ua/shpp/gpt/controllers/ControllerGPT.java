package ua.shpp.gpt.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.shpp.gpt.models.Echo;

@RestController
@RequestMapping(value = "/GPT", produces = "application/json")
@Api(tags = "Controller API")
@Tag(name = "Controller API", description = "This controller manages the GPT chat...")
public class ControllerGPT {

    @PostMapping("/")
    @ApiOperation("this method tests controller")
    public ResponseEntity<Object> getEcho(String echo) {
        Echo firstEcho = new Echo(echo);
        return ResponseEntity.ok().body(firstEcho);
    }
}
