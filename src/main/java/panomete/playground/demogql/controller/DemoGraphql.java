package panomete.playground.demogql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import panomete.playground.demogql.dto.DemoDto;

import java.sql.Timestamp;

@Controller
public class DemoGraphql {
    @QueryMapping
    public DemoDto getDemo(@Argument String name) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        if(name == null) {
            name = "World";
        }
        return new DemoDto(
            "1",
            name,
            "This is a demo",
            timestamp.toString(),
            timestamp.toString()
        );
    }
}
