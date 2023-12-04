package panomete.playground.demogql.controller;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import panomete.playground.demogql.dto.DemoDto;
import panomete.playground.demogql.exception.DemoGraphqlException;

@Controller
public class DemoGraphql {
    @QueryMapping
    public DemoDto getDemo(@Argument String name) {
        switch (name) {
            case "not found" -> throw new DemoGraphqlException("data from graphql not found", 404);
            case "bad request" -> throw new DemoGraphqlException("data from graphql is bad form", 400);
            case "error" -> throw new DemoGraphqlException("external service currently down", 500);
            default -> throw new DemoGraphqlException("unknown error",999);
        }
    }
}
