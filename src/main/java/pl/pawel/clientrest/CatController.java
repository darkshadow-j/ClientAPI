package pl.pawel.clientrest;

import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

@Controller
public class CatController {

    public CatController() {

        RestTemplate restTemplate = new RestTemplate();
        Cat[] dane = restTemplate.getForObject("https://cat-fact.herokuapp.com/facts/random?animal_type=cat&amount=2", Cat[].class);
        for (Cat cat:
             dane
        ) {
            System.out.println(cat.getText());
        }
    }
}
